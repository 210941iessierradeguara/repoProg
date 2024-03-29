package varios;
// Alumno.java: una clase para representar alumnos

public class Alumno extends Persona {
  private int curso;

  // Constructor predeterminado
  public Alumno() {
    super();
    curso = 1;
  }

  // Constructor parametrizado
  public Alumno(long dni, int edad, String nombre, String apellidos, int curso) {
    super(dni, edad, nombre, apellidos);
    this.curso = curso;
  }

  // Accedente

  public int dameCurso() { return curso; }

  // Mutador

  public void ponCurso(int curso) { this.curso = curso; }

  // Otros m�todos

  public String toString() {
    return super.toString() + "Curso: " + curso + "\n";
  }

  public void leer() { // lectura de los datos del alumno
    super.leer();
    System.out.print("Curso: ");
    curso = MyInput.readInt();
  }
}
