
package practica1s12017_201503925;

/**
 *
 * @author Sergio
 */
public class Cola {
    Nodo first,last;
    private String archivoDot="";
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
        if(first!=null){
            return first.getDato();
        }else{
            return null;
        }
        
    }

    public Object extraer(){
        Object dato;
        if(first!=null){
        dato= first.getDato();
        first=first.getNext();
        }else{
        dato=null;
        }
        return dato; 
    }
    
    public int getSize(){
        int tamanio = 0; archivoDot="digraph grafo{ \n"; 
        Nodo temporal=first;
            while(temporal!=null){
                if(temporal.getNext()!=null){
                    archivoDot=archivoDot+temporal.getDato()+tamanio+"->"+temporal.getNext().getDato()+(tamanio+1)+";\n";
                }
                temporal=temporal.getNext();
                tamanio++;
            }
            archivoDot=archivoDot+" }";
        return tamanio;
    }

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
        
}
