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
public class MasyarakatLelang implements AdminLelang {
    private ArrayList<String> nMasyarakat = new ArrayList<String>();
    private ArrayList<String> aMasyarakat = new ArrayList<String>();
    private ArrayList<String> tMasyarakat = new ArrayList<String>();
    public int jumlah = nMasyarakat.size();
    
    public MasyarakatLelang (){
        
       this.nMasyarakat.add("Keita");
        this.aMasyarakat.add("Osaka");
        this.tMasyarakat.add("08104072001");
        
        this.nMasyarakat.add("Leejeong");
        this.aMasyarakat.add("Seoul");
        this.tMasyarakat.add("08111092002");
        
        this.nMasyarakat.add("Ricky");
        this.aMasyarakat.add("Shanghai");
        this.tMasyarakat.add("08120052004");
    }
    
    
    public int getJum (){
        return this.nMasyarakat.size();
    }
    
    @Override
    public void setNama (String nama){
        this.nMasyarakat.add(nama);
    }
    
    public String getNama (int id){
        return this.nMasyarakat.get(id);
    }
    
    @Override
    public void setAlamat (String alamat){
        this.aMasyarakat.add(alamat);
    }
    
    public String getAlamat (int id){
        return this.aMasyarakat.get(id);
    }
    
    @Override
    public void setTelp (String telp){
        this.tMasyarakat.add(telp);
    }
    
    public String getTelp (int id){
        return this.tMasyarakat.get(id);
    }
}
