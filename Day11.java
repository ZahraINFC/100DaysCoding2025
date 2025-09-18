import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Umur: ");
        byte umur = input.nextByte();

        System.out.print("Tahun: ");
        short tahun = input.nextShort();

        System.out.print("Jumlah Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        System.out.print("Jarak : ");
        long jarak = input.nextLong();

        System.out.print("Tinggi : ");
        float tinggi = input.nextFloat();

        System.out.print("Berat: ");
        double berat = input.nextDouble();

        System.out.print("Grade : ");
        char grade = input.next().charAt(0);

        System.out.print("Lulus : ");
        boolean lulus = input.nextBoolean();

        input.close();
    }
}
