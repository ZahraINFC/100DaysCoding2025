import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input dua teks
        System.out.print("teks pertama: ");
        String teks1 = input.nextLine();

        System.out.print("teks kedua: ");
        String teks2 = input.nextLine();

        // equals()
        System.out.println("equals() : " + teks1.equals(teks2));

        // equalsIgnoreCase()
        System.out.println("equalsIgnoreCase() : " + teks1.equalsIgnoreCase(teks2));

        // contains()
        System.out.println("contains() : " + teks1.contains(teks2));

        // isEmpty()
        System.out.println("Teks pertama kosong? : " + teks1.isEmpty());
        System.out.println("Teks kedua kosong?   : " + teks2.isEmpty());
    }
}
