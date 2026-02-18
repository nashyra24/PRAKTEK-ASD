public class MataKuliahMain19 {

    public static void main(String[] args) {

        MataKuliah19 mk1 = new MataKuliah19();
        mk1.kodeMK = "ASD101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        System.out.println("=== Data Mata Kuliah 1 ===");
        mk1.tampilInformasi();

        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        MataKuliah19 mk2 = new MataKuliah19(
                "BD102",
                "Basis Data",
                3,
                6
        );

        System.out.println("=== Data Mata Kuliah 2 ===");
        mk2.tampilInformasi();

        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangiJam(10); 
        mk2.tampilInformasi();
    }
}