package ejercicio01;

import java.util.Date;

public class Caballo {
	private String nombre;
	private String raza;
	private String sexo;
	private String capa;
	private String crin;
	private Date fechaNac;
	private int velocidad;
	private boolean careto;
	private boolean calcetines;
	private boolean mezcla;
	
	
	public Caballo() {
		
	}
	
	public Caballo(String nombre, String capa, String crin, String raza, String sexo, int velocidad, Date fechaNac ,boolean careto, boolean calcetines, boolean mezcla) {
		this.nombre = nombre;
		this.capa = capa;
		this.crin = crin;
		this.raza = raza;
		this.sexo = sexo;
		this.velocidad = velocidad;
		this.fechaNac = fechaNac;
		this.careto = careto;
		this.calcetines = calcetines;
		this.mezcla = mezcla;
	}
	
	public Caballo (String nombre, String capa, String crin, String raza, String sexo, int velocidad) {
		this.nombre = nombre;
		this.capa = capa;
		this.crin = crin;
		this.raza = raza;
		this.sexo = sexo;
		this.velocidad = velocidad;
	}

	public Caballo (String nombre, int velocidad) {
		this.nombre = nombre;
		this.velocidad = velocidad;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getCapa() {
		return capa;
	}

	public String getCrin() {
		return crin;
	}

	public boolean isCareto() {
		return careto;
	}

	public boolean isCalcetines() {
		return calcetines;
	}

	public String getRaza() {
		return raza;
	}

	public String getSexo() {
		return sexo;
	}

	public boolean isMezcla() {
		return mezcla;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	public void setCrin(String crin) {
		this.crin = crin;
	}

	public void setCareto(boolean careto) {
		this.careto = careto;
	}

	public void setCalcetines(boolean calcetines) {
		this.calcetines = calcetines;
	}

	public void setMezcla(boolean mezcla) {
		this.mezcla = mezcla;
	}

	public void salta() {
		System.out.println("El caballo salta.");
	}
	
	public void relincha() {
		System.out.println("hiiiiiiiii");
	}
	
	public Caballo compite (Caballo contrincante) {
		if(this.velocidad > contrincante.velocidad) {
			return this;
		}else {
			return contrincante;
		}
	}
	
	public void rumia(String comida) {
		if(comida.equals("heno") || comida.equals("Heno")) {
			System.out.println("El caballo come.");
		} else {
			System.out.println("el caballo ignora la comida.");
		}
	}
	

	@Override
	public String toString() {
		return "Caballo [nombre=" + nombre + ", raza=" + raza + ", sexo=" + sexo + ", capa=" + capa + ", crin=" + crin
				+ ", fechaNac=" + fechaNac + ", velocidad=" + velocidad + ", careto=" + careto + ", calcetines="
				+ calcetines + ", mezcla=" + mezcla + "]";
	}

	
	
}