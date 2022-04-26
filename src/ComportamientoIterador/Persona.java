package ComportamientoIterador;

public class Persona {

    //Atributos 
    public int Dni;
    public int Edad;

    //Constructir Vacio
    public Persona() {
    }

    //Constructor relleno 
    public Persona(int d, int e) {
        this.Dni = d;
        this.Edad = e;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

}
