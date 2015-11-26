/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author francesc
 */

public class AdminLlista extends javax.swing.JFrame {

    int i = 0;
    int j = 0;
    DefaultListModel modelo = new DefaultListModel();
    String[] Hotels;
    JList lista = new JList();

    DefaultTableModel modelo2 = new DefaultTableModel();
    String[] datos = {"1", "2", "3", "4"}; // Cantidad de columnas de la tabla

    /**
     * Creates new form AdminLlista
     */
    public AdminLlista() {
        initComponents();
        //LListem els Hotels
        Menu.setIndexhotels(0);
        while (Menu.hotels[Menu.getIndexhotels()] != null) {
            //creem la llista amb els seus components
            Object[] filahotels
                    = {
                        Menu.hotels[Menu.getIndexhotels()].getNom(),
                        Integer.toString(Menu.hotels[Menu.getIndexhotels()].getEstrelles()),
                        Menu.hotels[Menu.getIndexhotels()].getDireccio(),
                        Menu.hotels[Menu.getIndexhotels()].getValoracio(),
                        Menu.hotels[Menu.getIndexhotels()].getOfertes(),
                        Menu.hotels[Menu.getIndexhotels()].getUbicacions().getPais()
                    };
            DefaultTableModel tablemodel = (DefaultTableModel) jTable1.getModel();
            tablemodel.addRow(filahotels);
            jTable1.setModel(tablemodel);
            Menu.setIndexhotels(Menu.getIndexhotels()+1);
        }
        //LListem les Habitacions
        Menu.setIndexhabitacions(0);
        while (Menu.habitacions[Menu.getIndexhabitacions()] != null) {
            //creem la llista amb els seus components
            Object[] filahabitacions
                    = {
                        Integer.toString(Menu.habitacions[Menu.getIndexhabitacions()].getPreu()),
                        Integer.toString(Menu.habitacions[Menu.getIndexhabitacions()].getCapacitat()),
                        Integer.toString(Menu.habitacions[Menu.getIndexhabitacions()].getNumero()),
                        Menu.habitacions[Menu.getIndexhabitacions()].getServeis()
                    };
            DefaultTableModel tablemodel = (DefaultTableModel) jTable2.getModel();
            tablemodel.addRow(filahabitacions);
            jTable2.setModel(tablemodel);
            Menu.setIndexhabitacions(Menu.getIndexhabitacions()+1);
        }
        //LListem els Clients
        Menu.setIndexclients(0);
        while (Menu.clients[Menu.getIndexclients()] != null) {
            //creem la llista amb els seus components
            Object[] filahabitacions
                    = {
                        Menu.clients[Menu.getIndexclients()].getNom(),
                        Menu.clients[Menu.getIndexclients()].getCognoms(),
                        Menu.clients[Menu.getIndexclients()].getDni(),
                        Menu.clients[Menu.getIndexclients()].getDni()
                    };            
            DefaultTableModel tablemodel = (DefaultTableModel) jTable3.getModel();
            tablemodel.addRow(filahabitacions);
            jTable3.setModel(tablemodel);
            Menu.setIndexclients(Menu.getIndexclients()+1);
        } 
        Menu.setIndexserveis(0);
        while (Menu.serveis[Menu.getIndexserveis()] != null) {
            //creem la llista amb els seus components
            Object[] filahabitacions
                    = {
                        Menu.serveis[Menu.getIndexserveis()].getNom(),
                        Menu.serveis[Menu.getIndexserveis()].getCost()
                    };            
            DefaultTableModel tablemodel = (DefaultTableModel) jTable4.getModel();
            tablemodel.addRow(filahabitacions);
            jTable4.setModel(tablemodel);
            Menu.setIndexserveis(Menu.getIndexserveis()+1);
        }   
        Menu.setIndexubicacions(0);
        while (Menu.ubicacions[Menu.getIndexubicacions()] != null) {
            //creem la llista amb els seus components
            Object[] filahabitacions
                    = {
                        Menu.ubicacions[Menu.getIndexubicacions()].getPais(),
                        Menu.ubicacions[Menu.getIndexubicacions()].getProvincia(),
                        Menu.ubicacions[Menu.getIndexubicacions()].getPoblacio(),
                        Menu.ubicacions[Menu.getIndexubicacions()].getCodiPostal()
                    };            
            DefaultTableModel tablemodel = (DefaultTableModel) jTable5.getModel();
            tablemodel.addRow(filahabitacions);
            jTable5.setModel(tablemodel);
            Menu.setIndexubicacions(Menu.getIndexubicacions()+1);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton25 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(188, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(88, 127, 253), 7, true), "Hotels", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Ubuntu Medium", 1, 36), java.awt.Color.black)); // NOI18N
        jPanel2.setToolTipText("");
        jPanel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Habitacions :");

        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Estrelles", "Direccio", "Valoracio", "Ofertes", "ubicacio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Preu", "Numero", "Capacitiat", "Serveis"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setText("Hotels :");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel3.setText("Clients");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Cognom", "DNI", "Email", "Data de naixement"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Preu"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel4.setText("Serveis");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel5.setText("Ubicacions");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pais", "Provincia", "Poblacio ", "Codi posta"
            }
        ));
        jScrollPane6.setViewportView(jTable5);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/img/x1.png"))); // NOI18N
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(724, 724, 724))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(140, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton25ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLlista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLlista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLlista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLlista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLlista().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables
}
