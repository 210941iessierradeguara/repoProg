import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;






public class AccesoBOODatos {
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public void conectar() {
		emf = Persistence.createEntityManagerFactory("db/jugadores.odb");
		em = emf.createEntityManager();
	}
	
	public void datosIniciales() {
		Pais p1= new Pais(1, "España");
		Pais p2= new Pais(2, "Portugal");
		Pais p3= new Pais(3, "Francia");
		Pais p4= new Pais(4, "Italia");
	
		Jugador j1= new Jugador ("Alberto Carrera", "voleibol", "Huesca", 44, p1);
		Jugador j2= new Jugador ("Luis Aldea", "fútbol", "Zaragoza", 35, p2);
		Jugador j3= new Jugador ("Mario Carrera", "baloncesto", "Huesca", 21, p1);
		Jugador j4= new Jugador ("Raquel Carrera", "baloncesto", "Huesca", 24, p1);
		Jugador j5= new Jugador ("Toño Mériz", "tenis", "Oporto", 45, p2);
		Jugador j6= new Jugador ("Lorenzo Blasco", "fútbol", "Lisboa", 46, p2);
		Jugador j7= new Jugador ("Nacho Garcés", "baloncesto", "Lisboa", 46, p2);
		Jugador j8= new Jugador ("Belén Carrera", "tenis", "Paris", 39, p3);
		Jugador j9= new Jugador ("Javier Escartín", "fútbol", "Toulouse", 44, p3);
		
		em.getTransaction().begin();
		em.persist(p1); em.persist(p2); em.persist(p3);em.persist(p4);
		em.persist(j1); em.persist(j2); em.persist(j3);em.persist(j4);
		em.persist(j5); em.persist(j6); em.persist(j7);em.persist(j8);
		em.persist(j9);
		em.getTransaction().commit();
		
	}
	public void desconectar() {
		em.close();
		emf.close();
	}
	//
	//
	//
	// COMPLETAR
	public boolean insertarPais(Pais p) {
		if(em.find(Pais.class, p.getId())==null) {
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
			return true;
		} else {
			return false;
		}
	}
	

} // de la clase AccesoBdatos 
