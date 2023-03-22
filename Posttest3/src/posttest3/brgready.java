/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author LENOVO
 */
public class brgready extends Data{
    private int hargabrg;
    private int nobarang;
    
    public brgready(String kodebrg, String namabrg, int stokawal, int stokkeluar, int stokmasuk, int hargabrg, int nobarang) {
        super(kodebrg, namabrg, stokawal, stokkeluar, stokmasuk);
        this.hargabrg = hargabrg;
        this.nobarang = nobarang;
    }

    
    public int gethargabrg() {
        return hargabrg;
    }

    
    public void sethargabrg(int hargabrg) {
        this.hargabrg = hargabrg;
    }

    
    public int getnobarang() {
        return nobarang;
    }

    
    public void setnobarag(int nobarang) {
        this.nobarang = nobarang;
    }

    void setnobarang(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

