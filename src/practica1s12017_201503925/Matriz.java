
package practica1s12017_201503925;

import javax.swing.JTextField;

/**
 *
 * @author Sergio
 */
public class Matriz {
    
    NodoMatriz first,last;
    int dimx=0, dimy=0;
    
    String archivo="Digraph{";
    
    public Matriz(){
        first=last=null;
        
    }
    
    public void crearMatriz(int dimx, int dimy){
        this.dimx=dimx;
        this.dimy=dimy;
            
            NodoMatriz nuevo,actual;
            
            //Ingreso de primera Fila
                actual=first=new NodoMatriz("");
                for (int j = 0; j < dimy-1; j++) {
                    while (actual.getDerecha()!=null) {
                        actual=actual.getDerecha();
                    }
                nuevo=new NodoMatriz("", actual, null, null, null);    
                actual.setDerecha(nuevo);
                }
                
              
                //INGRESO DE FILAS
                for (int i = 0; i < dimx-1; i++) {
                    actual=first;
                        while(actual.getAbajo()!=null){
                            actual=actual.getAbajo();
                        }
                        if(actual.getAbajo()==null){
                            
                            nuevo=new NodoMatriz("",null, null, actual, null);
                            actual.setAbajo(nuevo);
                            actual=actual.getAbajo();
                        } 
                     //Ingreso de Filas Siguientes
                    for (int h = 0; h<dimy-1; h++) {
                        while (actual.getDerecha()!=null) {
                        actual=actual.getDerecha();
                        }
                        //posible nullo
                        nuevo=new NodoMatriz("", actual, null, actual.getArriba().getDerecha(), null);    
                        actual.setDerecha(nuevo);
                        actual.getArriba().getDerecha().setAbajo(nuevo);
                    }
        
                }
           
    }
    
    public void insertar(Object dato, int x, int y){
         int auxx=0; int auxy=0;
        NodoMatriz posicion=first;
         while (auxx<x) {      
            posicion=posicion.getDerecha();
            auxx++;
        }
         while(auxy<y){
             posicion=posicion.getAbajo();
             auxy++;
         }
         posicion.setDato(dato);
    }
    public void insertarT(JTextField dato, int x, int y){
         int auxx=0; int auxy=0;
        NodoMatriz posicion=first;
         while (auxx<x) {      
            posicion=posicion.getDerecha();
            auxx++;
        }
         while(auxy<y){
             posicion=posicion.getAbajo();
             auxy++;
         }
         posicion.setDatoJ(dato);
    }
    
    public Object obtener(int x,int y){
        int auxx=0; int auxy=0;
        NodoMatriz posicion=first;
        while (auxx<x) {            
            posicion=posicion.getDerecha();
            auxx++;
        }
         while(auxy<y){
             posicion=posicion.getAbajo();
             auxy++;
         }
        return posicion.getDato();
    }
    public Object obtenerJ(int x,int y){
        int auxx=0; int auxy=0;
        NodoMatriz posicion=first;
        while (auxx<x) {            
            posicion=posicion.getDerecha();
            auxx++;
        }
         while(auxy<y){
             posicion=posicion.getAbajo();
             auxy++;
         }
        return posicion.getDatoJ();
    }
    public int sizeX(){
        return dimx;
    }
    public int sizeY(){
        return dimy;
    }
    private String archivoDot="";

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
    
    public String archivoDot(){
    
        archivoDot="digraph grafo{ \n";
        NodoMatriz posicion=first,temporal=first;
        JTextField aux=new JTextField();
        JTextField aux2=new JTextField();
        int col=0, fil=0;
        int cont=0;
        while (posicion.getDerecha()!=null) {
            //aux=(JTextField)posicion.getDatoJ();
            //aux2=(JTextField)posicion.getDerecha().getDatoJ();
            
            archivoDot=archivoDot+posicion.getDatoJ().getText()+fil+col+"->"+posicion.getDerecha().getDatoJ().getText()+fil+(col+1)+";\n";
            //archivoDot=archivoDot+aux2.getText()+fil+","+col+"->"+aux.getText()+fil+","+col+";\n";
            
            posicion=posicion.getDerecha();
            if(posicion.getDerecha()==null&&posicion.getAbajo()!=null){
                posicion=first;
                fil++; col=0;
                while(cont<fil){
                posicion=posicion.getAbajo();
                cont++;
                }
                cont=0;
            }col++;
            }
            fil=0;col=0; cont=0;
            posicion=first;
            while(posicion.getAbajo()!=null){
                while(posicion.getDerecha()!=null){
                     aux=(JTextField)posicion.getDatoJ();
                    aux2=(JTextField)posicion.getAbajo().getDatoJ();
                    archivoDot=archivoDot+posicion.getAbajo().getDatoJ().getText()+fil+col+"->"+posicion.getAbajo().getDatoJ().getText()+(fil+1)+col+";\n";
                    posicion=posicion.getDerecha();
                    col++;
                }fil++;col=0;
                //posicion=posicion.getAbajo();
                posicion=first;
                while(cont<fil){
                posicion=posicion.getAbajo();
                cont++;
                }cont=0;
            }
        System.out.println(archivoDot);
        archivoDot=archivoDot+"}";
        return archivoDot;
    }
}
