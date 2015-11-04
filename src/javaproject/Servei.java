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

   
    String nom;
    double cost;
    
    public Servei(String nom, double cost) {
        this.nom = nom;
        this.cost = cost;
    }
    
public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
     
}
