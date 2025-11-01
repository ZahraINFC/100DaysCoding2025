import java.util.Scanner;

public class evaluasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("batas bwh : ");
        int bwh = sc.nextInt();
        System.out.println("batas ats : ");
        int ats = sc.nextInt();
        System.out.println("angka : ");
        int angka = sc.nextInt();


        if(angka > bwh && angka < ats){
            System.out.println("YAYAYAYA");
        } else {
            System.out.println("NONONONO");
        }

    }
}
