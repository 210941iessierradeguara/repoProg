public class HolaMundo {
	static String mensaje = "Hola mundo";
	public static void main(String[] args) {
		Mensajes m = new Mensajes();
		m.setEmisor("Pepito");
		m.setCuerpo("PAYACHO");
		System.out.println(m);
	}
}
