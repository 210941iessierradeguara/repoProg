package defecto;

public class PruebaLista {

	public static void main(String[] args) {
		Lista l = new Lista();
		l.insertar(new Persona(1234567, 31, "A", "AA"));
		l.insertar(new Persona(2345678, 39, "B", "BB"));
		l.insertar(new Persona(3456789, 61, "C", "CC"));
		l.insertar(new Persona(4567890, 42, "D", "DD"));
		l.insertar(new Persona(5678901, 38, "E", "EE"));
		System.out.println(l.tamanyo());
		System.out.println(l.vacia());
		//System.out.println(l);
		System.out.println("****************************************************");
		System.out.println(l.buscarPorDni(1234567));
		System.out.println("****************************************************");
		System.out.println(l.borrarPersonaPorDni(2345678));
		System.out.println("****************************************************");
		//System.out.println(l);
		String encontrados = l.buscarPorApellido("E");
		if (encontrados.isEmpty())
			System.out.println("No encontrado nadie.");
		else
			System.out.println(encontrados);
		
		System.out.println("****************************************************");
		System.out.println(l.buscarPorApellido2("C"));
	}

}
