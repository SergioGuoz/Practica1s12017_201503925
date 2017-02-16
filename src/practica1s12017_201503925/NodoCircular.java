
package practica1s12017_201503925;

/**
 *
 * @author Sergio
 */
public class NodoCircular {
    
    public NodoCircular next;
    private ListaSimple lista;
    Object  dato;
    
    public NodoCircular(ListaSimple lista, Object dato){
        this.lista=lista;
        this.dato=dato;
        next=null;
    }
    public NodoCircular(ListaSimple lista,Object dato,NodoCircular siguiente){
        this.lista=lista;
        this.dato=dato;
        next=siguiente;
    }
    
    public void setDato(Object dato){
        this.dato=dato;
    }
    public Object getDato(){
        return dato;
    }

    public NodoCircular getNext() {
        return next;
    }

    public void setNext(NodoCircular next) {
        this.next = next;
    }

    public ListaSimple getLista() {
        return lista;
    }


    public void setLista(ListaSimple lista) {
        this.lista = lista;
    }
    
}
