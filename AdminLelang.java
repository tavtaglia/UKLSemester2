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
public interface AdminLelang {
    // abstak - kelas induk atau superclass punya anak masyarakat & petugas - interface
    public void setNama (String nama);
    public void setAlamat (String alamat);
    public void setTelp (String telp);
    
    public String getNama (int id);
    public String getAlamat (int id);
    public String getTelp (int id);
}
