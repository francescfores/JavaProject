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
 * @author sergi
 */
public class Factura implements Serializable {

    

    Date dataEmissio;
    Date dataPagament;
    double recarrec;
    double preu;
    double costServei;
    double total;
    
    public Date getDataEmissio() {
        return dataEmissio;
    }

    public void setDataEmissio(Date dataEmissio) {
        this.dataEmissio = dataEmissio;
    }

    public Date getDataPagament() {
        return dataPagament;
    }

    public void setDataPagament(Date dataPagament) {
        this.dataPagament = dataPagament;
    }

    public double getRecarrec() {
        return recarrec;
    }

    public void setRecarrec(double recarrec) {
        this.recarrec = recarrec;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public double getCostServei() {
        return costServei;
    }

    public void setCostServei(double costServei) {
        this.costServei = costServei;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
     
    public Factura(Date dataEmissio, Date dataPagament, double recarrec, double preu, double costServei, double total) {
        this.dataEmissio = dataEmissio;
        this.dataPagament = dataPagament;
        this.recarrec = recarrec;
        this.preu = preu;
        this.costServei = costServei;
        this.total = total;
    }
    public double calculaFactura(){
        total = recarrec + costServei;
        return total;
    }
}
