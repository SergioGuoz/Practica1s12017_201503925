/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12017_201503925;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class Jugadores extends javax.swing.JFrame {
    ListaSimple diccionario=new ListaSimple();
    ListaSimple posx=new ListaSimple();
    ListaSimple posy=new ListaSimple();
    ListaSimple val=new ListaSimple();
    int Matriz=0;
    
    /**
     * Creates new form Jugadores
     */
    public Jugadores(int Matriz,ListaSimple diccionario,ListaSimple posx,ListaSimple posy,ListaSimple val) {
        initComponents();
        ingresarLetras();
        this.Matriz=Matriz;
        this.diccionario=diccionario;
        this.posx=posx;
        this.posy=posy;
        this.val=val;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese Nombre de Jugador");

        jButton1.setText("Agregar Jugador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1)))
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListaSimple fichas= new ListaSimple();
    
        for (int i = 0; i < 7; i++) {
            fichas.insertarFinal(cola.extraer());
        }
        jugadoresCircular.insertarFinal(fichas, jTextField1.getText());
        JOptionPane.showMessageDialog(null, "Jugador Agregado");
        System.out.println("*******************");
        jugadoresCircular.imprimir();
        //fichas.imprimir();
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Juego game= new Juego(jugadoresCircular,Matriz, diccionario, posx, posy, val, cola);
        game.setVisible(true);
        game.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    ListaCircular jugadoresCircular= new ListaCircular();
    Cola cola= new Cola();
    
    public void ingresarLetras(){
        int a=1,e=1,o=1,i=1,s=1,n=1,l=1,r=1,u=1,t=1;
        int d=1,g=1;
        int q=1,z=1;
        int dos=1, tres=1,cuatro=1,uno=1;
        
        while (true){
            if(cola.getSize()>=94){
                break;
            }
            Random random= new Random();
            random.nextInt(4);
            
            switch (random.nextInt(3)+1){
                case 1:
                    if(a<=6){
                    cola.insertar('A');
                    cola.insertar('E');
                    a++;
                    }
                     if(g<=2){
                    cola.insertar('G');
                    cola.insertar('B');
                    cola.insertar('M');
                    g++;
                     }
                    if(z<=1){
                    cola.insertar('Y');
                    cola.insertar('Q');
                    cola.insertar('J');
                    cola.insertar('Ñ');
                    z++;
                    }
                   
                    break;
                case 2:
                    if(i<=6){
                    cola.insertar('I');
                    cola.insertar('S');
                    i++;
                    }
                    if(n<=5){
                    cola.insertar('N');
                    cola.insertar('R');
                    cola.insertar('U');
                    cola.insertar('D');
                    n++;
                    }
                    if(e<=6){
                    cola.insertar('A');
                    if(dos<=2){
                        
                    cola.insertar('P');
                    cola.insertar('H');
                        }
                    if(uno<=1){
                    
                    cola.insertar('X');
                    cola.insertar('Z');
                    }
                    cola.insertar('E');
                    e++;
                    }
                    break;
                case 3:
                    if(l<=4){
                    cola.insertar('L');
                    cola.insertar('T');
                    cola.insertar('C');
                    l++;
                    }
                    if(o<=9){
                    cola.insertar('O');              
                    o++;
                    }
                    if(q<=1){
                    cola.insertar('F');
                    cola.insertar('V');
                    q++;
                    }
                    break;
            }
            
        }
    }
    
    public void valorLetra(char c){
        switch (c){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
    
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}