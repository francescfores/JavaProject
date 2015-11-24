package javaproject;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author francesc
 */
public class ClasseGenerica  {
        public static <T> void fitxernova(File fitxer, T vector[] ) throws IOException {
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
                    vector[++index] = (T)entrada.readObject();
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
}
