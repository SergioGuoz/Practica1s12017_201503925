
package practica1s12017_201503925;

/**
 *
 * @author Sergio
 */
public class NodoMatriz {

 
    
    private NodoMatriz izquierda;
    private NodoMatriz derecha;
    private NodoMatriz abajo;
    private NodoMatriz arriba;
    private Object dato;
    
    public NodoMatriz(Object dato){
        this.dato=dato;
        this.izquierda=null;
        this.derecha=null;
        this.arriba=null;
        this.abajo=null;
    }
    public NodoMatriz(){
    }
    public NodoMatriz(Object dato,NodoMatriz left,NodoMatriz right,NodoMatriz up,NodoMatriz down){
        this.dato=dato;
        this.izquierda=left;
        this.derecha=right;
        this.arriba=up;
        this.abajo=down;
    }
    
    public void setDato(Object dato){
        this.dato=dato;
    }
    public Object getDato(){
        return dato;
    }
    
       /**
     * @return the izquierda
     */
    public NodoMatriz getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(NodoMatriz izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the derecha
     */
    public NodoMatriz getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(NodoMatriz derecha) {
        this.derecha = derecha;
    }

    /**
     * @return the abajo
     */
    public NodoMatriz getAbajo() {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(NodoMatriz abajo) {
        this.abajo = abajo;
    }

    /**
     * @return the arriba
     */
    public NodoMatriz getArriba() {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(NodoMatriz arriba) {
        this.arriba = arriba;
    }
    
    
}
