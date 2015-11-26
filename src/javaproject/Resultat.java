/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author francesc
 */
public class Resultat extends javax.swing.JFrame {

    int cont = 0;

    /**
     * Creates new form Resultat
     */
    public Resultat() {

        initComponents();

        Resultats(new JPanel());
    }

    public void Resultats(JPanel panele) {
        //panel de dins de l'scroll que conte la llista de habitacions o hotels
        javax.swing.JPanel jPanel4 = new javax.swing.JPanel(new GridLayout(10, 0, 8, 8));
        jPanel4.setBackground(new java.awt.Color(188, 204, 255));
        //Resultat de la cerca

        Menu.setIndexhotels(0);
        while (Menu.hotels[Menu.getIndexhotels()] != null) {
            //creem la llista amb els seus components
            String a = Menu.getSearch();
            //Busquem per provincia
            if (a.equalsIgnoreCase(Menu.hotels[Menu.getIndexhotels()].getUbicacions().getProvincia())) {
                jPanel4.add((Component) Panellnou(new JPanel()));
                cont++;
                //Busquem per pais
            } else if (a.equalsIgnoreCase(Menu.hotels[Menu.getIndexhotels()].getUbicacions().getPais())) {
                jPanel4.add((Component) Panellnou(new JPanel()));
                cont++;
                //Busquem per poblacio
            } else if (a.equalsIgnoreCase(Menu.hotels[Menu.getIndexhotels()].getUbicacions().getPoblacio())) {
                jPanel4.add((Component) Panellnou(new JPanel()));
                cont++;
            }

            Menu.setIndexhotels(Menu.getIndexhotels() + 1);

        }
        //jPanel4.setLayout(new GridLayout(cont, 0, 8, 8));
        jScrollPane1.setViewportView(jPanel4);

    }

    public Object Panellnou(JPanel panele) {
        //entrada que conte una habitacio
        panele.setLayout(new GridLayout(1, 0, 8, 8));
        panele.setBackground(new java.awt.Color(188, 204, 255));
        panele.setBorder(javax.swing.BorderFactory.createTitledBorder(Menu.hotels[Menu.getIndexhotels()].getNom()));

        //panell que conte l'imatge de l'entrada            
        panele.add((Component) PanellImatge(new JPanel()));

        //panell que conte el text de l'entrada
        panele.add((Component) PanellText(new JPanel()));
        panele.add((Component) PanellText2(new JPanel()));

        return panele;
    }

    public Object PanellImatge(JPanel panele) {
        JPanel jPanel7 = new JPanel(new GridLayout(0, 1, 8, 8));
        jPanel7.setBackground(new java.awt.Color(188, 204, 255));
        jPanel7.add((Component) imatge("/javaproject/img/860451_v3_mc.jpeg"));
        return jPanel7;
    }

