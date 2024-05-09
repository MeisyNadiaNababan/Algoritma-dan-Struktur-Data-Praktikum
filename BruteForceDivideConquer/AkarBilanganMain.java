import java.util.Scanner;
public class AkarBilanganMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AkarBilangan akarBilangan = new AkarBilangan();

        System.out.println("=================================================");
        System.out.print("Masukkan bilangan untuk dihitung akarnya: ");
        int bilangan = sc.nextInt();

        System.out.println("=================================================");
        int akarBF = akarBilangan.akarBruteForce(bilangan);
        System.out.println("Akar dari " + bilangan + " (Brute Force) adalah: " + akarBF);

        System.out.println("=================================================");
        int akarDC = akarBilangan.akarDivideConquer(bilangan);
        System.out.println("Akar dari " + bilangan + " (Divide Conquer) adalah: " + akarDC);

        sc.close(); 
    }
}