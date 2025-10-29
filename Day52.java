public class Day52 {
    public static void main(String[] args) {
        int angka = 1; // nilai awal

        // perulangan while
        while (angka <= 5) {
            System.out.println("Angka ke-" + angka);
            angka++; // menaikkan nilai agar tidak infinite loop
        }
    }
}
