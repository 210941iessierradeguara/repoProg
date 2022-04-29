package empleados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
//
// Alberto Carrera Martín - Abril 2020
//

public class AccesoBdatos {
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public void conectar() {
		emf = Persistence.createEntityManagerFactory("db/empleados.odb");
		em = emf.createEntityManager();
	}
	public void desconectar() {
		em.close();
		emf.close();
	}
	public DepartamentoEntity buscarDepartamento(int numDepartamento) {
		return em.find(DepartamentoEntity.class, numDepartamento);
	}// de método buscarDepartamento
	//
	@SuppressWarnings("deprecation")
	public void imprimirDepartamento (int numDepartamento) {
		DepartamentoEntity d = buscarDepartamento(numDepartamento);
		if (d==null)
			System.out.println("No existe el Departamento " + numDepartamento);
		else {
			Set <EmpleadoEntity> empleados =d.getEmpleados();
			String datos="Datos del departamento " + numDepartamento + ": ";
			datos+= "Nombre: " + d.getNombre() + " - Localidad: " + d.getLocalidad()+ "\n";
			if (empleados.isEmpty())
				datos+="No tiene empleados en este momento";
			else {			
				datos+="Lista de empleados"+ "\n";
				datos+="*******************";
			}
			for (EmpleadoEntity empleado :empleados) {
				datos+= "\nNúmero de empleado: " + empleado.getEmpnoId()+ "\n";
				datos+= "Nombre: " + empleado.getNombre()+ "\n";
				datos+= "Oficio: " + empleado.getOficio()+ "\n";
				if (empleado.getDirId()==null)
					datos+= "Jefe: No tiene"+ "\n";
				else
					datos+= "Jefe: "+ empleado.getDirId().getNombre()+ "\n";
				datos+= "Año de alta: " + (empleado.getAlta().getYear()+1900)+ "\n";	
				datos+= "Salario: "+ empleado.getSalario()+ "\n";
				if (empleado.getComision() ==null)
					datos+= "Comisión: No tiene"+ "\n";
				else
					datos+= "Comisión: "+ empleado.getComision()+ "\n";
			}
			
			System.out.println(datos);
		}
	} // de método imprimirDepartamento
	
	public boolean insertarDepartamento (DepartamentoEntity d) {
		if (buscarDepartamento(d.getDptoId())!=null)
			return false;
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		return true;
	} // de insertarDepartamento
	
	public boolean modificarDepartamento (DepartamentoEntity d) {
		DepartamentoEntity departamentoBuscado=buscarDepartamento(d.getDptoId());
		if (departamentoBuscado==null)
			return false;
		em.getTransaction().begin();
		departamentoBuscado.setNombre(d.getNombre());
		departamentoBuscado.setLocalidad(d.getLocalidad());
		em.persist (departamentoBuscado);
		em.getTransaction().commit();
		return true;
	} // de modificarDepartamento
	
	// Si tiene empleados lo borraría igual, dejando en estos el número de Departamento
	// pero el resto de los atributos del departamento a null. Por eso no dejo borrar
	
	public boolean borrarDepartamento  (int numDepartamento) {
		DepartamentoEntity departamentoBuscado=buscarDepartamento(numDepartamento);
		if (departamentoBuscado==null || !departamentoBuscado.getEmpleados().isEmpty() )
			return false;
		em.getTransaction().begin();
		em.remove(departamentoBuscado);
		em.getTransaction().commit();
		return true;
	} // de modificarDepartamento
	
