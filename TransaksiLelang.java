/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pak_Candra.UKLelang;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author moklet
 */
public class TransaksiLelang {
    Scanner k = new Scanner (System.in);
    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hTawar = new ArrayList<Integer>();
    
    boolean exit = false;
    int idx;
    
    public void mulai (BarangLelang barang, PetugasLelang petugas, MasyarakatLelang masyarakat, LaporanLelang lapor, TransaksiLelang trans){
        
        lapor.laporan(barang, petugas);
        System.out.print("Masukkan ID Barang yang ingin ditawar [Angka Pertama pada ID] :  ");
        idx = k.nextInt();
        if (idx > 2){
            System.out.println("\nMaaf, ID Barang tidak tersedia, silahkan mulai ulang program.");
            batal ();
        }
        else {
        proses (barang, petugas, masyarakat, lapor, idx);
        }
    }
    
    public void batal (){
            System.out.println("\n+-------------------------+");
            System.out.println("|  [ LELANG DIBATALKAN ]  |");
            System.out.println("+-------------------------+");
    }

    
    public void proses (BarangLelang barang, PetugasLelang petugas, MasyarakatLelang masyarakat, LaporanLelang lapor, int idx){
        int idp;
        int tawar;
            lapor.dbarang(barang, idx);
            System.out.println("\n+-------------------------+");
            System.out.println("|   [ LELANG DIMULAI ]    |");
            System.out.println("+-------------------------+");
            System.out.println("\n===========================");
            System.out.println("|   [ DAFTAR PELELANG ]   |");
            System.out.println("===========================");
            for (int i = 0; i < masyarakat.getJum(); i++){
            System.out.println( i + ". " + masyarakat.getNama(i) + "\n Alamat : " + masyarakat.getAlamat(i) + "\n Telp : " + masyarakat.getTelp(i));
        }
        do{
            System.out.print("Masukkan ID Penawar: ");
            idp = k.nextInt();
            if (idp <= 2){  
            do{
            System.out.print("Masukkan Harga Penawaran: ");
            tawar = k.nextInt();
            boolean status ;
            if (tawar > 0){
                status = false;
        }
            else {
                status = true;  
            }
            if (tawar > barang.gethAwal(idx)) {
            barang.hbaru(idx, tawar);
            lapor.dbarang(barang, idx);
            System.out.print("\nApakah ada yang ingin menambah harga penawaran [ 1. Ya | 2. Tidak ] ");
            int jawab = k.nextInt();
            if (jawab == 1){
            exit = true;
        }
            else if(jawab == 2){
            exit = false;
            System.out.println("\n+-------------------------+");
            System.out.println("|   [ LELANG BERHASIL ]   |");
            System.out.println("+-------------------------+");
            System.out.println("Pemenang \t : " + masyarakat.getNama(idp));
            System.out.println("ID Barang \t : " + barang.getId(idx));
            System.out.println("Nama Barang \t : " + barang.getNBarang(idx));
            System.out.println("Harga Akhir \t : " + barang.gethAwal(idx));
            System.out.println("Status \t\t : " + status);
            System.out.println("\nSaya " + petugas.getNama(0) + ", selaku petugas lelang kali ini mengucapkan : ");
            System.out.println("----------------------------------------------------------------------------------------");            
            System.out.println("+--------------- TERIMAKASIH! Telah mengikuti lelang di Pelelangan Tav! ---------------+");
        }
            else {
            System.out.println("Maaf, input yang anda masukkan salah. Silahkan mulai ulang program.");
            batal();
            }
            }
            } while(tawar < barang.gethAwal(idx));
            } 
            else if (idp > 2) {
                    System.out.println("\nMaaf, anda belum terdaftar dalam pelelangan. Silahkan datang lain kali.");
                    batal(); 
                    break;
                }
        } while(exit == true); 
    }
    public void setId (int id){
        this.idPenawar.add(id);
    }
    
    public void setIdBar (int id){
        this.idBarang.add(id);
    }
    
    public void setHarga (int har){
        this.hTawar.add(har);
    }
    
    public int getHarga (int ind){
        return this.hTawar.get(ind);   
    }
    
    public int getId (int ind){
        return this.getId(ind);
    }
    
}