/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg4.kambing;

/**
 *
 * @author 
 * NAMA  : Guntur Maulana Ibrahim
 * Kelas : PBO1
 * NIM   : 10118032
 * Deskripsi Program : Program ini berisi untuk menampilkan Kambing yang sudah ditambkan
 */
public class PBO110118032Latihan4Kambing {
    
    public void tambahKambing(){
        //Deklarasi var lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " +jumlahKambing);
    }
    public static void main(String[] args) {
        PBO110118032Latihan4Kambing kambingJantan = new PBO110118032Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
