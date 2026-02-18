public class Dosen19 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    Dosen19() {
        idDosen = "Belum diisi";
        nama = "Belum diisi";
        statusAktif = false;
        tahunBergabung = 0;
        bidangKeahlian = "Belum diisi";
    }

    Dosen19(String idDosen, String nama, boolean statusAktif,
            int tahunBergabung, String bidangKeahlian) {

        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
