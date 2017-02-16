
package practica1s12017_201503925;

/**
 *
 * @author Sergio
 */
public class ListaCircular {
    NodoCircular first, last;
    int contador=0;
    
    public ListaCircular(){
        first=last=null;
    }
    
    public void insertarInicio(ListaSimple lista, Object dato){
        if(first==null){
            first=last=new NodoCircular(lista,dato);
        }else{
            first=new NodoCircular(lista, dato, first);
        }
        contador++;
    }
    public void insertarFinal(ListaSimple lista, Object dato){
         if(first==null){
            first=last=new NodoCircular(lista,dato);
        }else{
            last=last.next=new NodoCircular(lista, dato,first);
        }
         contador++;
    }
    public void imprimir(){
        NodoCircular temporal= first; 
        if(first!=null){
            while(temporal!=null){
                
                System.out.println(temporal.getDato());
                temporal.getLista().imprimir();
                temporal=temporal.getNext();
                if(temporal==first) break;
            } 
        }
    }
    
    public int getSize(){
        return contador;
    }
    
    public Object getDato(int index){
            int contador=0; 
        NodoCircular temporal = first;
        if(index-1>0){
            while(contador<index-1){
                if(temporal.getNext()!=null){          
                temporal=temporal.getNext();                
                }contador++;             
            }
            }
        return temporal.getDato();
        }
     public ListaSimple getListaSimpe(int index){
            int contador=0; 
        NodoCircular temporal = first;
        if(index-1>0){
            while(contador<index-1){
                if(temporal.getNext()!=null){          
                temporal=temporal.getNext();                
                }contador++;             
            }
            }
        return temporal.getLista();
        }
    
}
