import java.util.Scanner;
public class PenjualanTiket06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket, totalTiket = 0;
        double totalPenjualan = 0, hargaTiket = 50000;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai)\t: ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif.");
                continue; 
            }
            if (jumlahTiket == 0) {
                break; 
            }
            double totalHarga = jumlahTiket * hargaTiket;
            if (jumlahTiket > 10) {
                totalHarga -= totalHarga * 0.15;
            } else if (jumlahTiket > 4) {
                totalHarga -= totalHarga * 0.10;
            }

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Total harga yang harus dibayar\t\t\t\t: Rp " + totalHarga);
        } while (true);

        System.out.println("\n=== LAPORAN PENJUALAN HARI INI ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalPenjualan);
    }
}
