package Praktikum03;

public class DataDosen19 {

    // a. Menampilkan semua dosen
    public void dataSemuaDosen(Dosen19[] arrayOfDosen) {
        System.out.println("\n===== DATA SEMUA DOSEN =====");
        for (Dosen19 d : arrayOfDosen) {
            d.tampilData();
        }
    }

    // b. Jumlah dosen per jenis kelamin
    public void jumlahDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen19 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        System.out.println("Jumlah Pria   : " + pria);
        System.out.println("Jumlah Wanita : " + wanita);
    }

    // c. Rata-rata usia per jenis kelamin
    public void rerataUsiaDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen19 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jumlahPria++;
            } else {
                totalWanita += d.usia;
                jumlahWanita++;
            }
        }

        double rataPria = jumlahPria > 0 ? (double) totalPria / jumlahPria : 0;
        double rataWanita = jumlahWanita > 0 ? (double) totalWanita / jumlahWanita : 0;

        System.out.println("\n===== RATA-RATA USIA DOSEN =====");
        System.out.println("Rata-rata usia Pria   : " + rataPria);
        System.out.println("Rata-rata usia Wanita : " + rataWanita);
    }

    // d. Dosen paling tua
    public void infoDosenPalingTua(Dosen19[] arrayOfDosen) {
        Dosen19 tertua = arrayOfDosen[0];

        for (Dosen19 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\n===== DOSEN PALING TUA =====");
        tertua.tampilData();
    }

    // e. Dosen paling muda
    public void infoDosenPalingMuda(Dosen19[] arrayOfDosen) {
        Dosen19 termuda = arrayOfDosen[0];

        for (Dosen19 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\n===== DOSEN PALING MUDA =====");
        termuda.tampilData();
    }
}