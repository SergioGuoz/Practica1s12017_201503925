/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12017_201503925;

import java.awt.Desktop;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author Sergio
 */
public class Juego extends javax.swing.JFrame implements Runnable{

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
    ListaSimple punteo=new ListaSimple();
    Thread h= new Thread();
    
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
                m.insertarT(txtfield, i, j);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        JugadoresLista = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        fichasCola = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableroMatriz = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        fichasActivas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diccionarioLista = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        diccionarioHTML = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        score = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();

        listaDiccionario.setText("Lista Diccionario");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setDragEnabled(true);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setDragEnabled(true);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setDragEnabled(true);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setDragEnabled(true);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setDragEnabled(true);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setDragEnabled(true);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setDragEnabled(true);

        jPanel1.setBackground(new java.awt.Color(172, 31, 31));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
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

        jScrollPane2.setViewportView(JugadoresLista);

        jTabbedPane1.addTab("Lista Jugadores", jScrollPane2);

        jScrollPane3.setViewportView(fichasCola);

        jTabbedPane1.addTab("Cola de Fichas", jScrollPane3);

        jScrollPane4.setViewportView(tableroMatriz);

        jTabbedPane1.addTab("Matriz Tablero", jScrollPane4);

        jScrollPane5.setViewportView(fichasActivas);

        jTabbedPane1.addTab("Lista Fichas Activas", jScrollPane5);

        jScrollPane1.setViewportView(diccionarioLista);

        jTabbedPane1.addTab("Lista Diccionario", jScrollPane1);

        jScrollPane6.setViewportView(diccionarioHTML);

        jTabbedPane1.addTab("Reporte", jScrollPane6);

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

