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
public class Staff {
    private int idstaff;
    private String namastaff;

    public Staff() {
    }

    public Staff(int idstaff, String namastaff) {
        this.idstaff = idstaff;
        this.namastaff = namastaff;
    }

    public int getIdstaff() {
        return idstaff;
    }

    public void setIdstaff(int idstaff) {
        this.idstaff = idstaff;
    }

    public String getNamastaff() {
        return namastaff;
    }

    public void setNamastaff(String namastaff) {
        this.namastaff = namastaff;
    }

    @Override
    public String toString() {
        return "Staff{" + "idstaff=" + idstaff + ", namastaff=" + namastaff + '}';
    }
    
    
}
