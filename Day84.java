public class Day84 {
    public static void main(String[] args) {
        int[] angka = {4, 9, 2, 15, 7};
        int max = angka[0]; // nilai awal
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }
        System.out.println("Angka terbesar: " + max);
    }
}
