
package liststack;


public class Pila<T> {
    private Nodo<T> tope;
    private int nElementos;
    
   
    private class Nodo<T> {
        private T dato;
        private Nodo<T> sig;
            
        public Nodo(T dato) {
            this.dato = dato;
            this.sig = null;
        }    
    }
    
   
    public Pila() {
        this.tope = null;
        this.nElementos = 0;
    }

  
    public void push(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.sig = tope; 
        tope = nuevoNodo;     
        nElementos++;
    }


    public T pop() {
        if (vacia()) {
            throw new IllegalStateException("La pila esta vacia, no se puede hacer pop.");
        }
        T datoEliminado = tope.dato;
        tope = tope.sig; 
        nElementos--;
        return datoEliminado;
    }

 
    public T peek() {
        if (vacia()) {
            throw new IllegalStateException("La pila esta vacia, no hay elementos en el tope.");
        }
        return tope.dato;
    }


    public boolean vacia() {
        return tope == null;
    }


    public int size() {
        return nElementos;
    }
}
