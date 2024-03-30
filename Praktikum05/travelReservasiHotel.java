package Praktikum05;

public class travelReservasiHotel {
    String nama;
    double harga;
    double rating;
    int index;

    public travelReservasiHotel(String nama, double harga, double rating){
        this.nama = nama;
        this.harga = harga;
        this.rating = rating;
    }
    
    public void displayInfo(){
        System.out.println("Nama Hotel: " + nama);
        System.out.println("Harga " + harga);
        System.out.println("Rating: " + rating);
        System.out.println();
    }

    public static void bubbleSortByHarga(travelReservasiHotel[] hotel) {
        int n = hotel.length;

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (hotel[j].harga > hotel[j+1].harga){
                    travelReservasiHotel temp = hotel[j];
                    hotel[j] = hotel[j+1];
                    hotel[j+1] = temp;

                }
            }

        }    
    }

    public static void SelectionDesByRating (travelReservasiHotel[] hotel) {
        int n = hotel.length;

        for(int i = 0; i < n - 1; i++){
            int minIndex = i;

            for(int j = i + 1; j < n; j++){
                if (hotel[j].rating > hotel[minIndex].rating) {
                    minIndex = j;                    
                }
            }
            travelReservasiHotel temp = hotel[minIndex];
            hotel[minIndex] = hotel[i];
            hotel[i] = temp;
        }      
    }
}
