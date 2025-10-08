public class Day31 {
    public static void main(String[] args) {
        // operator logika AND (&&) akan menghasilkan true
        // hanya jika kedua kondisi bernilai true

        int angka1 = 8;
        int angka2 = 12;

        System.out.println(angka1 > 5 && angka2 > 10); // true && true = true
        System.out.println(angka1 > 5 && angka2 < 10); // true && false = false
        System.out.println(angka1 < 5 && angka2 > 10); // false && true = false
    }
}
