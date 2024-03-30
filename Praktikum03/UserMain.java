import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah user: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        User[] dataUser = new User[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Username untuk User ke-" + (i + 1) + ": ");
            String username = sc.nextLine();

            System.out.print("Masukkan Password untuk User ke-" + (i + 1) + ": ");
            String password = sc.nextLine();

            dataUser[i] = new User(username, password);
        }

        for (int j = 0; j < jumlah; j++) {
            System.out.println("Data User ke-" + (j + 1) + " :");
            dataUser[j].loginUser();
        }
    }
}
