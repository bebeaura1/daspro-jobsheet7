import java.util.Scanner;
public class SiakadFor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
/*
        for (int i = 1; i <= 10; i++) {
          System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }  
        }

*/
        int mhs = 10, lulus = 0, tidakLulus = 0;
        for (int i = 1; i <= mhs; i++) {
          System.out.print("Masukkan nilai mahasiswa ke-" + i + "\t\t: ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            } 
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
      }

        System.out.println("\nNilai tertinggi adalah\t\t\t: " + tertinggi);
        System.out.println("Nilai terendah adalah\t\t\t: " + terendah);
        System .out.println("\nJumlah mahasiswa yang lulus\t\t: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus\t: " + tidakLulus);

    }
}