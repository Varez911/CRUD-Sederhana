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
public class Kamar {
    private int idtamu, idkamar, idjeniskamar, harga, isi;
    private String nokamar, status, kelas;

    public Kamar() {
    }

    public Kamar(int idtamu, int idkamar, int idjeniskamar, int harga, int isi, 
            String nokamar, String status, String kelas) {
        this.idtamu = idtamu;
        this.idkamar = idkamar;
        this.idjeniskamar = idjeniskamar;
        this.harga = harga;
        this.isi = isi;
        this.nokamar = nokamar;
        this.status = status;
        this.kelas = kelas;
    }    

    public Kamar(int idtamu, int idkamar, int idjeniskamar, String nokamar, 
            String status) {
        this.idtamu = idtamu;
        this.idkamar = idkamar;
        this.idjeniskamar = idjeniskamar;
        this.nokamar = nokamar;
        this.status = status;
    }    
    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getIsi() {
        return isi;
    }

    public void setIsi(int isi) {
        this.isi = isi;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getIdtamu() {
        return idtamu;
    }

    public void setIdtamu(int idtamu) {
        this.idtamu = idtamu;
    }

    public int getIdkamar() {
        return idkamar;
    }

    public void setIdkamar(int idkamar) {
        this.idkamar = idkamar;
    }

    public int getIdjeniskamar() {
        return idjeniskamar;
    }

    public void setIdjeniskamar(int idjeniskamar) {
        this.idjeniskamar = idjeniskamar;
    }

    public String getNokamar() {
        return nokamar;
    }

    public void setNokamar(String nokamar) {
        this.nokamar = nokamar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Kamar{" + "idtamu=" + idtamu + ", idkamar=" + idkamar + ", "
                + "idjeniskamar=" + idjeniskamar + ", harga=" + harga + ", isi="
                + isi + ", nokamar=" + nokamar + ", status=" + status + ", kelas=" 
                + kelas + '}';
    }

    
    
    
}
