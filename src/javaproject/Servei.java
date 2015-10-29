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
public class Servei {

    
    double cangur;
    double neteja;
    double  botons;
    double fisio;
    double buffet;
    public double getCangur() {
        return cangur;
    }

    public void setCangur(double cangur) {
        this.cangur = cangur;
    }

    public double getNeteja() {
        return neteja;
    }

    public void setNeteja(double neteja) {
        this.neteja = neteja;
    }

    public double getBotons() {
        return botons;
    }

    public void setBotons(double botons) {
        this.botons = botons;
    }

    public double getFisio() {
        return fisio;
    }

    public void setFisio(double fisio) {
        this.fisio = fisio;
    }

    public double getBuffet() {
        return buffet;
    }

    public void setBuffet(double buffet) {
        this.buffet = buffet;
    }
    public Servei(double cangur, double neteja, double botons, double fisio, double buffet) {
        this.cangur = cangur;
        this.neteja = neteja;
        this.botons = botons;
        this.fisio = fisio;
        this.buffet = buffet;
    }
}
