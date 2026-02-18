public class MahasiswaMain19 {

    public static void main(String[] args) {

        Mahasiswa19 mhs1 = new Mahasiswa19();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.ubahKelas("SI 2J");
        mhs1.ubahIPK(3.55);
        mhs1.tampilkaninformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.ubahIPK(3.6);
        mhs1.tampilkaninformasi();
        
        //Konstruktor Berparameter
        Mahasiswa19 mhs2 = new Mahasiswa19 ("Annisa Nabila", "2141720160", "TI 2A", 3.25);
        mhs2.ubahIPK(3.30);
        mhs2.tampilkaninformasi();
    }   
}