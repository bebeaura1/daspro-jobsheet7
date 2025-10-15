import java.util.Scanner;
public class KafeDoWhile06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
           System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
              namaPelanggan = sc.nextLine();
              if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break; 
              }
              System.out.print("Jumlah kopi\t\t: ");
              kopi = sc.nextInt();
              System.out.print("Jumlah teh\t\t: ");
                teh = sc.nextInt();
                System.out.print("Jumlah roti\t\t: ");
                roti = sc.nextInt();
              totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
                System.out.println("Total harga untuk " + namaPelanggan + " adalah : Rp " + totalHarga);
                sc.nextLine();
        } while (true);
        
        System.out.println("Semua transaksi selesai.");
    }
}
