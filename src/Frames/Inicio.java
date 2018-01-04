
package Frames;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import proyecto.DBConnection;
import proyecto.Libro;


public class Inicio extends DBConnection{

   
    private TableRowSorter trsFiltro;
    
   
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    
        
        try {
            conectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Favor Encender el servidor.");
        }
            
        try {
            mostrarDatos(jTableAll);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encuentra la Tabla para cargar datos");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        Jpanelll = new javax.swing.JScrollPane();
        jTableAll = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtFiltro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libreria");
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(1025, 575));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setForeground(new java.awt.Color(255, 255, 255));
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableAll = new javax.swing.JTable(){ public boolean isCellEditable(int rowIndex,int columnIndex){return false;}};
        jTableAll.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 0), null, null));
        jTableAll.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTableAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Tipo", "Fecha", "Abrir", "Editar", "Eliminar"
            }
        ));
        jTableAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAllMouseClicked(evt);
            }
        });
        Jpanelll.setViewportView(jTableAll);

        Contenedor.add(Jpanelll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 832, 504));

        getContentPane().add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 64, 832, 504));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFiltro.setBackground(new java.awt.Color(255, 255, 255));
        txtFiltro.setForeground(new java.awt.Color(102, 102, 102));
        txtFiltro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFiltro.setText("Buscar");
        txtFiltro.setToolTipText("Buscar");
        txtFiltro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });
        jPanel2.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 16, 146, 32));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 38, 72));
        jLabel3.setText("Cardioencarta.");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 264, 48));

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));
        jPanel5.setForeground(new java.awt.Color(204, 0, 0));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Heart_Outline_52px.png"))); // NOI18N
        jPanel5.add(jLabel11);

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 0, 64, 56));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar Por:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 16, 104, 32));

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Tipo", "Fecha" }));
        comboFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(comboFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 16, 128, 32));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/magnifier.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 16, 24, 32));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 0, 832, 64));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 24, 568));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Libreria.");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 168, 40));

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Libreria");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 208, 88, -1));

        jPanel6.setBackground(new java.awt.Color(204, 0, 0));
        jPanel6.setForeground(new java.awt.Color(204, 0, 0));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Books_50px.png"))); // NOI18N
        jPanel6.add(jLabel9);

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 120, 112, 88));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setForeground(new java.awt.Color(204, 0, 0));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Health_Book_64px_1.png"))); // NOI18N
        jPanel4.add(jLabel8);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 256, 112, 88));

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Añadir Libro");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 344, 144, -1));

        jPanel8.setBackground(new java.awt.Color(204, 0, 0));
        jPanel8.setForeground(new java.awt.Color(204, 0, 0));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Pencil_52px.png"))); // NOI18N
        jPanel8.add(jLabel10);

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 384, 112, 88));

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Mis Apuntes");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 472, 128, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 216, 568));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAllMouseClicked
     int colum = jTableAll.getColumnModel().getColumnIndexAtX(evt.getX());
     int row= evt.getY()/jTableAll.getRowHeight();
     if(row < jTableAll.getRowCount() && row >= 0 && colum < jTableAll.getColumnCount() && colum >=0){}
     Object value= jTableAll.getValueAt(row, colum);
     if(value instanceof JButton){
     ((JButton) value).doClick();
     JButton boton= (JButton) value;
         if(boton.getName().equals("Abrir")){
             
            int filsel = jTableAll.getSelectedRow();
            if(filsel == -1){
            JOptionPane.showMessageDialog(null, "Tabla no encontrada");
            }else{
            TableModel m = jTableAll.getModel();
             String url= null;
            for(int i = 0; i<m.getRowCount(); i++){
                //Se toman los datos de la tabla cliente
            int id = (int) m.getValueAt(filsel, 0);//suponiendo que el id lo muestras en la primera columna
             String sql="select * from registro where id='"+id+"' ";
           
             try {
                    estado= con.prepareStatement(sql);
                    rs = estado.executeQuery();
                    while(rs.next()){
                        url = rs.getString("url");
                        }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
        
            }
            try {
                
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+url);
                            System.out.println("Final");
                            } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                             }
            
            }
             
         System.out.println("Abri");
         }else if(boton.getName().equals("Editar")){
             
             JOptionPane.showMessageDialog(null,"No es apto para editar un registro");
         }else if(boton.getName().equals("Eliminar")){
             
             
              int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if(resp != 1){
            
             int filsel = jTableAll.getSelectedRow();
             if(filsel == -1){
                JOptionPane.showMessageDialog(null, "Tabla no encontrada");
            }else{
            TableModel m = jTableAll.getModel();
            
            for(int i = 0; i<m.getRowCount(); i++){
                //Se toman los datos de la tabla cliente
                int id = (int) m.getValueAt(filsel, 0);//suponiendo que el id lo muestras en la primera columna
                Libro libro= new Libro();
                libro.setId(id);
                try {
                    eliminar(libro);
                } catch (SQLException ex) {
                   ex.printStackTrace();
                }
        
            }
                 try {
                    Inicio n = new Inicio();
                    n.setVisible(true);
                    mostrarDatos(jTableAll);
                    this.setVisible(false);
                    
                 } catch (SQLException ex) {
                     Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                 }
         }
        JOptionPane.showMessageDialog(null, "Registro Eliminado");
        //aqui pones lo que quieras hacer si la respuesta es SI
        }else{
            
            JOptionPane.showMessageDialog(null, "No se elimino nada");
        //y aqui va lo contrario si esque la respuesta seria NO
            }
               
        }
     }
    }//GEN-LAST:event_jTableAllMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

       
    }//GEN-LAST:event_jPanel1MouseClicked

    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Images/147402-OTR2DY-337.png"));


        return retValue;
    }
    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked
    public void filtro() {
        int columnaABuscar = 1;
        if (comboFiltro.getSelectedItem() == "Fecha") {
            columnaABuscar = 3;
        }
        if (comboFiltro.getSelectedItem().toString() == "Nombre") {
            columnaABuscar = 1;
        }
        if (comboFiltro.getSelectedItem() == "Tipo") {
            columnaABuscar = 2;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), columnaABuscar));
}
    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {                                   
                                           
        // TODO add your handling code here:
        txtFiltro.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro.getText());
                txtFiltro.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(jTableAll.getModel());
        jTableAll.setRowSorter(trsFiltro);

                                            
    }                                  

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        Inicio n = new Inicio();
        n.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        NuevoLibro n = null;
        try {
            n = new NuevoLibro();
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
         Apuntitos n =new Apuntitos();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel8MouseClicked

   
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JScrollPane Jpanelll;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTable jTableAll;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    

    
    
    
}