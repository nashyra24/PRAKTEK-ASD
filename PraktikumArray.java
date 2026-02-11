import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mk = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking and Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 3, 3, 3, 2, 3, 1, 2};
        double[] nilaiAngka = new double[mk.length];
        String[] nilaiHuruf = new String[mk.length];
        double[] bobot = new double[mk.length];

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < mk.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = input.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobot[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobot[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobot[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobot[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobot[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobot[i] = 0.0;
            }
        }

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < mk.length; i++) {
            totalBobot += bobot[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalBobot / totalSKS;
        
        System.out.println("==============================");   
        System.out.println("hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-35s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-35s %-12.2f %-12s %-12.2f\n",
                    mk[i], nilaiAngka[i], nilaiHuruf[i], bobot[i]);
        }

        System.out.println("\nIP : " + String.format("%.2f", ip));
        input.close();
    }
}
