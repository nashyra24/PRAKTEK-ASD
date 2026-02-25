package Praktikum03;
import java.util.Scanner;

public class MatakuliahDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah19[] arrayOfMatakuliah = new Matakuliah19[jumlah];

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            arrayOfMatakuliah[i] = new Matakuliah19();

            System.out.println("\nMasukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            String kode = sc.nextLine();

            System.out.print("Nama       : ");
            String nama = sc.nextLine();

            System.out.print("SKS        : ");
            int sks = Integer.parseInt(sc.nextLine());

            System.out.print("Jumlah Jam : ");
            int jumlahJam = Integer.parseInt(sc.nextLine());

            // Method tambahData()
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        System.out.println("\n===== DATA MATAKULIAH =====");
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            // Method cetakInfo()
            arrayOfMatakuliah[i].cetakInfo();
        }

        sc.close();
    }
}