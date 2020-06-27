/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Date;

/**
 *
 * @author userPC
 */
public class Transaksi {
    private int idtransaksi, idpelanggan, idkamar, totalharga;
    private String Checkin, Checkout, tnglTransaksi, namaPelanggan, noKamar;
    private Date tgltransaksi, tglCheckIn, tglCheckOut;
    public Transaksi() {
    }

    public Transaksi(int idtransaksi, int idpelanggan, int idkamar, 
            String Checkin, String Checkout, String tnglTransaksi) {
        this.idtransaksi = idtransaksi;
        this.idpelanggan = idpelanggan;
        this.idkamar = idkamar;
        this.Checkin = Checkin;
        this.Checkout = Checkout;
        this.tnglTransaksi = tnglTransaksi;
    }

    public Transaksi(int idtransaksi, int idpelanggan, int idkamar, String Checkin, String Checkout, String tnglTransaksi, String namaPelanggan, String noKamar) {
        this.idtransaksi = idtransaksi;
        this.idpelanggan = idpelanggan;
        this.idkamar = idkamar;
        this.Checkin = Checkin;
        this.Checkout = Checkout;
        this.tnglTransaksi = tnglTransaksi;
        this.namaPelanggan = namaPelanggan;
        this.noKamar = noKamar;
    }

    public Date getTgltransaksi() {
        return tgltransaksi;
    }

    public void setTgltransaksi(Date tgltransaksi) {
        this.tgltransaksi = tgltransaksi;
    }

    public Date getTglCheckIn() {
        return tglCheckIn;
    }

    public void setTglCheckIn(Date tglCheckIn) {
        this.tglCheckIn = tglCheckIn;
    }

    public Date getTglCheckOut() {
        return tglCheckOut;
    }

    public void setTglCheckOut(Date tglCheckOut) {
        this.tglCheckOut = tglCheckOut;
    }
    
    

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getNoKamar() {
        return noKamar;
    }

    public void setNoKamar(String noKamar) {
        this.noKamar = noKamar;
    }
    
    
     
    public int getIdtransaksi() {
        return idtransaksi;
    }

    public void setIdtransaksi(int idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public int getIdpelanggan() {
        return idpelanggan;
    }

    public void setIdpelanggan(int idpelanggan) {
        this.idpelanggan = idpelanggan;
    }

    public int getIdkamar() {
        return idkamar;
    }

    public void setIdkamar(int idkamar) {
        this.idkamar = idkamar;
    }

    public int getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(int totalharga) {
        this.totalharga = totalharga;
    }

    public String getCheckin() {
        return Checkin;
    }

    public void setCheckin(String Checkin) {
        this.Checkin = Checkin;
    }

    public String getCheckout() {
        return Checkout;
    }

    public void setCheckout(String Checkout) {
        this.Checkout = Checkout;
    }

    public String getTnglTransaksi() {
        return tnglTransaksi;
    }

    public void setTnglTransaksi(String tnglTransaksi) {
        this.tnglTransaksi = tnglTransaksi;
    }


    @Override
    public String toString() {
        return "Transaksi{" + "idtransaksi=" + idtransaksi + ", idpelanggan=" 
                + idpelanggan + ", idkamar=" + idkamar + ", totalharga=" + totalharga 
                + ", Checkin=" + Checkin + ", Checkout=" + Checkout + ", tnglTransaksi=" 
                + tnglTransaksi + '}';
    }
    
    
}
