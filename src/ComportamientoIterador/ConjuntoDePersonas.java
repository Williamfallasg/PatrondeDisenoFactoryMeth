package ComportamientoIterador;

import java.util.Iterator;

public class ConjuntoDePersonas implements Iterable<Persona> {
    
    public Persona[] conjuntoPersonas; 
  
    public ConjuntoDePersonas(Persona[] p) { 
        conjuntoPersonas = p;
    }
    //Se emplea el iterador 
    public Iterator<Persona> iterator() {
        Iterator it = new MiIteratorPersona();
        return it;
    }

    protected class MiIteratorPersona implements Iterator<Persona> {

        protected int posicionarray;

        public MiIteratorPersona() {
            posicionarray = 0;
        }
        //Lee una linea y si la encuetra, se posiciona en la siguiente.
        public boolean hasNext() {
            boolean result;
            if (posicionarray < conjuntoPersonas.length) {
                result = true;
            } else {
                result = false;
            }
            return result;
        }
        
        public Persona next() {
            posicionarray++;
            return conjuntoPersonas[posicionarray - 1];
        }

        public void remove() {
            throw new UnsupportedOperationException("No soportado.");
        }
    }
}
