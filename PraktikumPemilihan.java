import java.util.Scanner;

public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================");

        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = input.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input.nextDouble();
        
        System.out.println("================================");
        System.out.println("================================");

        // Validasi nilai
        if (!isValid(nilaiTugas) || !isValid(nilaiKuis) || 
            !isValid(nilaiUTS) || !isValid(nilaiUAS)) {
            System.out.println("nilai tidak valid");
            return;
        }

        // Hitung nilai akhir
        double nilaiAkhir = (0.2 * nilaiTugas) + 
                            (0.2 * nilaiKuis) + 
                            (0.3 * nilaiUTS) + 
                            (0.3 * nilaiUAS);

        // Tentukan nilai huruf
        String nilaiHuruf;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // Status kelulusan
        String status = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") ||
                         nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") ||
                         nilaiHuruf.equals("C")) ? "LULUS" : "TIDAK LULUS";

        // Output
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA " + status.toUpperCase());
    }

    // Fungsi validasi nilai
    public static boolean isValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }
}
