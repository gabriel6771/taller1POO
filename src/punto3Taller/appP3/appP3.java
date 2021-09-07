package punto3Taller.appP3;

import punto3Taller.dominio.Agenda;
import punto3Taller.dominio.Persona;

public class appP3 {
    public static void main(String[] args) {

        Persona contactoUno = new Persona ("Juan","Patiño");
        Agenda NumeroCelUno = new Agenda(678989);

        Persona contactoDos = new Persona ("Pedro","Lopez");
        Agenda NumeroCelDos = new Agenda(561423);

        Persona contactoTres = new Persona ("Luis","Diaz");
        Agenda NumeroCelTres = new Agenda(56878);

        Persona contactoCuatro = new Persona ("lucas","Zapata");
        Agenda NumeroCelCuatro = new Agenda(678999);

        Persona contactoCinco = new Persona ("Ana","Florez");
        Agenda NumeroCelCinco = new Agenda(5541223);

        System.out.println("Agregar Contacto");


    }
}
