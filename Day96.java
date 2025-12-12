public class Day96 {
    public static int kali(int a, int b){
        return a * b;
    }
    public static int bagi(int a, int b){
        return a / b;
    }
    public static int tambah(int a, int b){
        return a + b;
    }
    public static int kurang(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("Perkalian : " + kali(3, 1));
        System.out.println("Pembagian : " + bagi(3, 1));
        System.out.println("Penjumlahan : " + tambah(3, 1));
        System.out.println("Pengurangan : " + kurang(3, 1));
    }
}
