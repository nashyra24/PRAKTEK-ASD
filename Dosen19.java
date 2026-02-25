package Praktikum03;

public class Dosen19 {
    String kode;
    String nama;
    Boolean jenisKelamin; // true = Laki-laki, false = Perempuan
    int usia;

    // Constructor (HARUS sama dengan nama class)
    public Dosen19(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    // Method untuk menampilkan data dosen
    public void tampilData() {
        String jk;
        if (jenisKelamin) {
            jk = "Laki-laki";
        } else {
            jk = "Perempuan";
        }

        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia          : " + usia);
        System.out.println("-----------------------------");
    }
}