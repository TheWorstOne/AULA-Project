/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaview;

import aulaprocess.ComponentProcess;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import aularesources.Componente;
import aularesources.EstadoComponente;
import aulaserver.ConexionSQLite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
 
/**
 *
 * @author The Worst One
 */
public class home extends javax.swing.JFrame {

    private form secondWindow;
    private infoAula infoWindow;
    private libres orderWindow;
    private ConexionSQLite conexion;
    private int x, y;
    private ArrayList <Componente> todosComponentes = new ArrayList<>();
    private DefaultListModel orderList = new DefaultListModel();
    /**
     * Creates new form home
     */
    public home() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        //this.secondWindow = new form(this);
        //this.infoWindow = new infoAula(this);
        conexion = new ConexionSQLite();
        conexion.connect();
        conexion.loadComponente(todosComponentes);
        conexion.close();
        DefaultListCellRenderer renderer =  (DefaultListCellRenderer)jList1.getCellRenderer();  
        renderer.setHorizontalAlignment(JLabel.CENTER);
        
        for (int index=0; index<todosComponentes.size(); index++)
            orderList.addElement(todosComponentes.get(index));
        
        jList1.setModel(orderList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulaicons/1439195298_Close.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 20, 30));

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulaicons/Aula_logo.png"))); // NOI18N
        jLabel1.setText("AULA   ");
        jLabel1.setOpaque(true);
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 45));

        jButton2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulaicons/1438861395_Add.png"))); // NOI18N
        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 30));

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Aulas", "Laboratorios", "Libres", "Ocupados" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 90, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mostrar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 80, 30));

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jList1.setBackground(new java.awt.Color(11, 11, 11));
        jList1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setOpaque(false);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 200, 240));

        jButton1.setFont(new java.awt.Font("Verdana", 0, 9)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulaicons/1438861594_delete.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aulaicons/top3.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.secondWindow = new form(this);
        setVisible(false);
        Point point  = MouseInfo.getPointerInfo().getLocation() ;
        secondWindow.setPosition(this.getX(), this.getY());
        //secondWindow.setId();
        secondWindow.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        conexion.connect();
        conexion.deleteAll();
        for (Componente componente:todosComponentes)
            componente.save();
        conexion.close();
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed

        x = evt.getX  ()  ;
        y = evt.getY ()  ;
    }//GEN-LAST:event_jLabel1MousePressed

    public void setPosition (int x, int y)
    {
        setLocation(x, y);
    }
    
    /*public void addComponente (Componente componente)
    {
        javax.swing.JButton itemComponente = new javax.swing.JButton(componente.getNombre());
        todosComponentes.put(componente, itemComponente);
        todosComponentes.get(componente).setSize(73, 53);
        todosComponentes.get(componente).setPreferredSize(new java.awt.Dimension (73, 53));
        todosComponentes.get(componente).addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            selectionButtonPressed(componente); }
        });
        
        jPanel2.add(todosComponentes.get(componente));
    }*/
    
    public void addComponente (Componente componente)
    {
        todosComponentes.add(componente);
        orderList.addElement(componente);
        componente.save();
        
        //jPanel2.add(todosComponentes.get(componente));
        //jPanel2.add(itemComponente);
    }  
    
    
    
    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        Point point  = MouseInfo.getPointerInfo().getLocation() ;
        setLocation(point.x - x, point.y - y)  ;
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        //jList1.setModel(orderList);
        if (jList1.getModel().getSize()>0)
        {
            if (jList1.getSelectedValue()!=null)
            {
                int index = jList1.getSelectedIndex();
                Componente componente = (Componente) orderList.getElementAt(index);

                this.infoWindow = new infoAula(this, componente);
                
                setVisible(false);
                Point point  = MouseInfo.getPointerInfo().getLocation() ;
                infoWindow.setPosition(this.getX(), this.getY());
                infoWindow.setVisible(true);  
            }
        }
        
    }//GEN-LAST:event_jList1ValueChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        
                //int index = jComboBox1.getSelectedIndex();
                ArrayList<Componente> auxiliar = new ArrayList<>();
                orderList.clear();
                switch (jComboBox1.getSelectedIndex())
                {
                    case 0:
                        for (int i=0; i<todosComponentes.size(); i++)
                            orderList.addElement(todosComponentes.get(i));
                        break;
                    case 1:
                        ComponentProcess.orderAulas(todosComponentes, orderList);
                        break;
                    case 2:
                        ComponentProcess.orderLabs(todosComponentes, orderList);
                        break;
                    case 3:
                        if (orderWindow==null)
                        {
                            setVisible(false);
                            orderWindow = new libres (this, todosComponentes, true);
                            
                            Point point  = MouseInfo.getPointerInfo().getLocation() ;
                            orderWindow.setPosition(this.getX(), this.getY());
                            orderWindow.setVisible(true);
                        }
                        jComboBox1.setSelectedIndex(0);
                        break;
                    case 4:
                        if (orderWindow==null)
                        {
                            setVisible(false);
                            orderWindow = new libres (this, todosComponentes, false);
                            
                            Point point  = MouseInfo.getPointerInfo().getLocation() ;
                            orderWindow.setPosition(this.getX(), this.getY());
                            orderWindow.setVisible(true);
                        }
                        jComboBox1.setSelectedIndex(0);
                        break;
                }
                
                //jList1.setModel(orderList);
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conexion.connect();
        conexion.deleteAll();
        conexion.close();
        todosComponentes.clear();
        orderList.clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void destroyOrderWindow()
    {
        orderWindow = null;
    }
    
    public void updateComponente (Componente componente)
    {
        ComponentProcess.updateComponent(todosComponentes, componente);
        orderList.clear();
        for (int index=0; index<todosComponentes.size(); index++)
            orderList.addElement(todosComponentes.get(index));
        //jList1.setModel(orderList);
    }
    
    public void updateComponentes (ArrayList<Componente> todosComponentes)
    {
        this.todosComponentes = todosComponentes;
        orderList.clear();
        for (int index=0; index<todosComponentes.size(); index++)
            orderList.addElement(todosComponentes.get(index));
        //jList1.setModel(orderList);
    }
    
    public int cantTodosComponentes ()
    {
        return todosComponentes.size();
    }
    
    public void deleteComponente (Componente componente)
    {
        todosComponentes.remove(componente);
        orderList.clear();
        for (int index=0; index<todosComponentes.size(); index++)
            orderList.addElement(todosComponentes.get(index));
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
