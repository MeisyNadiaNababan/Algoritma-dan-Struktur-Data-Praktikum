//package Praktikum02;
public class Piramid {
    private float alasPesergi;
    private float tinggi;

    public Piramid(float alasPesergi, float tinggi){
        this.alasPesergi = alasPesergi;
        this.tinggi = tinggi;
    }
    
    public void hitungVolume(){
        float volume = (float) (1.0/3.0) * alasPesergi * this.tinggi;
        System.out.println("Volume Primid adalah: " + volume);
    }
}
