/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author francesc
 */
public class Hotel  {
        
    String nom;
    int estrelles;
    String direccio;
    String valoracio;
    String ofertes;
    Ubicacio ubicacio;
    public Hotel(){
        
    }
    public Hotel(String nom, int estrelles, String direccio, String valoracio, String ofertes, Ubicacio ubicacio) {
        this.nom = nom;
        this.estrelles = estrelles;
        this.direccio = direccio;
        this.valoracio = valoracio;
        this.ofertes = ofertes;
        this.ubicacio = ubicacio;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEstrelles() {
        return estrelles;
    }

    public void setEstrelles(int estrelles) {
        this.estrelles = estrelles;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public String getValoracio() {
        return valoracio;
    }

    public void setValoracio(String valoracio) {
        this.valoracio = valoracio;
    }

    public String getOfertes() {
        return ofertes;
    }

    public void setOfertes(String ofertes) {
        this.ofertes = ofertes;
    }

    public Hotel(String nom, int estrelles, String direccio, String valoracio, String ofertes) {
        this.nom = nom;
        this.estrelles = estrelles;
        this.direccio = direccio;
        this.valoracio = valoracio;
        this.ofertes = ofertes;
    }
    
      
    
}
