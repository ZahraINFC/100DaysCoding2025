import java.util.Scanner;

public class Day100 {

    static int[] arrayBaru;
    static int n;

    static int retas(int[] arr) {
        arrayBaru = new int[n];
        boolean[] terisi = new boolean[n];
        int totalPergeseran = 0;

        for (int i = 0; i < n; i++) {
            int idx = arr[i] % n;

            while (terisi[idx]) {
                idx = (idx + 1) % n;
                totalPergeseran++;
            }

            arrayBaru[idx] = arr[i];
            terisi[idx] = true;
        }

        return totalPergeseran;
    }

    static String susunKode(int p) {
        int panjang = arrayBaru[p % n];
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (sb.length() < panjang) {
            sb.append(arrayBaru[i]);
            i = (i + 1) % n;
        }

        return sb.substring(0, panjang);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        int p = retas(x);
        String kode = susunKode(p);

        System.out.println(kode);
    }
}
