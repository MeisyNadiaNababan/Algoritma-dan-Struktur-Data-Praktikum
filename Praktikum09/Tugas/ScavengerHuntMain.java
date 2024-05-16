package Tugas;

public class ScavengerHuntMain {
    
    public static void main(String[] args) {
        ScavengerHunt game = new ScavengerHunt();
        game.addPoint(" Apa warna buah apel ?", "Merah");
        game.addPoint(" Apa nama planet ketujuh dari Matahari dalam tata surya ?", "Uranus");
        game.addPoint(" Berapa jumlah hari dalam satu minggu ?", "Tujuh hari");
        game.addPoint(" Siapakah presiden pertama Amerika Serikat ?", "George Washington");
        game.addPoint(" Apa nama benua yang dihuni oleh pinguin ?", "Antartika");

        game.playGame();
    }
}
