public class Day78 {
    public static void main(String[] args) {

        String kalimat = "   Belajar String di Java itu Menyenangkan   ";

        // length()
        System.out.println("Jumlah karakter: " + kalimat.length());

        // trim()
        String hasil = kalimat.trim();
        System.out.println("Setelah trim: " + hasil);

        // toUpperCase
        System.out.println("Huruf besar: " + hasil.toUpperCase());

        // toLowerCase
        System.out.println("Huruf kecil: " + hasil.toLowerCase());

        // substring
        System.out.println("Substring (8–14): " + hasil.substring(8, 14));

        // replace
        System.out.println("Replace Java → Python: " + hasil.replace("Java", "Python"));

        // contains
        System.out.println("Mengandung kata 'String'? " + hasil.contains("String"));

        // startsWith
        System.out.println("Diawali dengan 'Belajar'? " + hasil.startsWith("Belajar"));

        // endsWith
        System.out.println("Diakhiri dengan 'Menyenangkan'? " + hasil.endsWith("Menyenangkan"));

        // equals
        System.out.println("Sama dengan kalimat asli tanpa spasi? " +
                hasil.equals("Belajar String di Java itu Menyenangkan"));

        // isEmpty
        System.out.println("Apakah string kosong? " + hasil.isEmpty());

        // charAt
        System.out.println("Karakter ke-3: " + hasil.charAt(2));
    }
}
