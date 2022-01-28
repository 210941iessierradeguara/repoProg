import java.util.Date;

public class Mensaje {
	private String emisor;
	private String texto;
	private Date fechaHoraCreacion;
	private Date fechaHoraMod;
	
	private void actualizarFechaHoraMod() {
		this.fechaHoraMod = new Date();
	}
	
	// Auto-Gen
	
	public Mensaje() {
		this.emisor = "emisor desconocido";
		this.texto = "Texto desconocido";
		this.fechaHoraCreacion = new Date();
		this.fechaHoraMod = new Date();
	}

	public Mensaje(String emisor, String texto) {
		super();
		this.emisor = emisor;
		this.texto = texto;
		this.fechaHoraCreacion = new Date();
		this.fechaHoraMod = new Date();
	}

	@Override
	public String toString() {
		return "Mensaje \n\t emisor= " + emisor + "\n\t texto= " + texto + "\n\t fecha= " + fechaHoraCreacion + "\n\t fecha modificación= " 
				+ fechaHoraMod;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
		actualizarFechaHoraMod();
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
		actualizarFechaHoraMod();
	}

	public Date getFechaHora() {
		return fechaHoraCreacion;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHoraCreacion = fechaHora;
	}
	
}
