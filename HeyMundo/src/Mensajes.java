import java.util.Date;

public class Mensajes {
	// F2 Codium = Shift+ALT+r eclipse
	private String emisor;
	private String cuerpo;
	private Date fechaHoraCreacion;
	private Date fechaHoraMod;
	private String destinatario;

	private void actualizarFechaHoraMod() {
		this.fechaHoraMod = new Date();
	}
	
	// Auto-Gen
	
	public Mensajes() {
		this.emisor = "emisor desconocido";
		this.cuerpo = "Texto desconocido";
		this.fechaHoraCreacion = new Date();
		this.fechaHoraMod = new Date();
	}

	public Mensajes(String emisor, String texto) {
		super();
		this.emisor = emisor;
		this.cuerpo = texto;
		this.fechaHoraCreacion = new Date();
		this.fechaHoraMod = new Date();
	}

	@Override
	public String toString() {
		return "Mensaje \n\t emisor= " + emisor + "\n\t texto= " + cuerpo + "\n\t fecha= " + fechaHoraCreacion + "\n\t fecha modificación= " 
				+ fechaHoraMod;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
		actualizarFechaHoraMod();
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String texto) {
		this.cuerpo = texto;
		actualizarFechaHoraMod();
	}

	public Date getFechaHora() {
		return fechaHoraCreacion;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHoraCreacion = fechaHora;
	}
	
	
}
