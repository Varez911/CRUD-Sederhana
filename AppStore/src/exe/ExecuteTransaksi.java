/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import db.ConnectionManager;
import com.Transaksi;
import java.text.SimpleDateFormat;
/**
 *
 * @author userPC
 */
public class ExecuteTransaksi {
    public List<Transaksi> getTransaksi(){
        List<Transaksi> listTransaksi = new ArrayList<>();
        String query = "select * from transaksi inner join pelanggan on pelanggan.idpelanggan = transaksi.idpelanggan inner join kamar on kamar.idkamar = transaksi.idkamar";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Transaksi transaksi = new Transaksi();
                transaksi.setIdtransaksi(rs.getInt("idtransaksi"));
                transaksi.setIdkamar(rs.getInt("idkamar"));
                transaksi.setNoKamar(rs.getString("nokamar"));
                transaksi.setIdpelanggan(rs.getInt("idpelanggan"));
                transaksi.setNamaPelanggan(rs.getString("namapelanggan"));
                transaksi.setTotalharga(rs.getInt("totalharga"));
                transaksi.setTglCheckIn(rs.getDate("tanggalCheckin"));
                transaksi.setTglCheckOut(rs.getDate("tanggalCheckout"));
                transaksi.setTgltransaksi(rs.getDate("tanggalpemesanan"));
                listTransaksi.add(transaksi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listTransaksi;
    }    
    
    public int insertTransaksi(Transaksi _transaksi){
        int hasil = 0;
        String query = "Insert into transaksi(idtransaksi, idkamar, idpelanggan, "
                + "totalharga, tanggalpemesanan, tanggalCheckin, tanggalCheckout) "
                + "value('" + _transaksi.getIdtransaksi()+ "','" + _transaksi.getIdkamar() 
                + "','" + _transaksi.getIdpelanggan() + "','" + _transaksi.getTotalharga()
                + "','" + _transaksi.getTgltransaksi()+ "','" + _transaksi.getTglCheckIn()
                + "','" + _transaksi.getTglCheckOut() +"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int updateTransaksi(Transaksi _transaksi){
        int hasil = 0;
        String query = "update transaksi set idkamar='" + _transaksi.getIdkamar()+ "',idpelanggan='" 
                + _transaksi.getIdpelanggan()+"',totalharga='" + _transaksi.getTotalharga()
                + "', tanggalpemesanan='" + _transaksi.getTgltransaksi() + "',tanggalCheckin='" 
                + _transaksi.getTglCheckIn() + "',tanggalCheckout='" + _transaksi.getTglCheckOut()
                +"' where idjeniskamar='"+ _transaksi.getIdtransaksi()+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int deleteTransaksi(String delIdP){
        int hasil = 0;
        String query = "delete from transaksi where idtransaksi='"+ delIdP+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public Object[][] listTransaksi(){
        ExecuteTransaksi trans = new ExecuteTransaksi();
        List<Transaksi> listTransaksi = trans.getTransaksi();
        Object[][] datatrans = new Object[listTransaksi.size()][7];
        int mySize = 0;
        for (Transaksi transaksi: listTransaksi){
            datatrans[mySize][0] = transaksi.getIdtransaksi();
            datatrans[mySize][1] = transaksi.getNamaPelanggan();
            datatrans[mySize][2] = transaksi.getNoKamar();
            datatrans[mySize][3] = transaksi.getTotalharga();
            datatrans[mySize][4] = transaksi.getTgltransaksi();
            datatrans[mySize][5] = transaksi.getTglCheckIn();
            datatrans[mySize][6] = transaksi.getTglCheckOut();
            mySize++;
        }
        return datatrans;
    }
}
