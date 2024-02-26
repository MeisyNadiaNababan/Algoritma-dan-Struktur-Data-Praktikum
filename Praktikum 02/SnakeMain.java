//package Praktikum02
public class SnakeMain {
    public static void main(String[] args) {
    Snake snake1 = new Snake(2, 4);
    Snake snake2 = new Snake(8, 6);
    
    System.out.println("Posisi awal");
    snake1.printPosition();
    snake2.printPosition();

    snake1.moveRight();
    snake1.moveDown();

    snake2.moveLeft();
    snake2.moveUp();

    System.out.println("Posisi setelah diubah");
    snake1.printPosition();
    snake2.printPosition(); 
    }
}