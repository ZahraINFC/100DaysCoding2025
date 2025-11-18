import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = 0;
        int angka;

        System.out.println("Masukkan angka :");

        while (true) {
            angka = input.nextInt();
            if (angka < 0) {
                break;
            }
            jumlah += angka;
        }
        System.out.println("Total penjumlahan: " + jumlah);
    }
}
