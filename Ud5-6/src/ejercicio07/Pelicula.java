package ejercicio07;

public class Pelicula extends Multimedia{
	private String actorPrincipal;
	private String actrizPrincipal;
	
	public Pelicula(String titulo, String autor, String formato, double duracion, String actorPrincipal, String actrizPrincipal){
		super(titulo, autor, formato, duracion);
		this.actorPrincipal = actorPrincipal;
		this.actrizPrincipal = actrizPrincipal;
		// TODO Auto-generated constructor stub
		if(this.actorPrincipal == null && this.actrizPrincipal == null) {
			throw new IllegalArgumentException ("No se admiten los argumentos");
		}
	}

	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}

	public String getActrizPrincipal() {
		return actrizPrincipal;
	}

	public void setActrizPrincipal(String actrizPrincipal) {
		this.actrizPrincipal = actrizPrincipal;
	}

	@Override
	public String toString() {
		return super.toString() + "Pelicula [actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + "]";
	}
}
