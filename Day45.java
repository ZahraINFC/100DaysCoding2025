import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println(" MENU MINUMAN ");
        System.out.println("1. Es Teh");
        System.out.println("2. Jus Jeruk");
        System.out.println("3. Air Mineral");
        System.out.print("Masukkan pilihan Anda (1-3): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Es Teh");
                break;
            case 2:
                System.out.println("Anda memilih Jus Jeruk");
                break;
            case 3:
                System.out.println("Anda memilih Air Mineral");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih 1 sampai 3.");
        }

        input.close();
    }
}
