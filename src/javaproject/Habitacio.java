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
    
    String estat;
    double preu;
    int numero;
    int capacitat;
    boolean servei;

    public Habitacio(String estat, double preu, int numero, int capacitat, boolean servei) {
        this.estat = estat;
        this.preu = preu;
        this.numero = numero;
        this.capacitat = capacitat;
        this.servei = servei;
    }
    
    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
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

    public boolean isServei() {
        return servei;
    }

    public void setServei(boolean servei) {
        this.servei = servei;
    }
    
    
    
}
