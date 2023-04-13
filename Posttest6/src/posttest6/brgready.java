package posttest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public abstract class brgready extends Databrg{
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<brgready> listVip = new ArrayList<>();
    private int hargabrg;
    private int nobarang;
    
    public brgready(String kodebrg, String namabrg, int stokawal, int stokkeluar, int stokmasuk, int hargabrg, int nobarang) {
        super(kodebrg, namabrg, stokawal, stokkeluar, stokmasuk);
        this.hargabrg = hargabrg;
        this.nobarang = nobarang;
    }

    public brgready(){}
    
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
    

    @Override
    public void deskripsi(){
        System.out.println("Barang Di Toko Kami Selalu Banyak Stok Dan Di Pastikan Barang Yang Anda Butuhkan Selalu Ready");
    }
    @Override
    public void deskripsi(int i){
        System.out.println("Data Barang Ready Hanya Ada: "+ i);
    }

    void setnobarang(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void tampil() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void SEE() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

