package relacionesUML;

public class Dinero {
	private double cantidad;
	private String moneda;
	
	public Dinero(double cantidad, String moneda) {
		super();
		this.cantidad = cantidad;
		this.moneda = moneda;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
}
