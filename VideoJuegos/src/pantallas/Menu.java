/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author votarola
 */
public class Menu extends javax.swing.JFrame {
    static Object lblusu;

    ResultSet rs = null;
    PreparedStatement pst=null;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        centrar();
         
        
    }

    final void centrar (){
    
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelINGRESOSTOCK = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCANTIDADJUEGOS = new javax.swing.JTextField();
        jButtonINGRESOSTOCKJUEGOS = new javax.swing.JButton();
        jTextFieldTIPOJUEGOS = new javax.swing.JTextField();
        jTextFieldNOMBREJUEGOS = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbproductos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanelVERSTOCK = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbproductos1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jTextField2BUSCARJUEGO = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanelVENTAS = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCANTIDADVENTA = new javax.swing.JTextField();
        jTextFieldTOTALVENTA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1PRECIO = new javax.swing.JTextField();
        jButtonVENTAJUEGO = new javax.swing.JButton();
        jTextField2NOMBREJUEGO = new javax.swing.JTextField();
        jButton5TOTALVENTA = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbprecio = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        cmd_SignOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre Juego");

        jLabel2.setText("Tipo de Juego");

        jLabel3.setText("Cantidad Ingreso");

        jTextFieldCANTIDADJUEGOS.setToolTipText("");
        jTextFieldCANTIDADJUEGOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCANTIDADJUEGOSKeyTyped(evt);
            }
        });

        jButtonINGRESOSTOCKJUEGOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pantallas/Button-Refresh-icon (1).png"))); // NOI18N
        jButtonINGRESOSTOCKJUEGOS.setText("Actualizar Stock");
        jButtonINGRESOSTOCKJUEGOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINGRESOSTOCKJUEGOSActionPerformed(evt);
            }
        });

        jTextFieldTIPOJUEGOS.setToolTipText("");
        jTextFieldTIPOJUEGOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTIPOJUEGOSKeyReleased(evt);
            }
        });

        jTextFieldNOMBREJUEGOS.setToolTipText("");
        jTextFieldNOMBREJUEGOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNOMBREJUEGOSKeyReleased(evt);
            }
        });

        tbproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbproductos);

        jButton2.setText("Ver Stock");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pantallas/ok-icon (1).png"))); // NOI18N
        jButton3.setText("Ingresar Stock");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelINGRESOSTOCKLayout = new javax.swing.GroupLayout(jPanelINGRESOSTOCK);
        jPanelINGRESOSTOCK.setLayout(jPanelINGRESOSTOCKLayout);
        jPanelINGRESOSTOCKLayout.setHorizontalGroup(
            jPanelINGRESOSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelINGRESOSTOCKLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelINGRESOSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(jPanelINGRESOSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldCANTIDADJUEGOS, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTIPOJUEGOS, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNOMBREJUEGOS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelINGRESOSTOCKLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButton3)
                .addGap(59, 59, 59)
                .addComponent(jButtonINGRESOSTOCKJUEGOS)
                .addContainerGap(278, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelINGRESOSTOCKLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(154, 154, 154))
        );
        jPanelINGRESOSTOCKLayout.setVerticalGroup(
            jPanelINGRESOSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelINGRESOSTOCKLayout.createSequentialGroup()
                .addGroup(jPanelINGRESOSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelINGRESOSTOCKLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanelINGRESOSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelINGRESOSTOCKLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jPanelINGRESOSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldCANTIDADJUEGOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanelINGRESOSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelINGRESOSTOCKLayout.createSequentialGroup()
                                    .addGroup(jPanelINGRESOSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldTIPOJUEGOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGap(42, 42, 42))
                                .addGroup(jPanelINGRESOSTOCKLayout.createSequentialGroup()
                                    .addGroup(jPanelINGRESOSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldNOMBREJUEGOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addGap(82, 82, 82))))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelINGRESOSTOCKLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(6, 6, 6)))
                .addGroup(jPanelINGRESOSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButtonINGRESOSTOCKJUEGOS))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ingreso Stock", jPanelINGRESOSTOCK);

        jButton1.setText("Ver Stock");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbproductos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tbproductos1);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pantallas/Windows-Magnifier-icon.png"))); // NOI18N
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField2BUSCARJUEGO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2BUSCARJUEGOKeyReleased(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pantallas/print-icon.png"))); // NOI18N
        jButton7.setText("Imprimir Stock");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVERSTOCKLayout = new javax.swing.GroupLayout(jPanelVERSTOCK);
        jPanelVERSTOCK.setLayout(jPanelVERSTOCKLayout);
        jPanelVERSTOCKLayout.setHorizontalGroup(
            jPanelVERSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVERSTOCKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVERSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVERSTOCKLayout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())
                    .addGroup(jPanelVERSTOCKLayout.createSequentialGroup()
                        .addComponent(jTextField2BUSCARJUEGO, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(jButton7)
                        .addGap(124, 124, 124))))
        );
        jPanelVERSTOCKLayout.setVerticalGroup(
            jPanelVERSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVERSTOCKLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelVERSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jTextField2BUSCARJUEGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ver Stock", jPanelVERSTOCK);

        jLabel4.setText("Nombre Juego");

        jLabel5.setText("Cantidad");

        jLabel6.setText("Total");

        jTextFieldCANTIDADVENTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCANTIDADVENTAKeyTyped(evt);
            }
        });

        jTextFieldTOTALVENTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTOTALVENTAKeyTyped(evt);
            }
        });

        jLabel7.setText("Precio");

        jTextField1PRECIO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1PRECIOKeyTyped(evt);
            }
        });

        jButtonVENTAJUEGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pantallas/Actions-document-save-all-icon.png"))); // NOI18N
        jButtonVENTAJUEGO.setText("Generar Venta");
        jButtonVENTAJUEGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVENTAJUEGOActionPerformed(evt);
            }
        });

        jTextField2NOMBREJUEGO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2NOMBREJUEGOKeyReleased(evt);
            }
        });

        jButton5TOTALVENTA.setText("Calcular venta");
        jButton5TOTALVENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5TOTALVENTAActionPerformed(evt);
            }
        });

        tbprecio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tbprecio);

        jButton5.setText("Precios");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pantallas/Graph-icon.png"))); // NOI18N
        jButton6.setText("Informe de Ventas");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVENTASLayout = new javax.swing.GroupLayout(jPanelVENTAS);
        jPanelVENTAS.setLayout(jPanelVENTASLayout);
        jPanelVENTASLayout.setHorizontalGroup(
            jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVENTASLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVENTASLayout.createSequentialGroup()
                        .addGroup(jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5TOTALVENTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCANTIDADVENTA)
                    .addComponent(jTextField1PRECIO)
                    .addComponent(jTextFieldTOTALVENTA)
                    .addComponent(jTextField2NOMBREJUEGO, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVENTASLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVENTASLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(180, 180, 180))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVENTASLayout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(jButtonVENTAJUEGO, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanelVENTASLayout.setVerticalGroup(
            jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVENTASLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVENTASLayout.createSequentialGroup()
                        .addGroup(jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2NOMBREJUEGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(21, 21, 21)
                        .addGroup(jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldCANTIDADVENTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField1PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVENTASLayout.createSequentialGroup()
                        .addGroup(jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldTOTALVENTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5TOTALVENTA))
                    .addGroup(jPanelVENTASLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton5)))
                .addGap(32, 32, 32)
                .addGroup(jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVENTAJUEGO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Ventas", jPanelVENTAS);

        cmd_SignOut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmd_SignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pantallas/SignOut-icon.png"))); // NOI18N
        cmd_SignOut.setText("Salir del Sistema");
        cmd_SignOut.setFocusable(false);
        cmd_SignOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmd_SignOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmd_SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_SignOutActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("Salir", cmd_SignOut);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Excel abrir = new Excel();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        precios("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5TOTALVENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5TOTALVENTAActionPerformed
        // TODO add your handling code here:
        int cantidad = 0;
        int precio = 0;

        cantidad = Integer.parseInt(this.jTextFieldCANTIDADVENTA.getText());
        precio = Integer.parseInt(this.jTextField1PRECIO.getText());

        int resultado = cantidad*precio;

        jTextFieldTOTALVENTA.setText(String.valueOf(resultado));

    }//GEN-LAST:event_jButton5TOTALVENTAActionPerformed

    private void jButtonVENTAJUEGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVENTAJUEGOActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO ventas(nombre_juego,cantidad,precio,total) VALUES (?,?,?,?)");
            pst.setString(1, jTextField2NOMBREJUEGO.getText());
            pst.setString(2, jTextFieldCANTIDADVENTA.getText());
            pst.setString(3, jTextField1PRECIO.getText());
            pst.setString(4, jTextFieldTOTALVENTA  .getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Venta realizada con exito");

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

    }//GEN-LAST:event_jButtonVENTAJUEGOActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        mostrardatos(jTextField2BUSCARJUEGO.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mostrardatos("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO stock_juegos(nombre_juegos ,tipo_juego ,cantidad) VALUES (?,?,?)");
            pst.setString(1, jTextFieldNOMBREJUEGOS.getText());
            pst.setString(2, jTextFieldTIPOJUEGOS.getText());
            pst.setString(3, jTextFieldCANTIDADJUEGOS.getText());

            pst.executeUpdate();

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mostrardatos("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonINGRESOSTOCKJUEGOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINGRESOSTOCKJUEGOSActionPerformed
        // TODO add your handling code here:

           String sql="UPDATE stock_juegos SET cantidad = '"+jTextFieldCANTIDADJUEGOS.getText()+"',tipo_juego ='"+jTextFieldTIPOJUEGOS.getText()+"' WHERE nombre_juegos ='"+jTextFieldNOMBREJUEGOS.getText()+"'";
                   
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizado");
       
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
        }
       
    }//GEN-LAST:event_jButtonINGRESOSTOCKJUEGOSActionPerformed

    private void jTextFieldNOMBREJUEGOSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNOMBREJUEGOSKeyReleased
        // TODO add your handling code here:
        jTextFieldNOMBREJUEGOS.setText(jTextFieldNOMBREJUEGOS.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldNOMBREJUEGOSKeyReleased

    private void jTextFieldTIPOJUEGOSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTIPOJUEGOSKeyReleased
        // TODO add your handling code here:
        jTextFieldTIPOJUEGOS.setText(jTextFieldTIPOJUEGOS.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldTIPOJUEGOSKeyReleased

    private void jTextField2BUSCARJUEGOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2BUSCARJUEGOKeyReleased
        // TODO add your handling code here:
        jTextField2BUSCARJUEGO.setText(jTextField2BUSCARJUEGO.getText().toUpperCase());
    }//GEN-LAST:event_jTextField2BUSCARJUEGOKeyReleased

    private void jTextField2NOMBREJUEGOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2NOMBREJUEGOKeyReleased
        // TODO add your handling code here:
        jTextField2NOMBREJUEGO.setText(jTextField2NOMBREJUEGO.getText().toUpperCase());
    }//GEN-LAST:event_jTextField2NOMBREJUEGOKeyReleased

    private void jTextFieldCANTIDADJUEGOSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCANTIDADJUEGOSKeyTyped

        int k=(int)evt.getKeyChar();
            if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            }
            if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            }
            if(k==10){
            jTextFieldCANTIDADJUEGOS.transferFocus();
            }
    }//GEN-LAST:event_jTextFieldCANTIDADJUEGOSKeyTyped

    private void jTextFieldCANTIDADVENTAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCANTIDADVENTAKeyTyped
       
        int k=(int)evt.getKeyChar();
            if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            }
            if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            }
            if(k==10){
            jTextFieldCANTIDADVENTA.transferFocus();
            }
    }//GEN-LAST:event_jTextFieldCANTIDADVENTAKeyTyped

    private void jTextField1PRECIOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1PRECIOKeyTyped
        // TODO add your handling code here:
        int k=(int)evt.getKeyChar();
            if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            }
            if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            }
            if(k==10){
            jTextField1PRECIO.transferFocus();
            }
    }//GEN-LAST:event_jTextField1PRECIOKeyTyped

    private void jTextFieldTOTALVENTAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTOTALVENTAKeyTyped
        // TODO add your handling code here:
        int k=(int)evt.getKeyChar();
            if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            }
            if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            }
            if(k==10){
            jTextFieldTOTALVENTA.transferFocus();
            }
        
    }//GEN-LAST:event_jTextFieldTOTALVENTAKeyTyped

    private void cmd_SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_SignOutActionPerformed
        try{
            rs.close();
            pst.close();
            cn.close();
        }
        catch(Exception e) {
        }

        AccesoUser s = new AccesoUser();
        s.setVisible(false);

        salir();

    }//GEN-LAST:event_cmd_SignOutActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Stock");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}");
        try {
            tbproductos1.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
            //table.print(JTable.PrintMode.FIT_WIDTH, header, null);
           // jTable1_pumpdata.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }  finally {
                try{
                  rs.close();
                      pst.close();
                     //conn.close();
                  }
                  catch(Exception e) {
                      
                  }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    public void salir() {
    WindowEvent winClosingEvent = new WindowEvent( this, WindowEvent.WINDOW_CLOSING );
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent( winClosingEvent );
    }
          
    void mostrardatos(String valor){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Nombre Juego");
    modelo.addColumn("Tipo");
    modelo.addColumn("Cantidad");
    tbproductos.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM STOCK_JUEGOS ORDER BY NOMBRE_JUEGOS";
    }
    else{
        sql="SELECT * FROM STOCK_JUEGOS WHERE NOMBRE_JUEGOS LIKE'"+valor+"%'";
        
    }
 
    String []datos = new String [3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                modelo.addRow(datos);
            }
            tbproductos.setModel(modelo);
            tbproductos1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    void precios(String valor){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Nombre Juego");
    modelo.addColumn("Precio");
    tbprecio.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT NOMBRE_JUEGO, PRECIO FROM JUEGOS ORDER BY NOMBRE_JUEGO ";
    }
    else{
      //  sql="SELECT * FROM stock_juegos WHERE nombre_juegos ='"+valor+"'";
        
    }
 
    String []datos = new String [2];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);                
                datos[1]=rs.getString(2);
                modelo.addRow(datos);
            }
            tbprecio.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
       
  
  /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_SignOut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton5TOTALVENTA;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonINGRESOSTOCKJUEGOS;
    private javax.swing.JButton jButtonVENTAJUEGO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelINGRESOSTOCK;
    private javax.swing.JPanel jPanelVENTAS;
    private javax.swing.JPanel jPanelVERSTOCK;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1PRECIO;
    private javax.swing.JTextField jTextField2BUSCARJUEGO;
    private javax.swing.JTextField jTextField2NOMBREJUEGO;
    private javax.swing.JTextField jTextFieldCANTIDADJUEGOS;
    private javax.swing.JTextField jTextFieldCANTIDADVENTA;
    private javax.swing.JTextField jTextFieldNOMBREJUEGOS;
    private javax.swing.JTextField jTextFieldTIPOJUEGOS;
    private javax.swing.JTextField jTextFieldTOTALVENTA;
    private javax.swing.JTable tbprecio;
    private javax.swing.JTable tbproductos;
    private javax.swing.JTable tbproductos1;
    // End of variables declaration//GEN-END:variables
   
    conectar cc= new conectar();
    Connection cn= cc.conexion();

   
    }

