import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai N: ");
        int n = input.nextInt();

        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println("\nhasil perkalian dari 1 sampai " + n + " adalah: " + hasil);

        input.close();
    }
}
