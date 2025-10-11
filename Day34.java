import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt();

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1){
                A += i;
            }
            if (i % 2 == 0){
                B += i;
            }
            if (i % 3 == 0 && i % 5 == 0){
                C += i;
            }
            if (i % 3 == 0 || i % 5 == 0){
                D += i;
            }
        }
        System.out.println(); // misal nilai 5
        System.out.println("A. Total angka ganjil = " + A); // hasil 9
        System.out.println("B. Total angka genap = " + B); // hasil 6
        System.out.println("C. Total angka yang habis dibagi 3 dan 5 = " + C); // 0
        System.out.println("D. total angka yang habis dibagi 3 atau 5 = " + D); // 8

        int nilai1 = D * B;
        int nilai2 = C / A;
        int nilai3 = D + B;
        int nilai4 = C - A;
        int nilai5 = B % D;

        System.out.println();
        System.out.println("Operator");
        System.out.println("1. hitung D kali B = " + nilai1); // hasil 48
        System.out.println("2. hitung C bagi A = " + nilai2); // hasil 0
        System.out.println("3. hitung D tambah B = " + nilai3); // hasil 14
        System.out.println("4. hitung C kurang A = " + nilai4); // hasil -9
        System.out.println("5. hitung B modulus D = " + nilai5); // hasil 6

        System.out.println();
        System.out.println("perbandingan");
        if (nilai3 < 5){
            System.out.println("ara");
        }else if (nilai3 > 5) {
            System.out.println("ara ara");
        }else {
            System.out.println("ara ara ara");
        }
    }
}
