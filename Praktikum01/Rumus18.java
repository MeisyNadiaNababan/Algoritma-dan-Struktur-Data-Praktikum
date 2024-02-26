import java.util.Scanner;

public class Rumus18{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("1. Menghitung Kecepatan");
            System.out.println("2. Menghitung Jarak");
            System.out.println("3. Menghitung Waktu");
            System.out.println("4. Exit");
            System.out.print("Pilih menu:");

            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jarak (meter): ");
                    double jarak = scanner.nextDouble();

                    System.out.print("Masukkan waktu (detik): ");
                    double waktu = scanner.nextDouble();

                    double kecepatan = jarak / waktu;

                    System.out.println("Kecepatan: " + kecepatan + " m/s");
                    break;
                case 2:
                    System.out.print("Masukkan kecepatan (m/s): ");
                    double kecepatan2 = scanner.nextDouble();

                    System.out.print("Masukkan waktu (detik): ");
                    double waktu2 = scanner.nextDouble();

                    double jarak2 = kecepatan2 * waktu2;

                    System.out.println("Jarak: " + jarak2 + " meter");
                    break;
                case 3:
                    System.out.print("Masukkan kecepatan (m/s): ");
                    double kecepatan3 = scanner.nextDouble();

                    System.out.print("Masukkan jarak (meter): ");
                    double jarak3 = scanner.nextDouble();

                    double waktu3 = jarak3 / kecepatan3;

                    System.out.println("Waktu: " + waktu3 + " detik");
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
    }
}