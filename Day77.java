public class Day77 {
    public static void main(String[] args) {
        String teks = "  Belajar Java itu mudah  ";

        // substring()
        String sub = teks.substring(2, 10);

        // replace()
        String ganti = teks.replace("Java", "Coding");

        // trim()
        String rapih = teks.trim();

        System.out.println("Teks asli: \"" + teks + "\"");
        System.out.println("Hasil substring: " + sub);
        System.out.println("Hasil replace: " + ganti);
        System.out.println("Hasil trim: " + rapih);
    }
}