	public void demoJPQL() {
		
		Query q1 = em.createQuery("SELECT COUNT(d) FROM DepartamentoEntity d");
        System.out.println("Total Departamentos: " + q1.getSingleResult());
        //
        TypedQuery<Long> tq1 = em.createQuery(
        	      "SELECT COUNT(d) FROM DepartamentoEntity d", Long.class);
        System.out.println("Total Departamentos: " + tq1.getSingleResult());
        //
        TypedQuery<DepartamentoEntity>tq2 =
	            em.createQuery("SELECT d FROM DepartamentoEntity d", DepartamentoEntity.class);
	        List<DepartamentoEntity> l2 = tq2.getResultList();
	        for (DepartamentoEntity r2 : l2) {
	            System.out.println("Nombre :  " + r2.getNombre()+ ", Localidad: "+ r2.getLocalidad());
	        }
	    //
        TypedQuery<Object[]>tq3 =
	            em.createQuery("SELECT d.nombre, d.localidad FROM DepartamentoEntity  d", Object[].class);
	        List<Object[]> l3 = tq3.getResultList();
	        for (Object[] r3 : l3) {
	            System.out.println(
	            "Nombre :  " + r3[0] + ", Localidad: " + r3[1]);
	    }    
	    //*/
	      TypedQuery<Object[]>tq4 =
		            em.createQuery("SELECT d.nombre, d.localidad FROM DepartamentoEntity d"
		            		+ " WHERE d.dptoId != :n", Object[].class);
	        		tq4.setParameter("n", 10);
		        List<Object[]> l4 = tq4.getResultList();
		        for (Object[] r4 : l4) {
		            System.out.println(
		            "Nombre :  " + r4[0] + ", Localidad: " + r4[1]);
		    }

				   System.out.println("\n 1. \n");
			       
		   
	         TypedQuery<Object[]> query =
	        		 em.createQuery("SELECT e.nombre, e.alta " + " FROM EmpleadoEntity e", Object[].class);
	         	List<Object[]> l5 = query.getResultList();
	         	for (Object[] l5b : l5) {
	 			   System.out.println(
	 					   l5b[0] + " - " + l5b[1]);
	 		   }
	         	
			   System.out.println("\n 2. \n");
		       
		   TypedQuery<Object[]> query2 = 
				   em.createQuery("SELECT e.nombre, e.alta " + " FROM EmpleadoEntity e " + " WHERE UPPER(e.nombre) LIKE '%CARRERA%'", Object[].class);
		   List<Object[]> l6b = query2.getResultList();
		   for (Object[] l6 : l6b) {
			   System.out.println(
					   l6[0] + " - " + l6[1]);
		   }

		   System.out.println("\n 3. \n");
	       
		   
		   TypedQuery<Object[]> query3 = 
				   em.createQuery("SELECT e.nombre, e.oficio, e.departamento.nombre " + " FROM EmpleadoEntity e " + " WHERE e.oficio = 'Empleado' AND e.departamento.nombre = 'I+D'", Object[].class);
		   List<Object[]> l7 = query3.getResultList();
		   for (Object[] l7b : l7) {
			   System.out.println(
					   l7b[0] + " - " + l7b[1] + " - " + l7b[2]);
		   }
		   
		   System.out.println("\n 4. \n");
		   
		   TypedQuery<Object[]> query4 = 
				   em.createQuery("SELECT e.nombre, e.alta " + " FROM EmpleadoEntity e " + " WHERE YEAR(e.alta) >= 2003", Object[].class);
		   List<Object[]> l8 = query4.getResultList();
		   for (Object[] l8b : l8) {
			   System.out.println(
					   l8b[0] + " - " + l8b[1]);
		   }
		   
		   System.out.println("\n 5. \n");
		   
		   TypedQuery<Object[]> query5 = 
				   em.createQuery("SELECT e.nombre, e.oficio " + " FROM EmpleadoEntity e " + " ORDER BY e.oficio ASC", Object[].class);
		   List<Object[]> l9 = query5.getResultList();
		   for (Object[] l9b : l9) {
			   System.out.println(
					   l9b[1] + " - " + l9b[0]);
		   }
		   
		   System.out.println("\n 6. \n");
		   
		   TypedQuery<Object[]> query6 = 
				   em.createQuery("SELECT e.departamento.nombre, count(e), SUM(e.salario), MAX(e.salario) " + " FROM EmpleadoEntity e " + " GROUP BY e.departamento.nombre", Object[].class);
		   List<Object[]> l10 = query6.getResultList();
		   for (Object[] l10b : l10) {
			   System.out.println(
					   l10b[0] + " - " + l10b[1] + " - " + l10b[2] + " - " + l10b[3]);
		   }
		   
		   System.out.println("\n 7. \n");
		   
		   TypedQuery<Object[]> query7 = 
				   em.createQuery("SELECT e.departamento.nombre, count(e), SUM(e.salario), MAX(e.salario) " + " FROM EmpleadoEntity e " + " GROUP BY e.departamento.nombre HAVING COUNT(e)>=5", Object[].class);
		   List<Object[]> l11 = query7.getResultList();
		   for (Object[] l11b : l11) {
			   System.out.println(
					   l11b[0] + " - " + l11b[1] + " - " + l11b[2] + " - " + l11b[3]);
		   }
		   
		   System.out.println("\n 8. \n");
		   
		   TypedQuery<Object[]> query8 = 
				   em.createQuery("SELECT e.nombre, e.dirId.nombre, e.departamento.dptoId " + " FROM EmpleadoEntity e " + " ORDER BY e.nombre ASC", Object[].class);
		   List<Object[]> l12 = query8.getResultList();
		   for (Object[] l12b : l12) {
			   System.out.println(
					   l12b[0] + " - " + " Su jefe es: " + " - " + l12b[1] + " - " + "Departamento" + " - " + l12b[2]);
		   }
		   
		   System.out.println("\n 9. \n");
		   
		   TypedQuery<Object[]> query9 = 
				   em.createQuery("SELECT e.departamento.nombre, count(e) " + " FROM EmpleadoEntity e " + " GROUP BY e.departamento.nombre", Object[].class);
		   List<Object[]> l13 = query9.getResultList();
		   for (Object[] l13b : l13) {
			   System.out.println(
					   l13b[0] + " - " + l13b[1]);
		   }
		   
		   System.out.println("\n 10. \n");
		   
		   TypedQuery<Object[]> query10 = 
				   em.createQuery("SELECT e.nombre, count(e2) " + " FROM DepartamentoEntity e LEFT JOIN e.empleados e2 " + " GROUP BY e.nombre", Object[].class);
		   List<Object[]> l14 = query10.getResultList();
		   for (Object[] l14b : l14) {
			   System.out.println(
					   l14b[0] + " - " + l14b[1]);
		   }
		   
		   System.out.println("\n 11. \n");
		   
		   TypedQuery<Object[]> query11 = 
				   em.createQuery("SELECT e.departamento.dptoId, e.nombre, e.salario " + " FROM EmpleadoEntity e " + " ORDER BY e.departamento.dptoId DESC, e.salario ASC", Object[].class);
		   List<Object[]> l15 = query11.getResultList();
		   for (Object[] l15b : l15) {
			   System.out.println(
					   l15b[0] + " - " + l15b[1] + " - " + l15b[2]);
		   }
		   
		   System.out.println("\n 12. \n");
		   
		   TypedQuery<Object[]> query12 = 
				   em.createQuery("SELECT e.empnoId, e.nombre " + " FROM EmpleadoEntity e " + " WHERE e.dirId IS NULL", Object[].class);
		   List<Object[]> l16 = query12.getResultList();
		   for (Object[] l16b : l16) {
			   System.out.println(
					   l16b[0] + " - " + l16b[1]);
		   }
		   
		   System.out.println("\n 13. \n");
		   
		   TypedQuery<Object[]> query13 = 
				   em.createQuery("SELECT e.dptoId, e.nombre " + " FROM DepartamentoEntity e LEFT JOIN e.empleados e2" + " WHERE 1039 MEMBER OF e2.empnoId", Object[].class);
		   List<Object[]> l17 = query13.getResultList();
		   for (Object[] l17b : l17) {
			   System.out.println(
					   l17b[0] + " - " + l17b[1]);
		   }
		   
	}// de demoJPQL
//--------------------------------------------------------------------------------------------------------------
	
} // de la clase
