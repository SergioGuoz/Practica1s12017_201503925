
package practica1s12017_201503925;

/**
 *
 * @author Sergio
 */
public class ListaSimple {
    
    Nodo first,last;
    
    public ListaSimple(){
        first=last=null;
    }
    
    public void insertarInicio(Object Dato){
        if(first==null){
            first=last=new Nodo(Dato);
        }else{
            first=new Nodo(Dato,first);
        }
    }
    public void insertarFinal(Object Dato){
         if(first==null){
            first=last=new Nodo(Dato);
        }else{
            last=last.next=new Nodo(Dato);
        }
    }
    public void imprimir(){
        Nodo temporal= first;
        if(first!=null){
            while(temporal!=null){
                System.out.println(temporal.getDato());
                temporal=temporal.getNext();
            } 
        }
    }
    
    public int getSize(){
        Nodo temporal=first;
        int contador=0;
        while(temporal!=null){
            temporal=temporal.getNext();
            contador++;
        }
        return contador;
    }
    
    public Object Obtener(int index){
            int contador=0; 
        Nodo temporal = first;
        if(index-1>0){
            while(contador<index-1){
                if(temporal.getNext()!=null){          
                temporal=temporal.getNext();                
                }contador++;             
            }
            }
        return temporal.getDato();
        }
    
    
}
