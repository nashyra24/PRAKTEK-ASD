package Praktikum03;

import java.util.Scanner;

public class DosenDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // membersihkan newline

        // Membuat array of object
        Dosen19[] daftarDosen = new Dosen19[jumlah];

        // Input data menggunakan FOR
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("Kode: ");
            String kode = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P): ");
            char jkInput = sc.next().charAt(0);
            Boolean jenisKelamin = (jkInput == 'L' || jkInput == 'l');

            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine(); // membersihkan newline

            daftarDosen[i] = new Dosen19(kode, nama, jenisKelamin, usia);
        }

        // Menampilkan data menggunakan FOREACH
        System.out.println("\n===== DATA DOSEN =====");
        for (Dosen19 d : daftarDosen) {
            d.tampilData();
        }

        sc.close();
    }
}