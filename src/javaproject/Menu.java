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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.*;

/**
 *
 * @author francesc
 */
public class Menu extends javax.swing.JFrame {

    public static int getIndexubicacions() {
        return indexubicacions;
    }

    public static void setIndexubicacions(int indexubicacions) {
        Menu.indexubicacions = indexubicacions;
    }

    public static int getIndexserveis() {
        return indexserveis;
    }

    public static void setIndexserveis(int indexserveis) {
        Menu.indexserveis = indexserveis;
    }

    public static int getIndexhotels() {
        return indexhotels;
    }

    public static void setIndexhotels(int indexhotels) {
        Menu.indexhotels = indexhotels;
    }

    public static int getIndexhabitacions() {
        return indexhabitacions;
    }

    public static void setIndexhabitacions(int indexhabitacions) {
        Menu.indexhabitacions = indexhabitacions;
    }

    public static int getIndexclients() {
        return indexclients;
    }

    public static void setIndexclients(int indexclients) {
        Menu.indexclients = indexclients;
    }

    public static Ubicacio[] getUbicacions() {
        return ubicacions;
    }

    public static void setUbicacions(Ubicacio[] ubicacions) {
        Menu.ubicacions = ubicacions;
    }

    private static final int DIM = 20;
    // Indica si s'ha llegit o no el fitxer de llista
    static int indexhotels;
    static int indexhabitacions;
    static int indexclients;
    static int indexserveis;
    static int indexubicacions;

    //cambiar a arraylist
    static Hotel[] hotels = new Hotel[DIM];
    static Habitacio[] habitacions = new Habitacio[DIM];
    //static Servei[] serveis = new Servei[DIM];
    static Client[] clients = new Client[DIM];
    static Servei[] serveis = new Servei[DIM];
    static Ubicacio[] ubicacions = new Ubicacio[DIM];

    static File fhotels = new File("hotels.dat");         // El fitxer físic se diu "dades.dat". Si no s'especifica cap directori s'usa el del projecte. 
    static File fhabitacions = new File("habitacions.dat");
    static File fclients = new File("clients.dat");
    static File fserveis = new File("serveis.dat");
    static File fubicacions = new File("ubicacions.dat");
    static File freserves = new File("reserves.dat");
    static File ffactures = new File("ffactures.dat");
    static boolean llegit = false;

    static String search;

    public static String getSearch() {
        return search;
    }

    public static void setSearch(String search) {
        Menu.search = search;
    }
    //static ArrayList <Servei> serveis= new ArrayList <>();
    /**
     * Creates new form Menu
     */
    public Menu() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        LookAndFeelInfo[] lista = UIManager.getInstalledLookAndFeels();

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].getClassName());
        }
        initComponents();
        fitxernova(fhotels, Menu.hotels);

        fitxernova(fclients, Menu.clients);

        fitxernova(fhabitacions, Menu.habitacions);

        fitxernova(fserveis, Menu.serveis);

        fitxernova(fubicacions, Menu.ubicacions);
        //Anotem que hem llegit el fitxer
        llegit = true;
    }

    public static <T> void fitxernova(File fitxer, T vector[]) throws IOException {
        //jButton8.setVisible(false);
        int index;
        if (fitxer.exists()) {
                        //LLegim el contingut del fitxer i ho guardem al vector

            //Declarem el fluxe d'entrada
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(fitxer));

            //Índex per recorrer el vector inicialitzat a -1
            index = -1;

            //El bucle finalitzarà quan haguem llegit tot el fitxer
            while (true) {
                try {
                    // = (Myclass) //hem de especificar el nom de la classe es a dir un casting dinamic
                    //Menu.hotels[++index] = Hotel.class.cast(entrada.readObject());
                    vector[++index] = (T) entrada.readObject();
                } //Si arribem al final del vector ho indiquem, decrementem l'índex i sortim del bucle infinit
                catch (ArrayIndexOutOfBoundsException ex) {
                    //System.err.println("No cap tot el fitxer dins al vector!!");
                    index--;
                    break;
                } //Quan arribem al final del fitxer sortim del bucle infinit
                catch (Exception ex) {
                    index--;
                    break;
                }
            }
            //Molt important!!. S'ha de tancar el fitxer.
            entrada.close();
            //jTextField1.setText("Fitxer llegit correctament!!");
        } else {
            //jTextField1.setText("El fitxer ja s'ha llegit o encara no existeix!!");
            //index = -1;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(188, 204, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel1.setText("Lo sabemos todo sobre hoteles");

        jTextField2.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jTextField2.setText("Ejemplo : Barcelona"); // NOI18N
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });

        jToggleButton2.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jToggleButton2.setText("Buscar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jButton1.setText("Admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        
        Menu.setSearch(jTextField2.getText());
        System.out.println(Menu.getSearch());
        Resultat ob = null;
        try {
            ob = new Resultat();
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
        
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*Login ob = null;
         try {
         ob = new Login();
         } catch (Exception ex) {
         Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         ob.setVisible(true);*/
        Admin ob = null;
        try {
            ob = new Admin();
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained

    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

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
                try {
                    new Menu().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
