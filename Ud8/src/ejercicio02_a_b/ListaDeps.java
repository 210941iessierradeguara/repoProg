package ejercicio02_a_b;
import java.util.ArrayList;
import java.util.List;

public class ListaDeps {
	private List<Departamento> lista = new ArrayList<Departamento>();
	public ListaDeps(){ }
	public void add(Departamento depar){
		lista.add(depar);
	}
	public List<Departamento> getListaPersonas() {
		return lista;
	}

}
