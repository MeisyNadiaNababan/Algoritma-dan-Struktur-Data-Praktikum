import java.util.Scanner;

public class AkarBilangan {

    public int akarBruteForce(int bilangan) {
        int hasil = 0;
        while (hasil * hasil <= bilangan) {
            hasil++;
        }
        return hasil - 1;
    }

    public int akarDivideConquer(int bilangan) {
        return akarDCRekursif(bilangan, 0, bilangan);
    }

    private int akarDCRekursif(int bilangan, int kiri, int kanan) {
        if (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2;
            int tengahKuadrat = tengah * tengah;

            if (tengahKuadrat == bilangan) {
                return tengah; 
            } else if (tengahKuadrat < bilangan) {
                return akarDCRekursif(bilangan, tengah + 1, kanan);
            } else {
                return akarDCRekursif(bilangan, kiri, tengah - 1);
            }
        }
        return kanan;
    }
}