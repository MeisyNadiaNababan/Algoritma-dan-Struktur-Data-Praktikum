//package Praktikum02;
public class DragonMain {
    
    public static void main(String[] args){
        Dragon dragon1 = new Dragon(7,7,1);
        Dragon dragon2 = new Dragon(9, 9, 2);

        dragon1.printStatus();
        dragon2.printStatus();

        dragon1.move(3);
        dragon2.move(2);

        dragon1.printStatus();
        dragon2.printStatus();
    }
}
