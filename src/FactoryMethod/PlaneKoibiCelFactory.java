
package FactoryMethod;


public class PlaneKoibiCelFactory {
    
    public PlaneKoibiCel getPaquete (int  tipodePlan) { // aqui retorna a un objeto de tipo PlaneKoibiCe ( Plan1, Plan2 , Plan3)
        if (tipodePlan == 1) {
            return new  Plan1 ();   
        }
        if (tipodePlan == 2) {
            return new  Plan2 (); 
        }
        if ( tipodePlan == 3) {
            return new  Plan3 (); 
        }
        return null;
    }

}