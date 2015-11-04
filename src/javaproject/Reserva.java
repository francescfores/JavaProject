/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.util.Date;
/**
 *
 * @author francesc
 */

public class Reserva {
    Date dataEntrada;
    Date dataSurtida;
    Date dataReserva;
    boolean activa;  
    double preuReserva;
    
    
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

    public void setPreuReserva(double preuReserva) {
        this.preuReserva = preuReserva;
    }

    
    public int calculapreu(){
        return 0;
}
    
}
