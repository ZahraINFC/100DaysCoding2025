import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Ayam Bakar");
        System.out.println("====================");
        System.out.print("Pilih menu (1-3): ");

        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng.");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Mie Goreng.");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih Ayam Bakar.");
        } else {
            System.out.println("Pilihan tidak tersedia.");
        }
    }
}
