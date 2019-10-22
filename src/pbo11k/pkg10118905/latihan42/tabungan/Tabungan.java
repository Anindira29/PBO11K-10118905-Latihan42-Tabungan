/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan42.tabungan;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Tabungan
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo){
        this.saldo = saldo;
        System.out.println("Saldo Anda Sekarang\t:" + saldo+"\n");
        
    }
    public int ambilUang(int jumlah){
        jumlah = saldo - jumlah;
        return jumlah;
    }
    
}
