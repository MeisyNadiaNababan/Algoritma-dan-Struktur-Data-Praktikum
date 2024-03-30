package Praktikum05;

public class travelReservasiHotelMain {
    public static void main(String[] args) {
        
        travelReservasiHotel[] hotel = new travelReservasiHotel[5];
        travelReservasiHotel hotel1 = new travelReservasiHotel("EveryDay Hotel", 238.850, 4.6);
        travelReservasiHotel hotel2 = new travelReservasiHotel("Blitz Hotel", 172.400, 4.1);
        travelReservasiHotel hotel3 = new travelReservasiHotel("Iconnect Hotel", 324.250, 4.7);
        travelReservasiHotel hotel4 = new travelReservasiHotel("Elora Hotel", 461.407, 4.9);
        travelReservasiHotel hotel5 = new travelReservasiHotel("Suren Hotel", 538.000, 5.0);

        hotel[0] = hotel1;
        hotel[1] = hotel2;
        hotel[2] = hotel3;
        hotel[3] = hotel4;
        hotel[4] = hotel5;

        travelReservasiHotel.bubbleSortByHarga(hotel);
        System.out.println("========== Sorting Berdasarkan Harga: ==========");
        for (travelReservasiHotel h : hotel){
            h.displayInfo();
        }

        System.out.println("\n");

        travelReservasiHotel.SelectionDesByRating(hotel);
        System.out.println("========== Sorting Berdasarkan Rating: ==========");
        for (travelReservasiHotel h : hotel){
            h.displayInfo();
        }
    }
}
