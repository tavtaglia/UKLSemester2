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
public class BarangLelang {
    
    private ArrayList <Integer> idBarang = new ArrayList <Integer>();
    private ArrayList <String> nBarang = new ArrayList <String>();
    private ArrayList <Integer> hAwal = new ArrayList <Integer>();
    private ArrayList <Boolean> status = new ArrayList <Boolean>();
    int ht;
    
    
    public BarangLelang (){
        this.idBarang.add(12345);
        this.nBarang.add("Lukisan Karya Leonardo da Vinci : Salvator Mundi");
        this.hAwal.add(15000000);
        this.status.add(Boolean.TRUE);
        
        this.idBarang.add(24351);
        this.nBarang.add("Lukisan Karya Willem de Kooning : Interchange");
        this.hAwal.add(17500000);
        this.status.add(Boolean.TRUE);   
        
        this.idBarang.add(35142);
        this.nBarang.add("Lukisan Karya Paul Cezanne : The Card Players");
        this.hAwal.add(18000000);
        this.status.add(Boolean.TRUE);
    }
    
    public void addBarang (int id, int harga, String nBarang, BarangLelang BarangLelang){
        setId (id);
        sethAwal (ht, BarangLelang);
        setNBarang (nBarang);
        setStatus(true);
    }

    public int getId (int id) {
        return this.idBarang.get(id);
    }

    public void setId(int id) {
        this.idBarang.add(id);
    }

    public String getNBarang(int id) {
        return this.nBarang.get(id);
    }

    public void setNBarang(String barang) {
        this.nBarang.add(barang);
    }

    public int gethAwal(int id) {
        return this.hAwal.get(id);
    }

    public void sethAwal(int ht, BarangLelang barang) {
        this.hAwal.add(barang.ht);
    }
    
    public boolean getStatus(int id) {
        return this.status.get(id);
    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }
    
    public int editS (int a, int ht){
        return a-ht;
    }

    public int getTotal(){
        return this.nBarang.size();
    }
    
    public int hbaru(int idx, int tawar){
        return this.hAwal.set(idx, tawar);
    }
}
