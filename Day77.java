import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String teks = input.nextLine();

        // substring()
        System.out.print("Masukkan index mulai substring: ");
        int start = input.nextInt();
        System.out.print("Masukkan index akhir substring: ");
        int end = input.nextInt();
        input.nextLine();

        String potongan = teks.substring(start, end);
        System.out.println("Hasil substring: " + potongan);

        // replace()
        System.out.print("Kata yang ingin diganti: ");
        String target = input.nextLine();
        System.out.print("Diganti menjadi: ");
        String pengganti = input.nextLine();

        String hasilReplace = teks.replace(target, pengganti);
        System.out.println("Hasil replace: " + hasilReplace);

        // trim()
        String hasilTrim = teks.trim();
        System.out.println("Hasil trim: " + hasilTrim);
    }
}
