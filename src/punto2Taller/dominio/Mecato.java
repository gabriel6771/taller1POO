package punto2Taller.dominio;

public class Mecato {
    //Attributes
    private String nombre;
    private int codigo;
    private int unidades;

    //Constructors
    public Mecato(String nombre, int codigo, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.unidades = cantidad;

    }
    //Methods

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }


    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

}
