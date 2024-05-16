package Tugas;

public class Point {
    String soal;
    String jawab;
    Point nexPoint;

    public Point(String soal, String jawab) {
        this.soal = soal;
        this.jawab = jawab;
        this.nexPoint = null;
    }
}
