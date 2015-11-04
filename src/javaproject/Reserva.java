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

public class Reserva {
    Date dataEntrada;
    Date dataSurtida;
    Date dataReserva;
    boolean activa;  
    long preuReserva;
    
        
    
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
        
    //this.preuReserva = calculapreu(Date ("2015/05/05"));
    }

    
    static public int calculapreu(Date dataEntrada, Date dataSurtida){
        
        long diff = dataSurtida.getTime() - dataEntrada.getTime();
        long dies_reserva = diff / (1000 * 60 * 60 * 24);
        return (int) dies_reserva;


        //long dies_reserva;
        //SimpleDateFormat formateador = new SimpleDateFormat("yyyyMMdd");
        //formateador.parse("2012/12/31");
         //dies_reserva= ( dataEntrada.getTime() - dataSurtida.getTime() );
        
        
        
        
        
}
    /* public static void main(String[] args) {
         String data1="2015/05/05";
         
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(data1);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        
        System.out.print(fechaDate);
         
        
     }*/
}
