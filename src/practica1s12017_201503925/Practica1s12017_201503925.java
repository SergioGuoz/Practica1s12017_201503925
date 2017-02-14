/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12017_201503925;

/**
 *
 * @author Sergio
 */
public class Practica1s12017_201503925 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaSimple lista= new ListaSimple();
        
        lista.insertarFinal("Hola");
        lista.insertarFinal("Maribel");
        lista.insertarFinal("Peluchote :3");
        lista.insertarFinal(14);
        lista.insertarFinal("de Febrero");
        lista.insertarInicio(":*");
        lista.insertarInicio("Quiero Alitas");
        
        lista.imprimir();
        System.out.println("Tamaño de la lista "+lista.getSize());
    }
    
}
