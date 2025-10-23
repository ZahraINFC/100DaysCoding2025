import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("S = ");
        int S = input.nextInt();
        System.out.print("L = ");
        int L = input.nextInt();

        int waktutidur = (S + L) % 24;
        int jam = 9 - waktutidur;

        System.out.println("Jumlah Jam Tidur yang diperoleh : "+ jam + " jam" );
    }
}
