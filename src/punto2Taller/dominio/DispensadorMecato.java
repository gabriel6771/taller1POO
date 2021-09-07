package punto2Taller.dominio;

import java.util.ArrayList;

public class DispensadorMecato {
    //Attributes
    private String marca;
    private ArrayList<Mecato> producto;
    private int nroProductos = 0;
    private int capacidad = 10;



    //Constructors
    public DispensadorMecato(String marca) {
        this.marca = marca;
        this.producto = new ArrayList<Mecato>();
    }

    //Methods

    public void agregarProducto(Mecato nombre) {

        if (this.nroProductos<this.capacidad && nombre.getUnidades()<=8) {

            this.producto.add(nombre);
            this.nroProductos++;
            System.out.println("Producto agregado.");
        }else if(nombre.getUnidades()>8) {
            System.out.println("Cantidad del producto no permitida.");
        }else {
            System.out.println("M�quina llena.");
        }
    }

    public void obtenerProducto(Mecato nombre, int cantidad) {

        if (nombre.getUnidades()>0 && nombre.getUnidades()>=cantidad && this.producto.contains(nombre)) {
            nombre.setUnidades(nombre.getUnidades()-cantidad);
            System.out.println("Producto obtenido.");
        }else if (nombre.getUnidades()<cantidad && this.producto.contains(nombre)) {
            System.out.println("No hay suficientes unidades.");
        }else if (nombre.getUnidades()<=0 && this.producto.contains(nombre)) {
            System.out.println("Unidades agotadas.");
        }else {
            System.out.println("El producto no existe.");
        }
    }

    public void consultarAgotados() {
        for (int i = 0; i < this.producto.size(); i++) {
            if (this.producto.get(i).getUnidades()==0) {
                System.out.println("El producto " +this.producto.get(i).getNombre()+ " est� agotado.");
            }
        }
    }

    public void totalUnidades(Mecato nombre) {
        int inde=-1;
        for (int i = 0; i < this.producto.size(); i++) {
            if (this.producto.get(i).equals(nombre)) {
                inde = i;
                break;
            }
        }
        System.out.println("El producto "+this.producto.get(inde).getNombre()+" contiene "+this.producto.get(inde).getUnidades()+" unidades.");

    }

    public void totalProductos() {
        for (int i = 0; i < this.producto.size(); i++) {
            System.out.println("El producto " +this.producto.get(i).getNombre()+ " contiene " +this.producto.get(i).getUnidades()+ " unidades disponibles.");
        }
    }

    public void aumentarUnidades(Mecato nombre, int cantidad) {
        int ind=-1;
        for (int i = 0; i < this.producto.size(); i++) {
            if (this.producto.get(i).equals(nombre)) {
                ind = i;
            }
        }
        if (this.producto.get(ind).getUnidades()+cantidad<=8 && ind!=-1) {
            this.producto.get(ind).setUnidades(nombre.getUnidades()+cantidad);
            System.out.println("Se agregaron "+cantidad+ " unidades al producto "+producto.get(ind).getNombre());
        }else {
            System.out.println("Unidades excedidas.");
        }
    }


    //Getters and Setters
    public ArrayList<Mecato> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Mecato> producto) {
        this.producto = producto;
    }

    public String getMarca() {
        return marca;
    }
    public int getNroProductos() {
        return nroProductos;
    }
}
