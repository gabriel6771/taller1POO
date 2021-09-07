package punto1Taller.dominio;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    //Attributes
    private String nombre;
    private int nroCreditos;
    private Docente docente;
    private List<Estudiante> estudiantes;

    //Constructors
    public Asignatura(String nombre, Docente docente) {
        this.nombre = nombre;
        this.docente = docente;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre () {return nombre;}

    public int getNumCreditos () {return nroCreditos;}

    public Docente getDocente () {return docente;}

    public List<Estudiante> getEstudiantes () {return estudiantes;}

    public void setNumCreditos(int numCreditos) {this.nroCreditos = numCreditos;}

    public void setDocente(Docente docente) {this.docente = docente;}

    public void setEstudiantes(List<Estudiante> estudiantes) {this.estudiantes = estudiantes;}
}
