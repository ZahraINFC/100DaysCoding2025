import java.util.Scanner;

public class EvaluasMentor {
    public static void main(String[] args) {
//        for (int i = 3; i < 100; i+=3) {
//            if (i % 2 == 0)
//            if (i <= 50)
//            System.out.println(i);
//        Scanner input = new Scanner(System.in);
//        int pilihan;
//        System.out.println("1. Donat");
//        System.out.println("2. Roti");
//        System.out.println("3. Pizza");
//        System.out.print("Masukkan Pilihan : ");
//        pilihan = input.nextInt();
//
//        switch (pilihan){
//            case 1 :
//                System.out.println("Donat");
//                break;
//            case 2 :
//                System.out.println("Roti");
//                break;
//            case 3 :
//                System.out.println("Pizza");
//                break;
//            default :
//                System.out.println("Pilihan tidak valid");
//                break;
//       }
//        Scanner input = new Scanner (System.in);
//        System.out.print("input : ");
//        int tinggi = input.nextInt();
//
//        String hasil = (tinggi >= 160) ? "Kamu tinggi" : "Kamu pendek";
//
//        System.out.println(hasil);

        int i = 1;
        do {
            if (i == 10) {
                i++;
                continue;
            }
            if (i == 5) {
                break;
            }
            System.out.println(i);
            i++;

        } while (true);


    }
}
