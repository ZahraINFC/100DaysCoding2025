public class Day97 {

    static int luasPersegi(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        int s = 6;
        int hasil = luasPersegi(s);

        System.out.println("Nilai sisi: " + s);
        System.out.println("Luas persegi: " + hasil);
    }
}
