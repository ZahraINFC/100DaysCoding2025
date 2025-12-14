import java.util.Scanner;

public class Day98 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = s.nextInt();

        int a = 0, b = 1;

        System.out.print("Deretan Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
