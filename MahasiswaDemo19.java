import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        StackTugasMahasiswa19 stack = new StackTugasMahasiswa19(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Jumlah Tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    Mahasiswa19 mhs = new Mahasiswa19(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

               case 2:
    if (stack.isEmpty()) {
        System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
        break;
    }
    Mahasiswa19 dinilai = stack.pop();
    System.out.println("Menilai tugas dari " + dinilai.nama);
    System.out.print("Masukkan nilai (0-100): ");
    int nilai = scan.nextInt();
    if (nilai >= 0 && nilai <= 100) {
        dinilai.tugasDinilai(nilai);
        StackKonversi konversi = new StackKonversi();
        String biner = konversi.konversiDesimalKeBiner(nilai);

        System.out.println("Nilai Tugas " + dinilai.nama + " adalah " + nilai);
        System.out.println("Nilai Biner Tugas: " + biner);
    } else {
        System.out.println("Nilai tidak valid!");
    }
    break;

                case 3:
                    Mahasiswa19 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
                
                case 5:
                    Mahasiswa19 lihatBawah = stack.peekBottom();
                    if (lihatBawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihatBawah.nama);
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang dikumpulkan: " + stack.count());
                    break;
            }

        } while (pilih >= 1 && pilih <= 6);
        scan.close();
    }
}