/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor3
 */
package Pak_Candra.UKLelang;


/**
 *
 * @author moklet
 */
public class Lelang {
    public static void main(String[] args) {
        BarangLelang barang = new BarangLelang();
        PetugasLelang petugas = new PetugasLelang();
        MasyarakatLelang masyarakat = new MasyarakatLelang ();
        TransaksiLelang trans = new TransaksiLelang();
        LaporanLelang lapor = new LaporanLelang();
        trans.mulai(barang, petugas, masyarakat, lapor, trans);
    }
    
}
