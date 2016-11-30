/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Otarola M
 */
public class IngresoNew extends javax.swing.JFrame {

    ResultSet rs = null;
    PreparedStatement pst=null;
    /**
     * Creates new form IngresoNew
     */
    public IngresoNew() {
        initComponents();
        centrar();
         
        
    }

    final void centrar (){
    
        this.setLocationRelativeTo(null);
    }
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelINGRESOSTOCK = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbproductos = new javax.swing.JTable();
        jButton1STOCK = new javax.swing.JButton();
        jPanelVENTAS = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaventas = new javax.swing.JTable();
        jButton2VENTAS = new javax.swing.JButton();
        cmd_SignOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbproductos);

        jButton1STOCK.setText("Stock");
        jButton1STOCK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1STOCKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelINGRESOSTOCKLayout = new javax.swing.GroupLayout(jPanelINGRESOSTOCK);
        jPanelINGRESOSTOCK.setLayout(jPanelINGRESOSTOCKLayout);
        jPanelINGRESOSTOCKLayout.setHorizontalGroup(
            jPanelINGRESOSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelINGRESOSTOCKLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelINGRESOSTOCKLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1STOCK, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        jPanelINGRESOSTOCKLayout.setVerticalGroup(
            jPanelINGRESOSTOCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelINGRESOSTOCKLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1STOCK, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Ingreso Stock", jPanelINGRESOSTOCK);

        tablaventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaventas);

        jButton2VENTAS.setText("Ventas");
        jButton2VENTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2VENTASActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVENTASLayout = new javax.swing.GroupLayout(jPanelVENTAS);
        jPanelVENTAS.setLayout(jPanelVENTASLayout);
        jPanelVENTASLayout.setHorizontalGroup(
            jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVENTASLayout.createSequentialGroup()
                .addGroup(jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVENTASLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVENTASLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jButton2VENTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanelVENTASLayout.setVerticalGroup(
            jPanelVENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVENTASLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2VENTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public void salir() {
    WindowEvent winClosingEvent = new WindowEvent( this, WindowEvent.WINDOW_CLOSING );
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent( winClosingEvent );
    }
    
    private void jButton1STOCKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1STOCKActionPerformed
        // TODO add your handling code here:
        mostrardatos("");
    }//GEN-LAST:event_jButton1STOCKActionPerformed

    private void jButton2VENTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2VENTASActionPerformed
        // TODO add your handling code here:
        venta("");
    }//GEN-LAST:event_jButton2VENTASActionPerformed

    void venta(String valor){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Nombre Juego");
    modelo.addColumn("Cantidad");
    modelo.addColumn("Precio");
    modelo.addColumn("Total venta");
    tablaventas.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM VENTAS ORDER BY TOTAL";
    }
    else{
       
    }
 
    String []datos = new String [4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);                
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                modelo.addRow(datos);
            }
            tablaventas.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    
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
        //sql="SELECT * FROM STOCK_JUEGOS WHERE NOMBRE_JUEGOS LIKE'"+valor+"%'";
        
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
            java.util.logging.Logger.getLogger(IngresoNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_SignOut;
    private javax.swing.JButton jButton1STOCK;
    private javax.swing.JButton jButton2VENTAS;
    private javax.swing.JPanel jPanelINGRESOSTOCK;
    private javax.swing.JPanel jPanelVENTAS;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaventas;
    private javax.swing.JTable tbproductos;
    // End of variables declaration//GEN-END:variables

    
    conectar cc= new conectar();
    Connection cn= cc.conexion();

}
