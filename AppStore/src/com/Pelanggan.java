/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author userPC
 */
public class Pelanggan {
    private String namapelanggan, alamatpelanggan;
    private int idpelanggan, noktp;
    java.util.Date dt = new java.util.Date();

    java.text.SimpleDateFormat sdf = 
     new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    String checkin, checkout = sdf.format(dt);
    
    public Pelanggan() {
    }

    public Pelanggan(String namapelanggan, String alamatpelanggan, 
            int idpelanggan, int noktp) {
        this.namapelanggan = namapelanggan;
        this.alamatpelanggan = alamatpelanggan;
        this.idpelanggan = idpelanggan;
        this.noktp = noktp;
    }

    public String getNamapelanggan() {
        return namapelanggan;
    }

    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }

    public String getAlamatpelanggan() {
        return alamatpelanggan;
    }

    public void setAlamatpelanggan(String alamatpelanggan) {
        this.alamatpelanggan = alamatpelanggan;
    }

    public int getIdpelanggan() {
        return idpelanggan;
    }

    public void setIdpelanggan(int idpelanggan) {
        this.idpelanggan = idpelanggan;
    }

    public int getNoktp() {
        return noktp;
    }

    public void setNoktp(int noktp) {
        this.noktp = noktp;
    }

    @Override
    public String toString() {
        return "Pelanggan{" + "namapelanggan=" + namapelanggan + ", alamatpelanggan=" + alamatpelanggan + ", idpelanggan=" + idpelanggan + ", noktp=" + noktp + '}';
    }
    
}
