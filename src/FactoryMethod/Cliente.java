
package FactoryMethod;


public class Cliente {

   
    public static void main(String[] args) {
        int tipodePlan= 1;  // Aqui se define el tipo plan por adquirir 
        
        
        
        PlaneKoibiCel plan=new PlaneKoibiCelFactory ().getPaquete(tipodePlan);
        plan.setcelular("87507272");
        String celular= plan.getcelular();
        System.out.println("Su numero es " +celular+ " tiene el plan : " );
        plan.descripcionPaquete();
    }
    
}
