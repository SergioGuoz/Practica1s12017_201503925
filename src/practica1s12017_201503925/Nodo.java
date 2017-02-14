
package practica1s12017_201503925;

/**
 *
 * @author Sergio
 */
public class Nodo {
    
    public Nodo next;
    private Object dato;
    
    public Nodo(Object dato){
        this.dato=dato;
        next=null;
    }
    public Nodo(Object dato,Nodo siguiente){
        this.dato=dato;
        next=siguiente;
    }
    
    public void setDato(Object dato){
        this.dato=dato;
    }
    public Object getDato(){
        return dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
}
