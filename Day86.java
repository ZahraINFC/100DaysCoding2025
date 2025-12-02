public class Day86 {
    public static void main(String[] args) {
        int[] angka = {10, 5, 12, 9, 22};
        int min = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println("Angka minimal : " + min);
    }
}
