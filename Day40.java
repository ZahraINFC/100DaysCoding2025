import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" KALKULATOR SEDERHANA ");
        System.out.print("Angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("Pilih operasi: ");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Hasil: " + (angka1 + angka2));
        } else if (pilihan == 2) {
            System.out.println("Hasil: " + (angka1 - angka2));
        } else if (pilihan == 3) {
            System.out.println("Hasil: " + (angka1 * angka2));
        } else if (pilihan == 4) {
            if (angka2 != 0) {
                System.out.println("Hasil: " + (angka1 / angka2));
            } else {
                System.out.println("Error: Tidak bisa dibagi dengan nol!");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
