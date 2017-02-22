
package practica1s12017_201503925;

/**
 *
 * @author Sergio
 */
public class ListaSimple {

    /**
     * @return the archivoDot
     */
    public String getArchivoDot() {
        return archivoDot;
    }

    /**
     * @param archivoDot the archivoDot to set
     */
    public void setArchivoDot(String archivoDot) {
        this.archivoDot = archivoDot;
    }
    
    Nodo first,last;
    private String archivoDot="Digraph grafo{\n";
    
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
    public void insertarFinal(Object Dato,Object dato2){
         if(first==null){
            first=last=new Nodo(Dato, dato2);
        }else{
            last=last.next=new Nodo(Dato,dato2);
        }
    }
    public void imprimir(){
        archivoDot="digraph grafo{\n";
        Nodo temporal= first;
        if(first!=null){
            while(temporal!=null){
                if(temporal.getNext()!=null){
                    archivoDot=archivoDot + "" + temporal.getDato() + "->" + temporal.getNext().getDato() + "; \n";
                }
                System.out.println(temporal.getDato());
                temporal=temporal.getNext();
            }
            archivoDot=archivoDot + "}";
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
            while(contador < index && temporal.getNext()!=null){
                temporal=temporal.getNext();
                contador++;
            }
        return temporal.getDato();
        }
        
    
    public void cambiar(int posicion, Object dato){
    int contador=0; Nodo temporal= first;
    
        while(contador<posicion){
            temporal=temporal.getNext();
            contador++;
        }
        temporal.setDato(dato);
    }   
}
