
package practica1s12017_201503925;

/**
 *
 * @author Sergio
 */
public class Cola {
    Nodo first,last;
    
    public Cola(){
        first=last=null;
    }    
    public void insertar(Object Dato){
         if(first==null){
            first=last=new Nodo(Dato);
        }else{
            last=last.next=new Nodo(Dato);
        }
    }
    public Object getFirst(){
        return first.getDato();
    }

    public Object extraer(){
        Object dato= first.getDato();
        first=first.getNext();
        return dato; 
    }
    
    public int getSize(){
        int tamanio = 0;
        Nodo temporal=first;
            while(temporal!=null){
                temporal=temporal.getNext();
                tamanio++;
            }       
        return tamanio;
    }
        
}
