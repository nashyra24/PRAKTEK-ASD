public class DosenMain19 {

    public static void main(String[] args) {

        Dosen19 dosen1 = new Dosen19();

        dosen1.idDosen = "DSN001";
        dosen1.nama = "Dr. Andi Wijaya";
        dosen1.setStatusAktif(true);
        dosen1.tahunBergabung = 2015;
        dosen1.ubahKeahlian("Algoritma dan Struktur Data");

        System.out.println("=== DATA DOSEN 1 ===");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja (2025): "
                + dosen1.hitungMasaKerja(2025) + " tahun");

        System.out.println();

        Dosen19 dosen2 = new Dosen19(
                "DSN002",
                "Prof. Siti Rahma",
                true,
                2010,
                "Artificial Intelligence"
        );

        System.out.println("=== DATA DOSEN 2 ===");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja (2025): "
                + dosen2.hitungMasaKerja(2025) + " tahun");


        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Machine Learning");

        System.out.println("\n=== SETELAH PERUBAHAN DOSEN 2 ===");
        dosen2.tampilInformasi();
    }
}