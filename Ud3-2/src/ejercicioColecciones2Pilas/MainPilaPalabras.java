package ejercicioColecciones2Pilas;

public class MainPilaPalabras {

	public static void main(String[] args) {
		PilaPalabras p = new PilaPalabras();
		p.apilarPalabra("Buenos d�as");
		p.apilarPalabra("Buenas Tardes");
		p.apilarPalabra("Bunas noches");
		System.out.println(p.imprimir());
		System.out.println("****************************************************");
		p.desapilarPalabra();
		System.out.println(p.imprimir());
		System.out.println("****************************************************");
		System.out.println(p.obtenerPalabraCima());
		p.pilaPalabrasVacia();
	}
}