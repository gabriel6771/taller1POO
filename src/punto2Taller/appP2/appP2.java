package punto2Taller.appP2;

import punto2Taller.dominio.DispensadorMecato;
import punto2Taller.dominio.Mecato;

public class appP2 {
    public static void main(String[] args) {
        System.out.println("Punto 2");
        DispensadorMecato nuevo = new DispensadorMecato("nuevo");


        Mecato galleta = new Mecato("galleta", 1, 7);
        nuevo.agregarProducto(galleta);
        System.out.println(nuevo.getProducto().size());

        Mecato chocolatina = new Mecato("chocolatina", 2, 7);
        nuevo.agregarProducto(chocolatina);
        System.out.println(nuevo.getProducto().size());

        Mecato papas = new Mecato("papas", 3, 7);
        nuevo.agregarProducto(papas);
        System.out.println(nuevo.getProducto().size());

        Mecato choclitos = new Mecato("choclitos", 4, 7);
        nuevo.agregarProducto(choclitos);
        System.out.println(nuevo.getProducto().size());

        Mecato doritos = new Mecato("doritos", 5, 7);
        nuevo.agregarProducto(doritos);
        System.out.println(nuevo.getProducto().size());

        Mecato deTodito = new Mecato("deTodito", 6, 7);
        nuevo.agregarProducto(deTodito);
        System.out.println(nuevo.getProducto().size());

        Mecato cheetos = new Mecato("cheetos", 7, 7);
        nuevo.agregarProducto(cheetos);
        System.out.println(nuevo.getProducto().size());

        Mecato platanos = new Mecato("platanos", 8, 5);
        nuevo.agregarProducto(platanos);
        System.out.println(nuevo.getProducto().size());

        Mecato maizitos = new Mecato("maizitos", 9, 1);
        nuevo.agregarProducto(maizitos);
        System.out.println(nuevo.getProducto().size());

        Mecato jet = new Mecato("jet", 10, 7);
        nuevo.agregarProducto(jet);
        System.out.println(nuevo.getProducto().size());

        Mecato festival = new Mecato("festival", 1, 7);
        nuevo.agregarProducto(festival);
        System.out.println(nuevo.getProducto().size());

        nuevo.obtenerProducto(jet, 5);
        nuevo.obtenerProducto(jet, 5);

        nuevo.consultarAgotados();

        nuevo.totalUnidades(cheetos);

        nuevo.totalProductos();

        nuevo.aumentarUnidades(platanos, 2);
        nuevo.totalUnidades(platanos);

    }
}
