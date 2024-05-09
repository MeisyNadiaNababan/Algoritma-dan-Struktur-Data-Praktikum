import java.util.Arrays;
import java.util.Scanner;

public class ParkirMall {
    static Parkir[] dataParkir = new Parkir[100];
    static int jumlahData = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Input data");
            System.out.println("2. Cari data");
            System.out.println("3. Lihat data");
            System.out.println("4. Laporan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    inputData(scanner);
                    break;
                case 2:
                    cariData(scanner);
                    break;
                case 3:
                    lihatData();
                    break;
                case 4:
                    laporan();
                    break;
                case 5:
                    System.out.println("Program berakhir.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
    }

    static void inputData(Scanner scanner) {
        System.out.print("Tipe kendaraan (mobil/motor): ");
        scanner.nextLine();
        String tipeKendaraan = scanner.nextLine();
        System.out.print("Plat nomor: ");
        String platNomor = scanner.nextLine();
        System.out.print("Durasi parkir (jam): ");
        int durasi = scanner.nextInt();
        
        dataParkir[jumlahData] = new Parkir (tipeKendaraan, platNomor, durasi);
        System.out.println("Biaya :" + dataParkir[jumlahData].biaya);
        jumlahData++;

        System.out.println("Data kendaraan telah disimpan.");
    }

    static void cariData(Scanner scanner) {
        System.out.print("Masukkan plat nomor: ");
        String platNomor = scanner.next();
        boolean found = false;
        for (int i = 0; i < jumlahData; i++) {
            if (dataParkir[i].platNomor.contains(platNomor)) {
                System.out.println("Data ditemukan:");
                System.out.println("Tipe kendaraan: " + dataParkir[i].tipeKendaraan);
                System.out.println("Plat nomor: " + dataParkir[i].platNomor);
                System.out.println("Durasi parkir: " + dataParkir[i].durasi + " jam");
                System.out.println("Biaya parkir: Rp " + dataParkir[i].biaya);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    static void lihatData() {
        // Sorting data berdasarkan biaya secara descending
        for (int i = 0; i < jumlahData - 1; i++) {
            for (int j = 0; j < jumlahData - i - 1; j++) {
                if (dataParkir[j].biaya < dataParkir[j + 1].biaya) {
                    Parkir temp = dataParkir[j];
                    dataParkir[j] = dataParkir[j + 1];
                    dataParkir[j + 1] = temp;
                }
            }
        }
        System.out.println("Data kendaraan berdasarkan biaya (descending):");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Tipe kendaraan: " + dataParkir[i].tipeKendaraan);
            System.out.println("Plat nomor: " + dataParkir[i].platNomor);
            System.out.println("Durasi parkir: " + dataParkir[i].durasi + " jam");
            System.out.println("Biaya parkir: Rp " + dataParkir[i].biaya);
        }
    }

    static void laporan() {
        int totalMobil = 0;
        int totalMotor = 0;
        for (int i = 0; i < jumlahData; i++) {
            if (dataParkir[i].tipeKendaraan.equalsIgnoreCase("mobil")) {
                totalMobil += dataParkir[i].biaya;
            } else if (dataParkir[i].tipeKendaraan.equalsIgnoreCase("motor")) {
                totalMotor += dataParkir[i].biaya;
            }
        }
        System.out.println("Laporan Total Pendapatan:");
        System.out.println("Total pendapatan dari mobil: Rp " + totalMobil);
        System.out.println("Total pendapatan dari motor: Rp " + totalMotor);
    }

}