
package practica1s12017_201503925;

/**
 *
 * @author Sergio
 */
public class Matriz {
    
    NodoMatriz first,last;
    int dimx=0, dimy=0;
    public Matriz(){
        first=last=null;
        
    }
    
    public void crearMatriz(int dimx, int dimy){
       
            
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
    public int sizeX(){
        return dimx;
    }
    public int sizeY(){
        return dimy;
    }
}
