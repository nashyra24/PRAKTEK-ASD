import java.util.Scanner;
public class Praktikumperulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        // Ambil 2 digit terakhir
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n = n + 10;
        }

        System.out.println("n = " + n);
        System.out.print("Output: ");

        for (int i = 1; i <= n; i++) {

            // Tidak mencetak 10 dan 15
            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        input.close();
    }
}
