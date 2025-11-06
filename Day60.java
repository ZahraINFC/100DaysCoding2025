import java.util.Scanner;
public class Day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai N: ");
        int n = input.nextInt();

        System.out.println("\nangka ganjil dari " + n + " sampai 1:");
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nangka genap dari " + n + " sampai 1:");
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}
