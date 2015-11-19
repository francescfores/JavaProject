/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author sergi
 */
public class Habitacio implements Serializable{
        int preu;
        int numero;
        int capacitat;  
        ArrayList <Servei> serveis=new ArrayList<>();
    
    

    public Habitacio(int preu, int numero, int capacitat, ArrayList<Servei> serveis) {
       
        this.preu = preu;
        this.numero = numero;
        this.capacitat = capacitat;
        this.serveis = serveis;
    }

    Habitacio(int preu, int numero, int capacitat, String string, double cost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 
    
    

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }
    public ArrayList <Servei> getServeis() {
        
        return serveis;
    }

    public void setServeis(ArrayList <Servei> serveis) {
        this.serveis = serveis;
    }
    
    
    private void Serveis() {
}
    
    
}
