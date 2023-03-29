package posttest3;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *
package Posttest3;

/**
 *
 * @author LENOVO
 */
public class Jenisbrg extends Data{
    private int hargabeli;
    private int hargajual;
    
    public Jenisbrg(String kodebrg, String namabrg, int stokawal, int stokkeluar, int stokmasuk, int hargabeli, int hargajual) {
        super(kodebrg, namabrg, stokawal, stokkeluar, stokmasuk);
        this.hargabeli = hargabeli;
        this.hargajual = hargajual;
    }
    
    
    
    
    
    public void notif() {
        System.out.println("Berhasil ditambahkan dikategori Anak - anak. ");
    }

    public int gethargabeli() {
        return (int) hargabeli;
    }

  
    public void sethargabeli(int hargabeli) {
        this.hargabeli = hargabeli;
    }

    
    public int gethargajual() {
        return hargajual;
    }

    
    public void sethargajual(int hargajual) {
        this.hargajual = hargajual;
    }
}
    
