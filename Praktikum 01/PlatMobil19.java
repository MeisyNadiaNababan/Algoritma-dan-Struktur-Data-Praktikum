import java.util.Scanner;

public class PlatMobil19{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] kota = {{'B','A','N','T','E','N'},
                        {'J','A','K','A','R','T','A'}, 
                        {'B','A','N','D','U','N','G'},
                        {'C','I','R','E','B','O','N'},
                        {'B','O','G','O','R'},
                        {'P','E','K','A','L','O','N','G','A','N'},
                        {'S','E','M','A','R','A','N','G'},
                        {'S','U','R','A','B','A', 'Y', 'A'},
                        {'M','A','l','A','N','G'},
                        {'T','E','G','A','L'}};

        char inputKode;
        do {
            System.out.print("Masukkan kode plat mobil: ");
            inputKode = scanner.next().charAt(0);

            int indexKode = -1;
            for (int i = 0; i < kode.length; i++) {
                if (kode[i] == inputKode) {
                    indexKode = i;
                    break;
                }
            }

            if (indexKode == -1) {
                System.out.println("Kode plat mobil tidak ditemukan!");
            } else {
                System.out.print("Nama kota: ");
                for (int j = 0; j < kota[indexKode].length; j++) {
                    System.out.print(kota[indexKode][j]);
                }
                System.out.println();
            }

            System.out.print("Ingin memasukkan kode plat mobil lainnya? (y/n): ");
        } while (scanner.next().charAt(0) == 'y');
    }
}
