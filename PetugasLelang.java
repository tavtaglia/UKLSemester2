/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pak_Candra.UKLelang;
import java.util.ArrayList;

/**
 *
 * @author moklet
 */
public class PetugasLelang implements AdminLelang {
    // kelas anak dari kelas induk admin
    // private adalah salah satu bentuk enkapsulasi
    private ArrayList<String> nPetugas = new ArrayList<String>();  
    private ArrayList<String> aPetugas = new ArrayList<String>();  
    private ArrayList<String> tPetugas = new ArrayList<String>(); 
    public int jumlah = nPetugas.size();
    // tipe data - variabel - semuanya atribut
    
    // overload - constructor - ada parameternya
    public PetugasLelang (){
        addPetu ("Parhan", "Seoul", "08101032002");
    }
    
    public void addPetu (String nama, String alamat, String telp){
        setNama (nama);
        setAlamat (alamat);
        setTelp (telp);
    }
    
    public int getJumlah (int jPetugas){
        return this.nPetugas.size();
    }
    
    // polimorfisme override - fungsinya sama
   @Override 
    public void setNama (String nama){
        this.nPetugas.add(nama);
    }
    
    public String getNama (int id){
        return this.nPetugas.get(id);
    }
    
    @Override
    public void setAlamat (String alamat){
        this.aPetugas.add(alamat);
    }
    
    public String getAlamat (int idp){
        return this.aPetugas.get(idp);
    }
    
    @Override
    public void setTelp (String telp){
        this.tPetugas.add(telp);
    }
    
    public String getTelp (int idp){
        return this.tPetugas.get(idp);
    }
}
