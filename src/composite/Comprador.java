/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite;

public class Comprador {

    public static void main(String[] args) {

        Producto produc1 = new SegmensFrutas("Fruta1: ", 5000);
        Producto produc2 = new SegmensFrutas("Fruta2: ", 3000);
        Producto produc3 = new SegmensFrutas("Fruta3: ", 2500);
        Producto produc4 = new SegmensFrutas("Fruta4: ", 1500);
        Producto produc5 = new SegmensFrutas("Fruta5: ", 2100);

        Producto Fruts = new FrutasComposite("Frutas", 90000);
        Fruts.add(produc1);
        Fruts.add(produc2);
        Fruts.add(produc3);
        Fruts.add(produc4);
        Fruts.add(produc5);

        Producto FrutsGerneral = new FrutasComposite("Fruta Estrella", 150000);
        FrutsGerneral.add(Fruts);
        FrutsGerneral.imprimir();

    }

}
