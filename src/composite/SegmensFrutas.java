package composite;

public class SegmensFrutas implements Producto {

    private String Nombre;
    private double Precio;

    public SegmensFrutas(String nombre, double precio) {
        this.Nombre = nombre;
        this.Precio = precio;

    }

    public void add(Producto producto) {

    }

    public String getNombre() {

        return Nombre;
    }
public double getPrecio(){
        return Precio;
}
public void imprimir(){
    System.out.println("--------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("--------");

}

}
