/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author francesc
 */
public class Client extends Ubicacio implements Serializable{
  
    String nom;
    String cognoms;
    String dni;
    String email;
    Date   data_naixement;
    
    public Client(String nom, String cognoms, String dni, String email, Date data_naixement) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
        this.email = email;
        this.data_naixement = data_naixement;
        this.poblacio = poblacio;
    }
    
    public Client(String nom, String cognoms, String dni, String email) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
        this.email = email;
    }
   
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_naixement() {
        return data_naixement;
    }

    public void setData_naixement(Date data_naixement) {
        this.data_naixement = data_naixement;
    }
    
    
    
}
