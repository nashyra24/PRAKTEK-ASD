import java.util.Scanner;

public class JadwalKuliah {

    // Input data jadwal kuliah
    public static void inputJadwal(String[][] jadwal, int n, Scanner input) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal kuliah ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = input.nextLine();
        }
    }

    // Menampilkan semua data jadwal kuliah
    public static void tampilkanSemua(String[][] jadwal, int n) {
        System.out.println("\n=== TABEL JADWAL KULIAH ===");
        System.out.printf("%-25s %-15s %-10s %-15s\n", 
                          "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    // Menampilkan berdasarkan hari
    public static void tampilkanByHari(String[][] jadwal, int n, String hariCari) {
        System.out.println("\n=== Jadwal Hari " + hariCari + " ===");
        System.out.printf("%-25s %-15s %-10s %-15s\n", 
                          "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("---------------------------------------------------------------");

        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hariCari)) {
                System.out.printf("%-25s %-15s %-10s %-15s\n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal di hari " + hariCari);
        }
    }

    // Menampilkan berdasarkan mata kuliah
    public static void tampilkanByMK(String[][] jadwal, int n, String mkCari) {
        System.out.println("\n=== Jadwal Mata Kuliah: " + mkCari + " ===");
        System.out.printf("%-25s %-15s %-10s %-15s\n", 
                          "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("---------------------------------------------------------------");

        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mkCari)) {
                System.out.printf("%-25s %-15s %-10s %-15s\n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = Integer.parseInt(input.nextLine());

        String[][] jadwal = new String[n][4];

        // Input jadwal kuliah
        inputJadwal(jadwal, n, input);

        // Tampilkan semua jadwal
        tampilkanSemua(jadwal, n);

        // Tampilkan jadwal berdasarkan hari
        System.out.print("\nMasukkan hari untuk mencari jadwal: ");
        String hariCari = input.nextLine();
        tampilkanByHari(jadwal, n, hariCari);

        // Tampilkan jadwal berdasarkan mata kuliah
        System.out.print("\nMasukkan nama mata kuliah untuk mencari jadwal: ");
        String mkCari = input.nextLine();
        tampilkanByMK(jadwal, n, mkCari);

        input.close();
    }
}