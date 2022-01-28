public class HolaMundo {
	static String mensaje = "Hola mundo";
	public static void main(String[] args) {
		Mensaje m = new Mensaje();
		m.setEmisor("Pepito");
		m.setTexto("PAYACHO");
		System.out.println(m);
	}
}
