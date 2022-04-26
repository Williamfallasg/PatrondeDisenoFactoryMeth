
package FactoryMethod;


public abstract class PlaneKoibiCel { 
    private String celular; 

    public String getcelular() {
        return celular;
    }

    public void setcelular(String celular) {
        this.celular = celular;
    }
    
    public abstract void descripcionPaquete(); // Metodo para  describir el paquete 
}
