package posttest5;


// abstract class
public abstract class Databrg { 
    protected  final String provinsi = "Bontang, Kalimantan Timur"; // final pada atribut
     private String kodebrg; // atribut yang hanya bisa diakses di class yang sama
    private String namabrg;
    private int stokawal;
    private int stokkeluar;
    private int stokmasuk;
    private int stokakhir;

    // untuk membuat objek baru dari class dgn nilai atribut yang telah
    // diinisialisasi pada saat objek dibuat.
    public Databrg(String kodebrg, String namabrg, int stokawal, int stokkeluar, int stokmasuk) {
        this.kodebrg = kodebrg; // untuk menginisialisasi atribut "name"
        this.namabrg = namabrg;
        this.stokawal = stokawal;
        this.stokkeluar = stokkeluar;
        this.stokmasuk = stokmasuk;
        this.stokakhir = stokakhir;
       
    }
    
    public Databrg(){}
    
    public String getkodebrg() {
        return kodebrg;
    }

    /**
     * @param kodebrg the kodebrg to set
     */
    public void setkodebrg(String name) {
        this.kodebrg = kodebrg;
    }

    /**
     * @return the namabrg
     */
    public String getnamabrg() {
        return namabrg;
    }

    /**
     * @param namabrg the namabrg to set
     */
    public void setnamabrg(String namabrg) {
        this.namabrg = namabrg;
    }

    /**
     * @return the stokawal
     */
    public int getstokawal() {
        return stokawal;
    }

    /**
     * @param stokawal the stokawal to set
     */
    public void setstokawal(int stokawal) {
        this.stokawal = stokawal;
    }

    /**
     * @return the stokkeluar
     */
    public int getstokkeluar() {
        return stokkeluar;
    }

    /**
     * @param stokkeluar the stokkeluar to set
     */
    public void setstokkeluar(int stokkeluar) {
        this.stokkeluar = stokkeluar;
    }

    /**
     * @return the stokmasuk
     */
    public int getstokmasuk() {
        return stokmasuk;
    }

    /**
     * @param stokmasuk the stokmasuk to set
     */
    public void setstokmasuk(double stokmasuk) {
        this.stokmasuk = (int) stokmasuk;
    }
    
    /**
     * @return the stokakhir
     */
    public int getstokakhir() {
        return stokakhir;
    }

    /**
     * @param stokakhir the stokakhir to set
     */
    public void setstokakhir(int stokakhir) {
        this.stokakhir = stokakhir;
    }
 @Override
    public String toString() {
        return "Kode: " + kodebrg + "\nNama: " + namabrg + "\nStokAwal: " + stokawal + "\nStokKeluar: " + stokkeluar + "\nStokMasuk: " + stokmasuk + "\nStokAkhiir: " + stokakhir;
    }

    public void deskripsi(){
        System.out.println("Alat-Alat Di Toko Kami Sangat Di Pastikan Kualitas Ketahanannya Dan Mempunyai Garansi Selama 1 Tahun");
    }
    
    public void deskripsi(int i){
        System.out.println("Data Alat Elektronik Hanya Ada: "+ i);
    }
}

