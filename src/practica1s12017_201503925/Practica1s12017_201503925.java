
package practica1s12017_201503925;

import javax.swing.JFrame;

/**
 *
 * @author Sergio
 */
public class Practica1s12017_201503925 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Inicio ini= new Inicio();
        ini.setVisible(true);
        ini.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ini.setLocationRelativeTo(null);

        Matriz m= new Matriz();
        m.crearMatriz(5, 5);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                m.insertar("POSICION X "+i+" Y "+j, i, j);
            }
        }
    
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(m.obtener(i, j));
            }
        }
    }   
}