    public Object imatge(String url) {
        //Imatge de l'habitacio
        JLabel jLabel4 = new JLabel();
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(url))); // NOI18N       
        return jLabel4;
    }

    public Object PanellText(JPanel panele) {
        JPanel jPanel6 = new JPanel(new GridLayout(7, 1, 0, 0));
        jPanel6.setBackground(new java.awt.Color(188, 204, 255));
        JLabel jLabel5 = new JLabel("Nom :");
        JLabel jLabel6 = new JLabel(Menu.hotels[Menu.getIndexhotels()].getNom());
        JLabel jLabel7 = new JLabel("Estrelles :");
        JLabel jLabel8 = new JLabel("" + Menu.hotels[Menu.getIndexhotels()].getEstrelles());
        JLabel jLabel9 = new JLabel("Direccio :");
        JLabel jLabel10 = new JLabel(Menu.hotels[Menu.getIndexhotels()].getDireccio());
        JLabel jLabel11 = new JLabel("Valoracio :");
        JLabel jLabel12 = new JLabel(Menu.hotels[Menu.getIndexhotels()].getValoracio());
        JLabel jLabel13 = new JLabel("Ofertes :");
        JLabel jLabel14 = new JLabel(Menu.hotels[Menu.getIndexhotels()].getOfertes());
        JLabel jLabel15 = new JLabel("Pais :");
        JLabel jLabel16 = new JLabel(Menu.hotels[Menu.getIndexhotels()].getUbicacions().getPais());

        jPanel6.add(jLabel5);
        jPanel6.add(jLabel6);
        jPanel6.add(jLabel7);
        jPanel6.add(jLabel8);
        jPanel6.add(jLabel9);
        jPanel6.add(jLabel10);
        jPanel6.add(jLabel11);
        jPanel6.add(jLabel12);
        jPanel6.add(jLabel13);
        jPanel6.add(jLabel14);
        jPanel6.add(jLabel15);
        jPanel6.add(jLabel16);
        return jPanel6;
    }

    public Object PanellText2(JPanel panele) {
        JPanel jPanel6 = new JPanel(new GridLayout(7, 1, 0, 0));
        jPanel6.setBackground(new java.awt.Color(188, 204, 255));

        return jPanel6;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBox3 = new javax.swing.JComboBox();
        jButton25 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(188, 204, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel1.setText("Lo sabemos todo sobre hoteles");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/logo3.png"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(188, 204, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Hotels"));

        jPanel4.setBackground(new java.awt.Color(188, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1084, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1073, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel4);

        jPanel2.setBackground(new java.awt.Color(188, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("filtres"));
        jPanel2.setToolTipText("");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, 0, 125, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jSeparator4)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/img/x1.png"))); // NOI18N
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton25ActionPerformed
    /*
     public void initComponents2() {

     javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
     javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
     javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
     javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
     javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
     javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
     javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
     javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
     javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
     javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
     javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
     javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
     javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
     javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
     javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
     javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
     javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
     javax.swing.JLabel jLabel14 = new javax.swing.JLabel();
     javax.swing.JPanel jPanel2 = new javax.swing.JPanel();

     setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

     jPanel1.setBackground(new java.awt.Color(188, 204, 255));

     jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
     jLabel1.setText("Lo sabemos todo sobre hoteles");

     jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/logo3.png"))); // NOI18N

     jScrollPane1.setBackground(new java.awt.Color(188, 204, 255));
     jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Hotels"));

     jPanel4.setBackground(new java.awt.Color(188, 204, 255));

     jPanel3.setBackground(new java.awt.Color(188, 204, 255));
     jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

     jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/img/6741_v9_mc.jpeg"))); // NOI18N

     jLabel5.setText("Nom :");

     jLabel6.setText("Estrelles :");

     jLabel7.setText("Direcció :");

     jLabel8.setText("Valoracio :");

     jLabel9.setText("Ofertes :");

     jLabel10.setText("jLabel10");

     jLabel11.setText("jLabel11");

     jLabel12.setText("jLabel12");

     jLabel13.setText("jLabel13");

     jLabel14.setText("jLabel14");

     javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
     jPanel3.setLayout(jPanel3Layout);
     jPanel3Layout.setHorizontalGroup(
     jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel3Layout.createSequentialGroup()
     .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGap(35, 35, 35)
     .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addGroup(jPanel3Layout.createSequentialGroup()
     .addComponent(jLabel9)
     .addGap(11, 11, 11))
     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
     .addComponent(jLabel5)
     .addGap(35, 35, 35))
     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
     .addComponent(jLabel6)
     .addGap(5, 5, 5))
     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
     .addComponent(jLabel7)
     .addGap(8, 8, 8))
     .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
     .addGap(26, 26, 26)
     .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
     .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
     .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
     .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
     .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
     .addContainerGap(85, Short.MAX_VALUE))
     );
     jPanel3Layout.setVerticalGroup(
     jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel3Layout.createSequentialGroup()
     .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel5)
     .addComponent(jLabel10))
     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
     .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel6)
     .addComponent(jLabel11))
     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
     .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel7)
     .addComponent(jLabel12))
     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
     .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel8)
     .addComponent(jLabel13))
     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
     .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jLabel9)
     .addComponent(jLabel14))
     .addGap(17, 17, 17))
     .addGroup(jPanel3Layout.createSequentialGroup()
     .addComponent(jLabel4)
     .addGap(0, 0, Short.MAX_VALUE))
     );

     javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
     jPanel4.setLayout(jPanel4Layout);
     jPanel4Layout.setHorizontalGroup(
     jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel4Layout.createSequentialGroup()
     .addContainerGap()
     .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGap(0, 180, Short.MAX_VALUE))
     );
     jPanel4Layout.setVerticalGroup(
     jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel4Layout.createSequentialGroup()
     .addContainerGap()
     .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addContainerGap(593, Short.MAX_VALUE))
     );

     jScrollPane1.setViewportView(jPanel4);

     jPanel2.setBackground(new java.awt.Color(188, 204, 255));
     jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("filtres"));
     jPanel2.setToolTipText("");

     javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
     jPanel2.setLayout(jPanel2Layout);
     jPanel2Layout.setHorizontalGroup(
     jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGap(0, 108, Short.MAX_VALUE)
     );
     jPanel2Layout.setVerticalGroup(
     jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGap(0, 0, Short.MAX_VALUE)
     );

     javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
     jPanel1.setLayout(jPanel1Layout);
     jPanel1Layout.setHorizontalGroup(
     jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel1Layout.createSequentialGroup()
     .addContainerGap()
     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel1Layout.createSequentialGroup()
     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel1Layout.createSequentialGroup()
     .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addContainerGap(171, Short.MAX_VALUE))
     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
     .addGroup(jPanel1Layout.createSequentialGroup()
     .addGap(132, 132, 132)
     .addComponent(jLabel2)
     .addContainerGap())))
     );
     jPanel1Layout.setVerticalGroup(
     jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel1Layout.createSequentialGroup()
     .addComponent(jLabel2)
     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
     .addGroup(jPanel1Layout.createSequentialGroup()
     .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
     .addComponent(jLabel3))
     .addGroup(jPanel1Layout.createSequentialGroup()
     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
     .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
     .addContainerGap())
     );

     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
     getContentPane().setLayout(layout);
     layout.setHorizontalGroup(
     layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     );
     layout.setVerticalGroup(
     layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
     );

     pack();
     }// </editor-fold>                        
     */

    /**
     * /
     *
     **
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
            java.util.logging.Logger.getLogger(Resultat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton25;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
