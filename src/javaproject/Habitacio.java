/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author sergi
 */
public class Habitacio {
        int preu;
        int numero;
        int capacitat;  
        String serveis;
    
    

    public Habitacio(int preu, int numero, int capacitat, String serveis) {
       
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
    public String getServeis() {
        return serveis;
    }

    public void setServeis(String serveis) {
        this.serveis = serveis;
    }
    
    
    private void Serveis() {
}
    
    
}
