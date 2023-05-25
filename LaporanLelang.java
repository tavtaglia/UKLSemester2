/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pak_Candra.UKLelang;

/**
 *
 * @author moklet
 */

public class LaporanLelang {
    public void laporan (BarangLelang barang, PetugasLelang petugas){
        int y = barang.getTotal();
        System.out.println("+------------------ HALO! Selamat Datang di Pelelangan Tav ------------------+");
        System.out.println("Saya " + petugas.getNama(0) + ", petugas lelang kali ini. Apabila "
                + "ada hal yang ingin ditanyakan, \nsilahkan menghubungi saya di : " + petugas.getTelp(0));
        System.out.println("------------------------------------------------------------------------------");
            System.out.println("\n===========================");
            System.out.println("|    [ DAFTAR BARANG ]    |");
            System.out.println("===========================");
        for (int i = 0; i < y; i++){
            System.out.println("Nama Barang\t : " + barang.getNBarang(i));
            System.out.println("ID Barang\t : " + i + ". "+ barang.getId(i));
            System.out.println("Harga Awal\t : " + barang.gethAwal(i));
            System.out.println("Status           : " + barang.getStatus(i));
            System.out.println("--------------------------------------------------------------------------");
        }
    }

    public void laporan (PetugasLelang petugas){
        int h = petugas.jumlah;
        for (int i = 0; i < h; i++){
            System.out.println("[ Daftar Petugas ]");
            System.out.println("Nama \t : " + petugas.getNama(h));
            System.out.println("Alamat \t : " + petugas.getAlamat(h));
            System.out.println("Telepon \t : " + petugas.getTelp(h));
        }
    }
    
    
    
    public void dbarang (BarangLelang barang, int idx){
        System.out.println("\n===========================");
        System.out.println("|   [ BARANG TERPILIH ]   |");
        System.out.println("===========================");
        System.out.println("ID Barang \t : " + barang.getId(idx));
        System.out.println("Nama Barang \t : " + barang.getNBarang(idx));
        System.out.println("Harga Awal \t : " + barang.gethAwal(idx));
        System.out.println("Status Barang\t : " + barang.getStatus(idx));
    }   
}