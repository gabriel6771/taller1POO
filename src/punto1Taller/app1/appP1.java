package punto1Taller.app1;

import punto1Taller.dominio.Asignatura;
import punto1Taller.dominio.Docente;
import punto1Taller.dominio.Estudiante;
import punto1Taller.dominio.Nota;

import java.util.Arrays;

public class appP1 {
    public static void main(String[] args) {
        Docente profesor = new Docente("1234","Alejando Ramirez");
        Asignatura poo = new Asignatura("POO", profesor);

        Estudiante lema = new Estudiante("34546", "Alejandro Lema");
        Nota notaLema = new Nota(poo);
        notaLema.setNotaParcial(3);
        notaLema.setNotaFinal(4.7);
        notaLema.setNotasSeguimiento(Arrays.asList(5.0, 1.0, 2.5, 4.0, 3.2));
        lema.setNota(notaLema);

        Estudiante melanie = new Estudiante("46564", "Melanie Giraldo");
        Nota notaMelanie = new Nota(poo);
        notaMelanie.setNotaParcial(4);
        notaMelanie.setNotaFinal(3.2);
        notaMelanie.setNotasSeguimiento(Arrays.asList(3.2, 2.5, 4.5, 2.0, 4.2));
        melanie.setNota(notaMelanie);

        Estudiante david = new Estudiante("68790", "David Ayala");
        Nota notaDavid = new Nota(poo);
        notaDavid.setNotaParcial(5);
        notaDavid.setNotaFinal(4.0);
        notaDavid.setNotasSeguimiento(Arrays.asList(4.2, 2.9, 4.5, 5.0, 4.7));
        david.setNota(notaDavid);

        poo.getEstudiantes().add(lema);
        poo.getEstudiantes().add(melanie);
        poo.getEstudiantes().add(david);

        calcularDefinitivaDelCurso(poo);

    }

    private static void calcularDefinitivaDelCurso(Asignatura curso) {
        for (Estudiante estudiante: curso.getEstudiantes()) {
            double definitiva = estudiante.getNota().calcularDefinitiva();

            if (definitiva < 3) {
                System.out.println(estudiante.getNombre() + " perdió " + curso.getNombre() + " porque sacó " + definitiva);
            } else {
                System.out.println(estudiante.getNombre() + " GANÓ " + curso.getNombre() + " porque sacó " + definitiva + " 🚀");
            }
        }
    }

}
