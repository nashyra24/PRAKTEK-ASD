public class Mahasiswa19Nashyra {

    public static void main(String[] args) {

        // Membuat object dari class Mahasiswa19
        Mahasiswa19 mhsNashyra = new Mahasiswa19(
                "Nashyra Afaf Fayyaza",
                "254107060048",
                "SIB 1A",
                3.78
        );

        // Menampilkan informasi mahasiswa
        mhsNashyra.tampilkaninformasi();
        System.out.println("Nilai Kinerja: " + mhsNashyra.nilaiKinerja());
    }
}