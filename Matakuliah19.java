package Praktikum03;

public class Matakuliah19 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    // Constructor kosong
    public Matakuliah19() {
    }

    // Method untuk menambahkan data
    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Method untuk menampilkan data
    public void cetakInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("-----------------------------");
    }
}