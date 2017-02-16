
package practica1s12017_201503925;

/**
 *
 * @author Sergio
 */
public class NodoMatriz {
    
    
    private NodoMatriz left;
    private NodoMatriz right;
    private NodoMatriz down;
    private NodoMatriz up;
    private Object dato;
    
    public NodoMatriz(Object dato){
        this.dato=dato;
        this.left=null;
        this.right=null;
        this.up=null;
        this.down=null;
    }
    public NodoMatriz(Object dato,NodoMatriz left,NodoMatriz right,NodoMatriz up,NodoMatriz down){
        this.dato=dato;
        this.left=left;
        this.right=right;
        this.up=up;
        this.down=down;
    }
    
    public void setDato(Object dato){
        this.dato=dato;
    }
    public Object getDato(){
        return dato;
    }
    
    public NodoMatriz getLeft() {
        return left;
    }

    public void setLeft(NodoMatriz left) {
        this.left = left;
    }
    public NodoMatriz getRight() {
        return right;
    }
    public void setRight(NodoMatriz right) {
        this.right = right;
    }

    public NodoMatriz getDown() {
        return down;
    }

    public void setDown(NodoMatriz down) {
        this.down = down;
    }

    public NodoMatriz getUp() {
        return up;
    }

    public void setUp(NodoMatriz up) {
        this.up = up;
    }
}
