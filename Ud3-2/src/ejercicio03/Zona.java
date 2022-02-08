package ejercicio03;

public class Zona {
	private int entradasPorVender;
	
	public Zona(int n) {
		entradasPorVender = n;
	}
	
	public int getEntradasPorVender() {
		return entradasPorVender;
	}

	public void vender(int n) {
		if (this.entradasPorVender == 0) {
			System.out.println("Las entradas para esa zona est�n agotadas.");
		} else if (this.entradasPorVender < n) {
			System.out.println("S�lo quedan " + this.entradasPorVender + " entradas para esta zona");
		}
		
		if(this.entradasPorVender >= n) {
			entradasPorVender -= n;
			System.out.println("Aqu� tiene sus " + n + " entradas gracias.");
		}
	}
}
