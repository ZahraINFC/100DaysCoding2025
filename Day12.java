import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan Tinggi badan  : " );
        double Tb = input.nextDouble();

        input.nextLine();

        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Hobi: ");
        String hobi = input.nextLine();


        System.out.println("\nBIODATA");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Tinggi Badan    : "+ Tb + "cm");
        System.out.println("Alamat : " + alamat);
        System.out.println("Hobi   : " + hobi);
    }
}
