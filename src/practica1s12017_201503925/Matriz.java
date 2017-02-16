
package practica1s12017_201503925;

/**
 *
 * @author Sergio
 */
public class Matriz {
    
    NodoMatriz first,last;
    
    public Matriz(){
        first=last=null;
    }
    
    public void insertar(Object dato, int x, int y){
         
        if(first==null){
            first=new NodoMatriz(dato);
        }else{
            first = new NodoMatriz(dato, last, first, last, last);
        }
    }
    
    public void obtener(int x,int y){
    
    }
    
}
