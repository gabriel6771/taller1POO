package punto1Taller.dominio;


public class Docente {
    //Attributes
    private String identificacion;
    private String nombre;
    private int edad;

    // metodos

    public Docente (String identificacion, String nombre){
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getIdentificacion(){return identificacion;}

    public String getNombre(){return nombre;}

    public int getEdad(){return edad;}
}

