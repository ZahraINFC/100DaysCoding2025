public class Day32 {
    public static void main(String[] args) {
        // operator logika OR akan menghasilkan true
        // jika salah satu kondisi bernilai true

        int angka1 = 8;
        int angka2 = 12;

        System.out.println(angka1 > 5 || angka2 > 10); // true || true = true
        System.out.println(angka1 < 5 || angka2 > 10); // false || true = true
        System.out.println(angka1 < 5 || angka2 < 10); // false || false = false
    }
}
