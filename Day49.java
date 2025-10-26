import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai kamu: ");
        int nilai = input.nextInt();

        // penggunaan operator ternary
        String hasil = (nilai >= 75) ? "Kamu lulus" : "Kamu belum lulus";

        System.out.println(hasil);
    }
}
