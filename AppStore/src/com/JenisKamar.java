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
public class JenisKamar {
    private int idjeniskamar, hargakamar, isikamar;
    private String kelaskamar;

    public JenisKamar() {
    }

    public JenisKamar(int idjeniskamar, int hargakamar, int isikamar, 
            String kelaskamar) {
        this.idjeniskamar = idjeniskamar;
        this.hargakamar = hargakamar;
        this.isikamar = isikamar;
        this.kelaskamar = kelaskamar;
    }

    public int getIdjeniskamar() {
        return idjeniskamar;
    }

    public void setIdjeniskamar(int idjeniskamar) {
        this.idjeniskamar = idjeniskamar;
    }

    public int getHargakamar() {
        return hargakamar;
    }

    public void setHargakamar(int hargakamar) {
        this.hargakamar = hargakamar;
    }

    public int getIsikamar() {
        return isikamar;
    }

    public void setIsikamar(int isikamar) {
        this.isikamar = isikamar;
    }

    public String getKelaskamar() {
        return kelaskamar;
    }

    public void setKelaskamar(String kelaskamar) {
        this.kelaskamar = kelaskamar;
    }

    @Override
    public String toString() {
        return "JenisKamar{" + "idjeniskamar=" + idjeniskamar + ", hargakamar=" 
                + hargakamar + ", isikamar=" + isikamar + ", kelaskamar=" 
                + kelaskamar + '}';
    }
    
    
    
}
