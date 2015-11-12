/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 *
 * @author francesc
 */

public class Reserva extends Habitacio {

    
    Date dataEntrada;
    Date dataSurtida;
    Date dataReserva;
    boolean activa;  
    long preuReserva;
    
   
    
    
   public Reserva(Date dataEntrada, Date dataSurtida, Date dataReserva, boolean activa, long preuReserva, String estat, double preu, int numero, int capacitat, String[] serveis) {
        super(estat, preu, numero, capacitat, serveis);
        this.dataEntrada = dataEntrada;
        this.dataSurtida = dataSurtida;
        this.dataReserva = dataReserva;
        this.activa = activa;
        this.preuReserva = preuReserva;
    }
    
     

        
    
    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSurtida() {
        return dataSurtida;
    }

    public void setDataSurtida(Date dataSurtida) {
        this.dataSurtida = dataSurtida;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public double getPreuReserva() {
        return preuReserva;
    }

    public void setPreuReserva(long preuReserva) {
        
    //this.preuReserva = calculaData("22/06/2015","23/06/1994");
    }
    
     
    
    static public int calculaData(String dataEntrada, String dataSurtida){
        
       Date dataEntradaFormatada = transformaData(dataEntrada);
       Date dataSurtidaFormatada = transformaData(dataSurtida);
        
        long diff = dataSurtidaFormatada.getTime() - dataEntradaFormatada.getTime();
        long dies_reserva = diff / (1000 * 60 * 60 * 24);
        return (int) dies_reserva;


        
        
    }
   static public Date transformaData (String data){
       
       SimpleDateFormat dataEntradaFormatada = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = dataEntradaFormatada.parse(data);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        
        
         
       
       
       return fechaDate;
   }    
    
 public double calculaPreu (String dataEntrada, String dataSurtida, 
         String[] serveis, double preuHabitacio){
     
     
     int diesReserva=calculaData(dataEntrada, dataSurtida);
     double preuDiesHabitacio= diesReserva*preuHabitacio;
     
     
     
     return preuReserva;
 }
       
}
     