        jButton4.setText("Reportes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        score.setColumns(20);
        score.setRows(5);
        jScrollPane8.setViewportView(score);

        jButton5.setText("Finalizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton4)
                                    .addGap(9, 9, 9))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nuevaPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jButton3))
                                    .addGap(65, 65, 65)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel3))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
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
                            .addComponent(jButton2)
                            .addComponent(jButton4)
                            .addComponent(jButton5))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        timerTask.run();
        crearTablero();
        name.setText(jugfichas.getDato(global)+"");
        jTextField1.setText(jugfichas.getListaSimpe(global).Obtener(0)+"");
        jTextField2.setText(jugfichas.getListaSimpe(global).Obtener(1)+"");
        jTextField3.setText(jugfichas.getListaSimpe(global).Obtener(2)+"");
        jTextField4.setText(jugfichas.getListaSimpe(global).Obtener(3)+"");
        jTextField5.setText(jugfichas.getListaSimpe(global).Obtener(4)+"");
        jTextField6.setText(jugfichas.getListaSimpe(global).Obtener(5)+"");
        jTextField7.setText(jugfichas.getListaSimpe(global).Obtener(6)+"");
        
        for (int i = 0; i < jugfichas.getSize(); i++) {
            punteo.insertarFinal(0);
        }
        String aux="";
        for (int i = 0; i < jugfichas.getSize(); i++) {
            aux=aux+jugfichas.getDato(i)+" "+punteo.Obtener(i)+"\n";
        }
        score.setText(aux);
        //imagenDiccionario();
        //jugfichas.getListaSimpe(global).imprimir();
        //imagenfichasAc(jugfichas.getDato(global)+"",jugfichas.getListaSimpe(global).getArchivoDot());
        //imagenJugadores();
        //imagenCola();
        //archivoMatriz();
        //global++;
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        System.out.println("Seleccionaste "+evt.getActionCommand());
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(cola.getFirst()!=null){
        //Acepta la Palabra
        
        palabraAceptada();
        //Crea Archivo Dot de la Matriz
        m.archivoDot();
        //Juego
        
        Jugar();
        
        String aux="";
        for (int i = 0; i < jugfichas.getSize(); i++) {
            aux=aux+jugfichas.getDato(i)+" "+punteo.Obtener(i)+"\n";
        }
        System.out.println(aux);
        score.setText(aux);
        
        }else{
        JOptionPane.showMessageDialog(null, "El Juego ha finalizado \n"+"Punteo Ganador: "+buscarGanador());
           
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public int buscarGanador(){
        int mayor=0;
        for (int i = 0; i < punteo.getSize(); i++) {
            if(Integer.parseInt(punteo.Obtener(i)+"")>mayor){
                mayor=Integer.parseInt(punteo.Obtener(i)+"");
            }
        }
        return mayor;
    }
    public int indicePalabra(int glo){
        String a= jugfichas.getDato(glo)+"";
        int indice=0;
        for (int i = 0; i < jugfichas.getSize(); i++) {
            if(jugfichas.getDato(i).equals(a)){
                indice=i;
            }
        }
        return indice;
    }
    
    public void palabraAceptada(){
        String fila="",columna="";
        JTextField aux; boolean error=false;
        //PALABRA HORIZONTAL
        for (int i = 0; i < matriz; i++) {
            for (int j = 0; j < matriz; j++) {
                aux=(JTextField)m.obtenerJ(i, j);
                fila=fila+aux.getText(); System.out.println("FILA: "+aux.getText());
                fila=fila.replace(" ", "");
                if(matriz-1==j){
                    for (int k = 0; k < diccionario.getSize(); k++) {
                        if(diccionario.Obtener(k).toString().equalsIgnoreCase(fila)){
                            JOptionPane.showMessageDialog(null, "Palabra Coincide con diccionario");
                            int auxPunteo=Integer.parseInt(punteo.Obtener(indicePalabra(global))+"")+ obtenerPunteo(fila);

                            punteo.cambiar(indicePalabra(global), auxPunteo);
                            fila="";
                            error=true;
                                if((jTextField1.getText().replace(" ", "")).isEmpty()){
                                    jugfichas.getListaSimpe(global).cambiar(0, cola.extraer());
                                }if((jTextField2.getText().replace(" ", "")).isEmpty()){
                                    jugfichas.getListaSimpe(global).cambiar(1, cola.extraer());
                                }if((jTextField3.getText().replace(" ", "")).isEmpty()){
                                    jugfichas.getListaSimpe(global).cambiar(2, cola.extraer());
                                }if((jTextField4.getText().replace(" ", "")).isEmpty()){
                                    jugfichas.getListaSimpe(global).cambiar(3, cola.extraer());
                                }if((jTextField5.getText().replace(" ", "")).isEmpty()){
                                    jugfichas.getListaSimpe(global).cambiar(4, cola.extraer());
                                }if((jTextField6.getText().replace(" ", "")).isEmpty()){
                                    jugfichas.getListaSimpe(global).cambiar(5, cola.extraer());
                                }if((jTextField7.getText().replace(" ", "")).isEmpty()){
                                    jugfichas.getListaSimpe(global).cambiar(6, cola.extraer());
                                }
                        }
                    }
                }
                
                }fila=""; 
            }if(error==false){
                JOptionPane.showMessageDialog(null, "Palabra Incorrecta");
              }error=false;
        //PALABRA VERTICAL
        for (int i = 0; i < matriz; i++) {
            for (int j = 0; j < matriz; j++) {
                aux=(JTextField)m.obtenerJ(j, i);
                columna=columna+aux.getText();
                columna=columna.replace(" ", "");
                if(matriz==j-1){
                    for (int k = 0; k < diccionario.getSize(); k++) {
                        if(diccionario.Obtener(k).toString().equalsIgnoreCase(columna)){
                            JOptionPane.showMessageDialog(null, "Palabra Coincide con diccionario");
                            //OBTENER PUNTEO
                            int auxPunteo=Integer.parseInt(punteo.Obtener(indicePalabra(global))+"")+ obtenerPunteo(columna);
                            punteo.cambiar(indicePalabra(global),auxPunteo);
                            columna="";
                        error=true;
                        if((jTextField1.getText().replace(" ", "")).isEmpty()){
                                    jugfichas.getListaSimpe(global).cambiar(0, cola.extraer());
                                }if((jTextField2.getText().replace(" ", "")).isEmpty()){
                                    jugfichas.getListaSimpe(global).cambiar(1, cola.extraer());
                                }if((jTextField3.getText().replace(" ", "")).isEmpty()){
                                    jugfichas.getListaSimpe(global).cambiar(2, cola.extraer());
                                }if((jTextField4.getText().replace(" ", "")).isEmpty()){
                                    jugfichas.getListaSimpe(global).cambiar(3, cola.extraer());
                                }if((jTextField5.getText().replace(" ", "")).isEmpty()){
                                    jugfichas.getListaSimpe(global).cambiar(4, cola.extraer());
                                }if((jTextField6.getText().replace(" ", "")).isEmpty()){
                                    jugfichas.getListaSimpe(global).cambiar(5, cola.extraer());
                                }if((jTextField7.getText().replace(" ", "")).isEmpty()){
                                    jugfichas.getListaSimpe(global).cambiar(6, cola.extraer());
                                }
                        }else if(k==diccionario.getSize()-1&&error==false){
                            JOptionPane.showMessageDialog(null, "Palabra Incorrecta");
                        }
                    }
                }
                
                }columna="";
                
            }
        String aux2="";
        for (int i = 0; i < jugfichas.getSize(); i++) {
            aux2=aux2+jugfichas.getDato(i)+" "+punteo.Obtener(i)+"\n";
        }
        System.out.println(aux2);
        score.setText(aux2);        
        
        
    
    }
    
    public int obtenerPunteo(String cadena){
        int nota=0;
        
        for (int i = 0; i < cadena.length(); i++) {
            char c=cadena.charAt(i);
            switch (c) {
                case 'A':
                case 'E':
                case 'O':
                case 'I':
                case 'S':
                case 'N':
                case 'L':
                case 'R':
                case 'U':
                case 'T':
                    nota=nota+1;
                    break;
                case 'D':
                case 'G':        
                    nota=nota+2;
                    break;
                case 'C':
                case 'B':
                case 'M':
                case 'P':
                    nota=nota+3;
                    break;
                case 'H':
                case 'F':
                case 'V':
                case 'Y':
                    nota=nota+4;
                    break;
                case 'Q':
                    nota=nota+5;
                    break;
                case 'J':
                case 'Ñ':
                case 'X':
                    nota=nota+8;
                    break;
                case 'Z':
                    nota=nota+10;
                    break;
                default:
                    break;
            }
        }
        
        return nota;
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        diccionario.insertarFinal(nuevaPalabra.getText()+"");
        diccionario.imprimir();
        imagenDiccionario();
        try {
            diccionarioHTML.setPage(getClass().getResource("\\reporteDiccionario.html"));
        } catch (IOException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        lanzarNavegador("reporte.html");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Inicio inicio= new Inicio();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    public void Jugar(){
        
        global++;
        //FICHAS
        
        name.setText(jugfichas.getDato(global)+"");
        jTextField1.setText(jugfichas.getListaSimpe(global).Obtener(0)+"");
        jTextField2.setText(jugfichas.getListaSimpe(global).Obtener(1)+"");
        jTextField3.setText(jugfichas.getListaSimpe(global).Obtener(2)+"");
        jTextField4.setText(jugfichas.getListaSimpe(global).Obtener(3)+"");
        jTextField5.setText(jugfichas.getListaSimpe(global).Obtener(4)+"");
        jTextField6.setText(jugfichas.getListaSimpe(global).Obtener(5)+"");
        jTextField7.setText(jugfichas.getListaSimpe(global).Obtener(6)+"");
        
        //CREACION DE REPORTES
        imagenDiccionario();
        jugfichas.getListaSimpe(global).imprimir();
        imagenfichasAc(jugfichas.getDato(global)+"",jugfichas.getListaSimpe(global).getArchivoDot());
        Reportes(jugfichas.getDato(global)+"");
        imagenJugadores();
        imagenCola();
        archivoMatriz();
        //Siguiente Jugador
        
    }
    public void archivoMatriz(){
        JTextField txtfield= new JTextField();
        JTextField txtfield2= new JTextField();
        JTextField txtfield3= new JTextField();
        JTextField txtfield4= new JTextField();
        
        
        String dot= "digraph grafo{ \n";
        for (int i = 0; i < matriz; i++) {
            for (int j = 0; j < matriz-1; j++) {
                txtfield=(JTextField)m.obtenerJ(i, j);
                txtfield2=(JTextField)m.obtenerJ(i, j+1);
                txtfield3=(JTextField)m.obtenerJ(i-1, j);
                txtfield4=(JTextField)m.obtenerJ(i-1, j+1);
                //RELACION FILAS
                
                if(i==0){
                dot=dot+txtfield.getText()+i+j+"->"+txtfield2.getText()+i+(j+1)+"; \n";
                dot=dot+txtfield2.getText()+i+(j+1)+"->"+txtfield.getText()+i+j+"; \n";
                }else{
                //RELACION COLUMNAS
                
                dot=dot+txtfield.getText()+i+j+"->"+txtfield2.getText()+i+(j+1)+"; \n";
                dot=dot+txtfield2.getText()+i+(j+1)+"->"+txtfield.getText()+i+j+"; \n";
                
                //RELACION ARRIBA ABAJO
                dot=dot+txtfield.getText()+i+j+"->"+txtfield3.getText()+(i-1)+j+"; \n";
                dot=dot+txtfield3.getText()+(i-1)+j+"->"+txtfield.getText()+i+j+"; \n";
                
                //dot=dot+txtfield2.getText()+"->"+txtfield4.getText()+"; \n";
                //dot=dot+txtfield4.getText()+"->"+txtfield2.getText()+"; \n";
                
                }
                
            }

        }
                    
            
            PrintWriter write=null;
        try {
            dot=dot+"}";
            String rutaArchivo="C:\\graphviz-2.38\\release\\EDD\\matriz.dot";
            write = new PrintWriter(rutaArchivo);
            write.print(dot);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            write.close();
        }
            ejecutar("matriz","matriz");
          
            ImageIcon iconoMatriz= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\matriz.png");
          Icon icMatriz= new ImageIcon(iconoMatriz.getImage());
         tableroMatriz.setIcon(icMatriz);
          System.out.println(dot);
    }

    public void imagenfichasAc(String nombreJug,String contenido){
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
            
            PrintWriter writer=null;
        try {
            String rutaArchivo="C:\\graphviz-2.38\\release\\EDD\\actual.dot";
            writer = new PrintWriter(rutaArchivo);
            writer.print(contenido);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            writer.close();
        }
            ejecutar("actual", "actual");
            
          ImageIcon iconoJ= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\"+nombreJug+".png");
          Icon icj= new ImageIcon(iconoJ.getImage());
           fichasActivas.setIcon(icj);
    }
    public void imagenJugadores(){
        
        String jugDot="digraph grafo{\n";
        int aux=0;
        while(aux<jugfichas.getSize()){
            jugDot=jugDot+jugfichas.getDato(aux)+"->"+jugfichas.getDato(aux+1)+"; \n";
            aux++;
        }
        jugDot=jugDot+"}";
        
        PrintWriter write=null;
        try {
            String rutaArchivo="C:\\graphviz-2.38\\release\\EDD\\circular.dot";
            write = new PrintWriter(rutaArchivo);
            write.print(jugDot);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            write.close();
        }
        
            ejecutar("circular", "circular");
          ImageIcon iconoCirc; 
                  iconoCirc= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\circular.png");
          Icon iconCirc= new ImageIcon(iconoCirc.getImage());
            JugadoresLista.setIcon(iconCirc);
    }
    
    public void imagenCola(){
        cola.getSize();
        PrintWriter write=null;
        try {
            String rutaArchivo="C:\\graphviz-2.38\\release\\EDD\\cola.dot";
            write = new PrintWriter(rutaArchivo);
            write.print(cola.getArchivoDot());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            write.close();
        }
            ejecutar("cola", "cola");
            
          ImageIcon iconoCola;
          iconoCola= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\cola.png");
          Icon iconC= new ImageIcon(iconoCola.getImage());
            fichasCola.setIcon(iconC);
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
          
       //   JLabel mat= new JLabel();
       //   JScrollPane aux= new JScrollPane(); 
          
            
          ImageIcon icono; 
          icono= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\diccionario.png");
          Icon ic= new ImageIcon(icono.getImage());
            diccionarioLista.setIcon(ic);
            diccionarioLista.repaint();
            
      //      mat.setIcon(ic);
      
      //      aux.add(mat);
      //      jTabbedPane1.addTab("Diccionario", aux);
            
        try {
            diccionarioHTML.setPage(getClass().getResource("reporteDiccionario.html"));
        } catch (IOException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public void Reportes(String jugador) 
        {
            try {
            
            String archivoSalida = "reporte.html";
            
            FileWriter fichero= new FileWriter(archivoSalida);
        try (PrintWriter print = new PrintWriter(fichero)) {
            print.println("<!DOCTYPE html>");
            print.println("<html>");
            print.println("<head>");
            print.println("<title>Estructuras de Datos </title>");
            print.println("<meta charset=\"utf-8\"/>");
            print.println("<link rel=\"stylesheet\" type\"text/css\" href=\"estiloss.css\">");
            print.println("</head>");
            print.println("<body>");
            print.println("	<header>");
            print.println("<h1> REPORTES</h1>");
            print.println("</header>");
            print.println("<section>");
            print.println("<article>");
            print.println("<h2>EDD</h2>");
            print.println("<h3></h3>");
            print.println("</article>");
            print.println("<article>");
            print.println("<div id=\"texto\"> ");
            print.println("<table>");
            print.println("<tr style=\"color:red; font-weight: bold;\"><td>REPORTE</td><td>-</td></tr>");
            
            //
            print.println("<tr><td>MATRIZ</td><td>****REPORTE***</td><td></tr>");
            print.println("<tr><td colspan=\"2\"> <img src=\"C:\\graphviz-2.38\\release\\EDD\\matriz.png \"</td><tr>");
            
            print.println("<tr><td>JUGADORES</td><td>****REPORTE***</td><td></tr>");
            print.println("<tr><td colspan=\"2\"> <img src=\"C:\\graphviz-2.38\\release\\EDD\\circular.png \"</td><tr>");
            
            print.println("<tr><td>DICCIONARIO</td><td>****REPORTE***</td><td></tr>");
            print.println("<tr><td colspan=\"2\"> <img src=\"C:\\graphviz-2.38\\release\\EDD\\diccionario.png \"</td><tr>");
            
            print.println("<tr><td>COLA</td><td>****REPORTE***</td><td></tr>");
            print.println("<tr><td colspan=\"2\"> <img src=\"C:\\graphviz-2.38\\release\\EDD\\cola.png \"</td><tr>");
            
            print.println("<tr><td>Fichas Jugador: "+jugador+"</td><td>****REPORTE***</td><td></tr>");
            print.println("<tr><td colspan=\"2\"> <img src=\"C:\\graphviz-2.38\\release\\EDD\\"+jugador+".png \"</td><tr>");
            
            print.println("</table>");
            print.println("</div>");
            print.println("</article>");
            print.println("</section>");
            print.println("</body>");
            print.println("</html>");
        }

            String estilo = "estiloss.css";
            
            FileWriter fichero2= new FileWriter(estilo);
        try (PrintWriter archivoCSS = new PrintWriter(fichero2)) {
            archivoCSS.println("*{ margin: 0px 0px 0px 0px; }" +
                    "body{"
                    + "}"
                    + "header{"
                    + "height:140px; width:1095px;"
                    + "text-align:center;"
                    + "margin-left: 220px;"
                    + "color:white;"
                    + "padding-top:20px;"
                    + "}"
                    + "header h1{"
                    + "margin:0px 0px 0px 0px;"
                    + "background-color:black;"
                    + "width:500px; "
                    + "text-align:center;"
                    + "opacity:0.7;"
                    + "}"
                    + "section{"
                    + "background-color:black;"
                    + "width:775px;"
                    + "margin-left: 220px;"
                    + "float: left;"
                    + "opacity:0.7;"
                    + "}"
                    + "article{"
                    + "color:white;"
                    + "text-align:left;"
                    + "text-align:justify;"
                    + "margin-left:50px;"
                    + "margin-right: 50px;"
                    + "}"
                    + "article div{"
                    + "text-align: center;"
                    + "}"
                    + "h2{"
                    + "color:yellow;"
                    + "}"
                    + "table {"
                    + "border:1px solid black;"
                    + "border-collapse:separate;"
                    + "border-spacing:5px;"
                    + "width:530px;"
                    + "height:auto;"
                    + "}"); }


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            }
        
        }
    
    private static void lanzarNavegador(String html) {
	       Desktop desktop = null;
	if (Desktop.isDesktopSupported()) {
		desktop = Desktop.getDesktop();
		if (desktop.isSupported(Desktop.Action.BROWSE)) {
			try {
				File f = new File(html);
				desktop.browse(f.toURI());
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JugadoresLista;
    private javax.swing.JTextPane diccionarioHTML;
    private javax.swing.JLabel diccionarioLista;
    private javax.swing.JLabel fichasActivas;
    private javax.swing.JLabel fichasCola;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
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
    private javax.swing.JTextArea score;
    private javax.swing.JLabel tableroMatriz;
    // End of variables declaration//GEN-END:variables

    TimerTask timerTask= new TimerTask() {
            @Override
            public void run() {
                ImageIcon icono; 
          icono= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\diccionario.png");
          Icon ic= new ImageIcon(icono.getImage());
            diccionarioLista.setIcon(ic);
        ImageIcon iconoCola;
          iconoCola= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\cola.png");
          Icon iconC= new ImageIcon(iconoCola.getImage());
            fichasCola.setIcon(iconC);
        ImageIcon iconoCirc; 
                  iconoCirc= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\circular.png");
          Icon iconCirc= new ImageIcon(iconoCirc.getImage());
            JugadoresLista.setIcon(iconCirc);
        ImageIcon iconoJ= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\actual.png");
          Icon icj= new ImageIcon(iconoJ.getImage());
           fichasActivas.setIcon(icj);
                
            }
        };
    
    @Override
    public void run() {
        ImageIcon icono; 
          icono= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\diccionario.png");
          Icon ic= new ImageIcon(icono.getImage());
            diccionarioLista.setIcon(ic);
        ImageIcon iconoCola;
          iconoCola= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\cola.png");
          Icon iconC= new ImageIcon(iconoCola.getImage());
            fichasCola.setIcon(iconC);
        ImageIcon iconoCirc; 
                  iconoCirc= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\circular.png");
          Icon iconCirc= new ImageIcon(iconoCirc.getImage());
            JugadoresLista.setIcon(iconCirc);
        ImageIcon iconoJ= new ImageIcon("C:\\graphviz-2.38\\release\\EDD\\actual.png");
          Icon icj= new ImageIcon(iconoJ.getImage());
           fichasActivas.setIcon(icj);
    }
}
