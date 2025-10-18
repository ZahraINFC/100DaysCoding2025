import java.util.Scanner;

public class Day41{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG GAJI BERSIH ===");
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        double tunjangan = input.nextDouble();

        System.out.print("Masukkan potongan: ");
        double potongan = input.nextDouble();

        double gajiKotor = gajiPokok + tunjangan;
        double gajiBersih;

        if (potongan < gajiKotor) {
            gajiBersih = gajiKotor - potongan;
            System.out.println("Gaji Bersih Anda adalah: Rp " + gajiBersih);
        } else {
            System.out.println("Potongan tidak valid karena melebihi gaji kotor.");
        }
    }
}
