Himport java.util.Scanner;

public class PlatMobil {

    public static void main(String[] args) {

        // Array kode plat
        char[] KODE = {'A','B','D','E','F','G','H','L','N','T'};

        // Array kota (2 dimensi char)
        char[][] KOTA = {
                {'B','A','N','T','E','N'},
                {'J','A','K','A','R','T','A'},
                {'B','A','N','D','U','N','G'},
                {'C','I','R','E','B','O','N'},
                {'B','O','G','O','R'},
                {'P','E','K','A','L','O','N','G','A','N'},
                {'S','E','M','A','R','A','N','G'},
                {'S','U','R','A','B','A','Y','A'},
                {'M','A','L','A','N','G'},
                {'T','E','G','A','L'}
        };

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kode plat: ");
        char cari = input.next().toUpperCase().charAt(0);

        boolean ketemu = false;

        for (int i = 0; i < KODE.length; i++) {
            if (cari == KODE[i]) {
                System.out.print("Nama kota: ");
                for (int j = 0; j < KOTA[i].length; j++) {
                    System.out.print(KOTA[i][j]);
                }
                System.out.println();
                ketemu = true;
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}