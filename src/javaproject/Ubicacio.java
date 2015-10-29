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
public class Ubicacio {
    
        String pais;
        String localitat;
        String poblacio;    
        int codiPostal;
        public Ubicacio(){
            
        }
        
    public Ubicacio(String pais, String localitat, String poblacio, int codiPostal) {
        this.pais = pais;
        this.localitat = localitat;
        this.poblacio = poblacio;
        this.codiPostal = codiPostal;
    }       
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLocalitat() {
        return localitat;
    }

    public void setLocalitat(String localitat) {
        this.localitat = localitat;
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

}
