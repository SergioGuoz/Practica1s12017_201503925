
package practica1s12017_201503925;


public class NodoCola {
    
    public Nodo next;
    private Object dato;
    
    public void Nodo(Object dato){
        this.dato=dato;
        next=null;
    }
    public void Nodo(Object dato,Nodo siguiente){
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
