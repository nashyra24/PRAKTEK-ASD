package Praktikum03;

import java.util.Scanner;

public class DosenDemo19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen19[] daftarDosen = new Dosen19[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("Kode: ");
            String kode = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (P/W): ");
            char jk = sc.next().charAt(0);
            sc.nextLine();

            Boolean jenisKelamin = (jk == 'P' || jk == 'p'); // P = Pria

            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine();

            daftarDosen[i] = new Dosen19(kode, nama, jenisKelamin, usia);
        }

        DataDosen19 data = new DataDosen19();

        data.dataSemuaDosen(daftarDosen);
        data.jumlahDosenPerJenisKelamin(daftarDosen);
        data.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        data.infoDosenPalingTua(daftarDosen);
        data.infoDosenPalingMuda(daftarDosen);

        sc.close();
    }
}