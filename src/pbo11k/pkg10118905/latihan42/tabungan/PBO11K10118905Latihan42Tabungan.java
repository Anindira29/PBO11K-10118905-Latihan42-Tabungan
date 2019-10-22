/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan42.tabungan;
import java.util.*;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Tabungan
 */
public class PBO11K10118905Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Saldo Awal\t:");
        int i = Scanner.nextInt();
        Tabungan t = new Tabungan(i);
        System.out.println("Jumlah Uang Yang Diambil:");
        int ambil = Scanner.nextInt();
        System.out.println("Sisa Tabungan Anda\t:" +t.ambilUang(ambil));
        
    }
    
}
