package punto3Taller.dominio;

import java.util.ArrayList;

public class Agenda {
    //Atributos
    private int numeroCelular;
    private int cuentaDeContactos=0;
    private int capacidadDeAgenda= 20;
    private ArrayList<Persona> personas;


    // Constructores

    public Agenda(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public Agenda(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    // Metodos

    public boolean crearNuevoContacto( ) {

        if (this.capacidadDeAgenda < this.cuentaDeContactos){
            cuentaDeContactos ++;
            return true;

        }

        return false;
    }



    // get
    public int getNumeroCelular() {
        return numeroCelular;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public int getCuentaDeContactos() {
        return cuentaDeContactos;
    }


    public int getCapacidadDeAgenda() {
        return capacidadDeAgenda;
    }

    // set
    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
}
