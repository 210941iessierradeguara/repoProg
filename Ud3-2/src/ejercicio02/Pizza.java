package ejercicio02;

public class Pizza {
	private String tipo;
	private String tamanyo;
	private boolean servida = false;
	private String pedida = "pedida";
	public static int pedidas = 0;
	public static int servidas = 0;
	
	public Pizza(String tipo, String tamanyo) {
		this.tipo = tipo;
		this.tamanyo = tamanyo;
		pedidas++;
	}
	
	public void sirve() {
		if(this.servida != true) {
			this.pedida = "servida";
			servidas++;
			this.servida = true;
		}else {
			System.out.println("Esa pizza ya se ha servido");
		}
	}
	
	public static int getPedidas() {
		return pedidas;
	}

	public static int getServidas() {
		return servidas;
	}

	@Override
	public String toString() {
		return "Pizza " + tipo + ", " + tamanyo + ", " + pedida + "";
	}
}
