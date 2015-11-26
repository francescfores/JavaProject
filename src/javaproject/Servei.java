/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.Serializable;

/**
 *
 * @author sergi
 */
public class Servei implements Serializable{

   
    String nom;
    int cost;
    
    public Servei(String nom, int cost) {
        this.nom = nom;
        this.cost = cost;
    }
    
public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
     
}
