
public class Comercial extends Empleado{
	private double ventasMensuales;
	
	
	@Override
	public double salarioTotal() {
		return this.getSalarioBase() + (this.ventasMensuales / 100);
	}
	
	
	public Comercial(String nombre, int edad, double salarioBase, double ventasMensuales) {
		super(nombre, edad, salarioBase);
		this.ventasMensuales = ventasMensuales;
	}

	public double getVentasMensuales() {
		return ventasMensuales;
	}

	public void setVentasMensuales(double ventasMensuales) {
		this.ventasMensuales = ventasMensuales;
	}

	@Override
	public String toString() {
		return "Comercial " + super.toString() + "ventasMensuales=" + ventasMensuales + "]";
	}
	
}
