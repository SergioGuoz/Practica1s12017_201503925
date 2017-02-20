
package practica1s12017_201503925;

/**
 *
 * @author Sergio
 */
public class Nodo {
    
    public Nodo next;
    private Object dato;
    private Object dato2;
    
    public Nodo(Object dato){
        this.dato=dato;
        next=null;
    }
    public Nodo(Object dato,Nodo siguiente){
        this.dato=dato;
        next=siguiente;
    }
    public Nodo(Object dato,Object dato2){
        this.dato=dato;
        this.dato2=dato2;
        next=null;
    }
    public Nodo(Object dato,Object dato2,Nodo siguiente){
        this.dato=dato;
        this.dato2=dato2;
        next=siguiente;
    }
    
    public void setDato(Object dato){
        this.dato=dato;
    }
    public Object getDato(){
        return dato;
    }
    public void setDato2(Object dato2){
        this.dato2=dato2;
    }
    public Object getDato2(){
        return dato2;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
}
