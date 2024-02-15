import java.util.Scanner;

public class Siakad18{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namaMK = {"Agama" ,"B.Indo","B.Inggris","CTPS",
                "DASPRO","KTI","MTK Dasar",
                "PAMB", "P.DASPRO"};

        double[] nilaiAngka = new double[9];
        String[] nilaiHuruf = new String[9];
        String[] kualifikasi = new String[9];
        double[] bobotSks = new double[9];
        
        System.out.println("=======================================================================");
        System.out.println("                    Program Menghitung IP Semester                     ");
        System.out.println("=======================================================================");

        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.print("Masukkan nilai angka untuk " + namaMK[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
        }

        System.out.println("=======================================================================");
        System.out.println("                            Hasil Konversi Nilai                       ");
        System.out.println("=======================================================================");
        System.out.println("| Mata Kuliah | Nilai Angka | Nilai Huruf | Bobot Nilai | Kualifikasi |");
        System.out.println("|-------------|-------------|-------------|-------------|-------------|");

        double totalBobotSks = 0;
        double totalNilai = 0;

        for (int i = 0; i < nilaiHuruf.length; i++) {
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotSks[i] = 4.0;
                kualifikasi[i] = "Sangat Baik";
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotSks[i] = 3.5;
                kualifikasi[i] = "Lebih dari Baik";
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotSks[i] = 3.0;
                kualifikasi[i] = "Baik";
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotSks[i] = 2.5;
                kualifikasi[i] = "Lebih dari Cukup";
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotSks[i] = 2.0;
                kualifikasi[i] = "Cukup";
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotSks[i] = 1.0;
                kualifikasi[i] = "Kurang";
            } else {
                nilaiHuruf[i] = "E";
                bobotSks[i] = 0.0;
                kualifikasi[i] = "Gagal";
            }
            totalNilai += bobotSks[i] * 3; 
            totalBobotSks += 3; 
        }

        double ipSemester = totalNilai / totalBobotSks;

        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("| %-10s | %-10.2f | %-10s | %-10.2f | %-10s |\n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotSks[i], kualifikasi[i]);
        }
        System.out.println("========================================================================");
        System.out.println("IP Semester: " + ipSemester);
    }
}
