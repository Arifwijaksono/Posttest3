package posttest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Jenisbrg extends Databrg{
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Jenisbrg> listBrg = new ArrayList<>();
    private int hargabeli;
    private int hargajual;
    
    public Jenisbrg(String kodebrg, String namabrg, int stokawal, int stokkeluar, int stokmasuk, int hargabeli, int hargajual) {
        super(kodebrg, namabrg, stokawal, stokkeluar, stokmasuk);
        this.hargabeli = hargabeli;
        this.hargajual = hargajual;
    }
    
    public Jenisbrg(){}
    
    
    public void notif() {
        System.out.println("Berhasil ditambahkan diJenisbrg. ");
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
    @Override
    public void deskripsi(){
        System.out.println("Toko Kami Sangat Menyarakan Barang Yang Berkualitas Dan Tahan Lama");
    }
    @Override
    public void deskripsi(int i){
        System.out.println("Data Alat Barang Berkualitas Hanya Ada: "+ i);
    }

    void tampil() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void SEE() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
