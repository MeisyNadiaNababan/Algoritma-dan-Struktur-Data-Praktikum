package Tugas;

public class ScavengerHunt {
    private Point startPoint;
    private Point currentPoint;

    public ScavengerHunt() {
        this.startPoint = null;
        this.currentPoint = null;
    }

    public void addPoint(String soal, String jawab) {
        Point newPoint = new Point(soal, jawab);
        if (startPoint == null) {
            startPoint  = newPoint;
            currentPoint = newPoint;
        } else {
            currentPoint.nexPoint = newPoint;
            currentPoint = newPoint;
        }
    }

    public void playGame() {
        Point currentPoint = startPoint;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (currentPoint != null) {
            System.out.println("Soal: " + currentPoint.soal);
            System.out.print("Jawab: ");
            String userjawab = scanner.nextLine();
            if (userjawab.equalsIgnoreCase(currentPoint.jawab)) {
                System.out.println("Benar!");
                currentPoint = currentPoint.nexPoint;
            } else {
                System.out.println("Jawaban salah! Silahkan Coba lagi.");
            }
        }
        scanner.close();
        System.out.println("Selamat anda berhasil ");
    }
}
