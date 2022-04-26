package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FrutasComposite implements Producto {

    private String Nombre;
    private double Precio;

    public FrutasComposite(String nombre, double precio) {

        this.Nombre = nombre;
        this.Precio = precio;

    }
    List<Producto> productos = new ArrayList<Producto>();

    public void add(Producto producto) {

        productos.add(producto);
    }

    public String getNombre() {

        return Nombre;
    }

    public double getPrecio() {

        return Precio;

    }

    public void imprimir() {

        System.out.println("--------");
        System.out.println("Nombre : " + getNombre());
        System.out.println("Precio : " + getPrecio());
        System.out.println("--------");

        Iterator<Producto> productoIterator = productos.iterator();
        while (productoIterator.hasNext()) {
            Producto producto = productoIterator.next();
            producto.imprimir();

        }
    }

}
