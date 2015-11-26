/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.Serializable;

/**
 *
 * @author francesc
 */
public class Ubicacio implements Serializable{

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
        String pais;
        String poblacio; 
        String provincia;    
        int codiPostal;
        
        
    public Ubicacio(){
            
        }
        
    public Ubicacio(String pais,  String provincia, String poblacio, int codiPostal) {
        this.pais = pais;
        this.provincia = provincia;
        this.poblacio = poblacio;
        this.codiPostal = codiPostal;
    }       
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public int getCodiPostal() {
        return codiPostal;
    }

    public void setCodiPostal(int codiPostal) {
        this.codiPostal = codiPostal;
    }

    @Override
    public String toString() {
        return poblacio+" "+provincia;
    }

}
