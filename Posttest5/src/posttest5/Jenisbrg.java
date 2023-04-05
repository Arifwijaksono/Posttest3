package posttest5;

public class Jenisbrg extends Databrg{
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
    public void deskripsi(){
        System.out.println("Toko Kami Sangat Menyarakan Barang Yang Berkualitas Dan Tahan Lama");
    }
    public void deskripsi(int i){
        System.out.println("Data Alat Barang Berkualitas Hanya Ada: "+ i);
    }

    void tampil() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
