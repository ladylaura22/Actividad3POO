package programa;
import java.time.LocalDate;


public class Profesor  extends Persona {
    private String codigoProfesor;
    private String asignatura;
    private double salario;
    private int experiencia;


    public Profesor(String nombre, String apellido, LocalDate fechaNacimiento, String genero, double estatura, double peso,
                    String codigoProfesor, String asignatura, double salario, int experiencia) {
        super(nombre, apellido, fechaNacimiento, genero, estatura, peso);
        this.codigoProfesor = codigoProfesor;
        this.asignatura = asignatura;
        this.salario = salario;
        this.experiencia = experiencia;

    }

    // Getters y Setters
    public String getCodigoProfesor() {
        return codigoProfesor;
    }

    public void setCodigoProfesor(String codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }


}
