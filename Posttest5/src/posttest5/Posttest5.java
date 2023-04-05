package posttest5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author PC-05
 */
public class Posttest5 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Jenisbrg> listbrg = new ArrayList<>();
    static ArrayList<brgready> listjns = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
    static final void display() { // final method
        System.out.println("\n=================================================");
        System.out.println("|                   List Data                   |");
    }
    
    private static void tambahData() throws IOException {
        System.out.println("Jenis data");
        System.out.println("1. BrgReady");
        System.out.println("2. JenisBrg");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("========== Masukkan Data BrgReady ==========");
            System.out.print("Masukkan KodeBrg                : ");
            String kodebrg = input.readLine();
            System.out.print("Masukkan NamaBrg                : ");
            String namabrg = input.readLine();
            System.out.print("Masukkan StokAwal               :");
            int stokawal = Integer.parseInt(input.readLine());
            System.out.print("Masukkan StokKeluar             : ");
            int stokkeluar = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Stokmasuk              : ");
            int stokmasuk = Integer.parseInt(input.readLine());
            System.out.print("Masukkan HargaBrg               : ");
            int hargabrg = Integer.parseInt(input.readLine());
            System.out.print("Masukkan NoBarang               : ");
            int nobarang = Integer.parseInt(input.readLine());
            System.out.println("=============================================");
            listjns.add(new brgready(kodebrg, namabrg, stokawal, stokkeluar, stokmasuk, hargabrg, nobarang));
            System.out.println("Data " + kodebrg + " berhasil ditambahkan!");

        }else if(pil == 2){
            System.out.println("========== Masukkan Data JenisBrg ==========");
            System.out.print("Masukkan KodeBrg                : ");
            String kodebrg = input.readLine(); 
            System.out.print("Masukkan NamaBrg                : ");
            String namabrg = input.readLine();
            System.out.print("Masukkan StokAwal               : ");
            int stokawal = Integer.parseInt(input.readLine());
            System.out.print("Masukkan StokKeluar             : ");
            int stokkeluar = Integer.parseInt(input.readLine());
            System.out.print("Masukkan StokMasuk              : ");
            int stokmasuk = Integer.parseInt(input.readLine());
            System.out.print("Masukkan HargaBeli              : ");
            int hargabeli = Integer.parseInt(input.readLine());
            System.out.print("Masukkan HargaJual              : ");
            int hargajual = Integer.parseInt(input.readLine());
            System.out.println("=============================================");
            listbrg.add(new Jenisbrg(kodebrg, namabrg, stokawal, stokkeluar, stokmasuk, hargabeli, hargajual));
            System.out.println("Data " + kodebrg + " berhasil ditambahkan!");

        }else{
            System.out.println("Pilihan Salah");

        }
    }
    
    private static void lihatData() throws IOException{
        System.out.println("Jenis data");
        System.out.println("1. BrgReady");
        System.out.println("2. JenisBrg");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        switch (pil) {
            case 1 -> {
                System.out.println("\n============ List Data BrgReady ============");
                if (listjns.isEmpty()){
                    System.out.println("Belum ada data yang tersimpan!");
                }else{
                    for(int i = 0; i < listjns.size();i++){
                    System.out.println("Data ke-" + (i+1));
                    listjns.get(i).tampil();
                    }
                }
                System.out.println("===========================================");
            }
            case 2 -> {
                System.out.println("\n=========== List Data JenisBrg ===========");
                if (listbrg.isEmpty()){
                    System.out.println("Belum ada data yang tersimpan!");
                }else{
                   for(int i = 0; i < listbrg.size();i++){
                    System.out.println("Data ke-" + (i+1));
                    listbrg.get(i).tampil();
                }
                }   System.out.println("=======================================");
            }
            default ->System.out.println("Pilihan salah");
        }
    }
    
    private static void editData() throws IOException{
        System.out.println("Jenis data");
        System.out.println("1. brgready");
        System.out.println("2. JenisBrg");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listjns.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data BrgReady yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listjns.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    brgready jns = listjns.get(index);
                    System.out.println("Data BrgReady dengan indeks " + index);
                    System.out.println(jns);
                    System.out.println("======= Masukkan data BrgReady yang baru =======");
                    System.out.print("Masukkan KodeBrg                  : ");                  
                    jns.setkodebrg(input.readLine());
                    System.out.print("Masukkan NamaBrg                  : ");
                    jns.setnamabrg(input.readLine());
                    System.out.print("Masukkan Stokawal: ");
                    jns.setstokawal(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan StokKeluar               : ");
                    jns.setstokkeluar(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan StokMasuk                : ");
                    jns.sethargabrg(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan HargaBrg                 : ");
                    jns.setnobarang(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan NoBarang                 : ");
                    System.out.println("=================================================");
                    System.out.println("Data BrgReady berhasil diubah!");
                }
            }
        }else if(pil == 2){
            if (listbrg.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data JenisBrg yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listbrg.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Jenisbrg brg = listbrg.get(index);
                    System.out.println("Data dosen dengan indeks " + index);
                    System.out.println(brg);
                    System.out.println("======= Masukkan data JenisBrg yang baru =======");
                    System.out.print("Masukkan KodeBrg                 : ");                  
                    brg.setkodebrg(input.readLine());
                    System.out.print("Masukkan NamaBrg                 : ");
                    brg.setnamabrg(input.readLine());
                    System.out.print("Masukkan StokAwal: ");
                    brg.setstokawal(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan StokKeluar              : ");
                    brg.setstokkeluar(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan StokMasuk               : ");
                    brg.setstokmasuk(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan HargaBeli               : ");
                    brg.sethargabeli(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan HargaJual               : ");
                    brg.sethargajual(Integer.parseInt(input.readLine()));
                    System.out.println("=================================================");
                    System.out.println("Data JenisBrg berhasil diubah!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
    private static void hapusData() throws IOException{
        System.out.println("Jenis data");
        System.out.println("1. BrgReady");
        System.out.println("2. JenisBrg");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listjns.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data BrgReady yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listjns.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    brgready brg = listjns.get(index);
                    listjns.remove(index);
                    System.out.println("Data Jenisbrg dengan indeks " + index + " berhasil dihapus:");
                }
            }
        }else if(pil == 2){
            if (listbrg.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data JenisBrg yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listbrg.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Jenisbrg jns = listbrg.get(index);
                    listbrg.remove(index);
                    System.out.println("Data JenisBrg dengan indeks " + index + " berhasil dihapus:");
                  
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
    public static void DeskripsiData()throws IOException{
        Jenisbrg Jenisbrg = new Jenisbrg ();
        brgready brgready = new brgready();
        
        System.out.println("Jenis Baarang");
        System.out.println("1. Jenis Barang");
        System.out.println("2. Barang Ready");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            Jenisbrg.deskripsi();
            Jenisbrg.deskripsi(listjns.size());
        }else if(pil == 2){
            brgready.deskripsi();
            brgready.deskripsi(listbrg.size());
        }else{
            System.out.println("Piilihan salah!");
        }
    }
    private static void main(String[] args) throws IOException  {
        boolean menu = true;
        while(menu == true){
        System.out.println("""
                           Program Pendataan Toko Elektronik
                           ====================================
                           | 1. Menambah Data                 |
                           | 2. Melihat Data                  |
                           | 3. Mengubah Data                 |
                           | 4. Menghapus Data                |
                           | 5. Deskripsi                     |
                           | 6. Keluar Program                |
                           ====================================
                           """);
        System.out.print("Pilih: ");
        int pilih = Integer.parseInt(input.readLine());
        switch(pilih){
            case 1:
                tambahData();
                froze();
                break;
            case 2:
                lihatData();
                froze();
                break;
            case 3:
                editData();
                froze();
                break;
            case 4:
                hapusData();
                froze();
                break;
            case 5:
                DeskripsiData();
                break;
            case 6:
                System.out.println("Program dihentikan");
                menu = false;
                break;
            default:
                System.out.println("Pilihan salah");
                froze();
                break;
            }
        }
    }


    
    
}
