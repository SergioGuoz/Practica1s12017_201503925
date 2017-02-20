/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12017_201503925;

import java.awt.GridLayout;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *
 * @author Sergio
 */
public class Juego extends javax.swing.JFrame {

    /**
     * Creates new form Juego
     */
    ListaCircular jugfichas= new ListaCircular();
    ListaSimple diccionario=new ListaSimple();
    ListaSimple posx=new ListaSimple();
    ListaSimple posy=new ListaSimple();
    ListaSimple val=new ListaSimple();
    int matriz=0;
    Cola cola= new Cola();
    Matriz m= new Matriz();
    int global=0;
    
    public Juego(ListaCircular jugfichas,int matriz,ListaSimple diccionario,
            ListaSimple posx,ListaSimple posy,ListaSimple val, Cola cola) {
        this.jugfichas=jugfichas;
        this.matriz=matriz;
        this.diccionario=diccionario;
        this.posx=posx;
        this.posy=posy;
        this.val=val;
        this.cola=cola;
        
        initComponents();
        
        //ImageIcon icono= new ImageIcon(getClass().getResource("fondoScrabble.jpg"));
        //Icon icon= new ImageIcon(icono.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        //jLabel1.setIcon(icon);
    }
    
    public void crearTablero(){
        System.out.println("MATRIZ "+matriz);
        m.crearMatriz(matriz, matriz);
        //jPanel1.setDropTarget(getDropTarget());
        jPanel1.setLayout(new GridLayout(matriz, matriz));
        
       for (int i = 0; i < matriz; i++) {
            for (int j = 0; j < matriz; j++) {
                JTextField txtfield= new JTextField();
                txtfield.setText("    ");
                m.insertar(txtfield, i, j);
                jPanel1.add(txtfield);
            }
        }
       jPanel1.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaDiccionario = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nuevaPalabra = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        diccionarioLista = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JugadoresLista = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        fichasCola = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableroMatriz = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        listaDiccionario.setText("Lista Diccionario");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setDragEnabled(true);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setDragEnabled(true);

        jTextField3.setEditable(false);
        jTextField3.setDragEnabled(true);

        jTextField4.setEditable(false);
        jTextField4.setDragEnabled(true);

        jTextField5.setEditable(false);
        jTextField5.setDragEnabled(true);

        jTextField6.setEditable(false);
        jTextField6.setDragEnabled(true);

        jTextField7.setEditable(false);
        jTextField7.setDragEnabled(true);

        jPanel1.setBackground(new java.awt.Color(172, 31, 31));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Turno de:");

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.setText("Jugador");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nueva Palabra");

        jScrollPane1.setViewportView(diccionarioLista);

        jTabbedPane1.addTab("Lista Diccionario", jScrollPane1);

        jScrollPane2.setViewportView(JugadoresLista);

        jTabbedPane1.addTab("Lista Jugadores", jScrollPane2);

        jScrollPane3.setViewportView(fichasCola);

        jTabbedPane1.addTab("Cola de Fichas", jScrollPane3);

        jScrollPane4.setViewportView(tableroMatriz);

        jTabbedPane1.addTab("Matriz Tablero", jScrollPane4);
        jTabbedPane1.addTab("Lista Fichas Activas", jScrollPane5);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Reportes");

        jButton2.setText("Validar Tiro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(nuevaPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(11, 11, 11))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(48, 48, 48)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name)
                                .addGap(229, 229, 229)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nuevaPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addGap(0, 157, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTabbedPane1)
                                .addContainerGap())))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        crearTablero();
        name.setText(jugfichas.getDato(global)+"");
        jTextField1.setText(jugfichas.getListaSimpe(global).Obtener(0)+"");
        jTextField2.setText(jugfichas.getListaSimpe(global).Obtener(1)+"");
        jTextField3.setText(jugfichas.getListaSimpe(global).Obtener(2)+"");
        jTextField4.setText(jugfichas.getListaSimpe(global).Obtener(3)+"");
        jTextField5.setText(jugfichas.getListaSimpe(global).Obtener(4)+"");
        jTextField6.setText(jugfichas.getListaSimpe(global).Obtener(5)+"");
        jTextField7.setText(jugfichas.getListaSimpe(global).Obtener(6)+"");
        //global++;
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            Jugar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        diccionario.insertarFinal(nuevaPalabra.getText()+"");
        diccionario.imprimir();
        imagenDiccionario();
        
    }//GEN-LAST:event_jButton3ActionPerformed
    public void Jugar(){
        
        name.setText(jugfichas.getDato(global)+"");
        jTextField1.setText(jugfichas.getListaSimpe(global).Obtener(0)+"");
        jTextField2.setText(jugfichas.getListaSimpe(global).Obtener(1)+"");
        jTextField3.setText(jugfichas.getListaSimpe(global).Obtener(2)+"");
        jTextField4.setText(jugfichas.getListaSimpe(global).Obtener(3)+"");
        jTextField5.setText(jugfichas.getListaSimpe(global).Obtener(4)+"");
        jTextField6.setText(jugfichas.getListaSimpe(global).Obtener(5)+"");
        jTextField7.setText(jugfichas.getListaSimpe(global).Obtener(6)+"");
        
        imagenDiccionario();
        jugfichas.getListaSimpe(global).imprimir();
        imagenJugadores(jugfichas.getDato(global)+"",jugfichas.getListaSimpe(global).getArchivoDot());

        global++;
    }
    
    public void imagenJugadores(String nombreJug,String contenido){
        PrintWriter write=null;
        try {
            String rutaArchivo="C:\\graphviz-2.38\\release\\EDD\\"+nombreJug+".dot";
            write = new PrintWriter(rutaArchivo);
            write.print(contenido);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            write.close();
        }
            ejecutar(nombreJug, nombreJug);
          ImageIcon iconoJ= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\"+nombreJug+".png");
          Icon icj= new ImageIcon(iconoJ.getImage());
            JugadoresLista.setIcon(icj);
    }
    
    public void imagenDiccionario(){
        
        
        //int cont=0;
        PrintWriter write=null;
        
        try {
            String rutaArchivo="C:\\graphviz-2.38\\release\\EDD\\diccionario.dot";
            write = new PrintWriter(rutaArchivo);
            //while(diccionario.Obtener(cont)!=null){
            write.print(diccionario.getArchivoDot());
            //}
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            write.close();
        }
            ejecutar("diccionario", "diccionario");
          ImageIcon icono= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\diccionario.png");
          Icon ic= new ImageIcon(icono.getImage());
            diccionarioLista.setIcon(ic);
    }
    
    public void ejecutar(String entrada, String salida){
        
        try {
            String[] cmd= new String[5];
            cmd[0]="C:\\graphviz-2.38\\release\\bin\\dot.exe";
            cmd[1]="-Tpng";
            cmd[2]="C:\\graphviz-2.38\\release\\EDD\\"+entrada+".dot";
            cmd[3]="-o";
            cmd[4]="C:\\graphviz-2.38\\release\\EDD\\"+salida+".png";
            Runtime rt=Runtime.getRuntime();
            rt.exec(cmd);
            System.out.println("IMAGEN EXITOSA");
        } catch (IOException ex) {
            System.err.println("ERROR CMD");
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JugadoresLista;
    private javax.swing.JLabel diccionarioLista;
    private javax.swing.JLabel fichasCola;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel listaDiccionario;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nuevaPalabra;
    private javax.swing.JLabel tableroMatriz;
    // End of variables declaration//GEN-END:variables
}
