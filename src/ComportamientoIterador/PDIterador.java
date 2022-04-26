package ComportamientoIterador;

public class PDIterador {

    public static void main(String arg[]) {

        Persona p1 = new Persona(55, 35);

        Persona p2 = new Persona(44, 30);

        Persona p3 = new Persona(76, 25);

        Persona[] pp = {p1, p2, p3};

        ConjuntoDePersonas cp = new ConjuntoDePersonas(pp);

        for (Persona p : cp) {
            System.out.println("La persona :" + p.Dni + " tiene la edad de:" + p.Edad);
        }

    }

}
