package punto3Taller.dominio;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;

    // Constructores
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //get

    public String getNombre(String alejo) {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
