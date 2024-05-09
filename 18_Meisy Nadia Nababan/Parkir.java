import java.util.Arrays;
import java.util.Scanner;

public class Parkir {
    String tipeKendaraan;
    String platNomor;
    int durasi;
    int biaya;

    public Parkir(String tipeKendaraan, String platNomor, int durasi) {
        this.tipeKendaraan = tipeKendaraan;
        this.platNomor = platNomor;
        this.durasi = durasi;
        hitungBiaya();
    }

    public int hitungBiaya() {
        if (tipeKendaraan.equalsIgnoreCase("mobil")) {
            biaya = durasi * 3000;
        } else if (tipeKendaraan.equalsIgnoreCase("motor")) {
            biaya = durasi * 1000;
        } 
        return biaya;
    }
}

