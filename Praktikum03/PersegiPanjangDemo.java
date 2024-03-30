//package Praktikum03
import java.util.Scanner;
public class PersegiPanjangDemo {
    public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in);
    int jumlah; 

    System.out.print("Masukkan jumlah persegi panjang : ");
    jumlah= sc.nextInt(); 

    PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[jumlah];

    for(int i = 0; i < jumlah; i++){ 
        arrayOfPersegiPanjang[i] = new PersegiPanjang();

        System.out.println("Persegi panjang ke-" +(i+1));
        System.out.print("Masukkan panjang: ");
        arrayOfPersegiPanjang[i].panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        arrayOfPersegiPanjang[i].lebar = sc.nextInt();
    }

        for (int j = 0; j < jumlah; j++){
        System.out.println("Persegi Panjang ke- " + (j+1) + ": ");
        arrayOfPersegiPanjang[j].CetakInfo(); 
        }
    }
}