import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan jumlah bintang: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) System.out.print("*");
    }
}
