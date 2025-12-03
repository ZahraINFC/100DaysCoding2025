public class Day87 {
    public static void main(String[] args) {
        int[] angka = {3, 7, 10, 15, 20};

        int cari = 10; // angka yang ingin dicari
        int posisi = -1; // -1 artinya belum ditemukan

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                posisi = i;
            }
        }
        if (posisi != -1) {
            System.out.println(cari + " ditemukan di indeks ke-" + posisi);
        } else {
            System.out.println(cari + " tidak ada dalam array");
        }
    }
}
