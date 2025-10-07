public class Day31 {
    public static void main(String[] args) {

        int umur = 19;
        boolean punyaKTP = true;

        // kondisi akan true kalau dua-duanya bernilai true
        if (umur >= 17 && punyaKTP == true) {
            System.out.println("kamu sudah boleh membuat SIM!");
        } else {
            System.out.println("kamu belum bisa membuat SIM.");
        }
    }
}
