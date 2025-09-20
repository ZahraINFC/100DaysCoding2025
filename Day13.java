import java.util.Scanner;

public class Day13Evaluasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama = "lestari";
        final String nim = "D012345";
        String programStudy = "Informatika";
        String Alamat = "Majene";
        double tinggiBadan = 149.7;
        float beratBadan = 40.6f;
        int usia = 21;
        long ukt = 5000000L;
        char golonganDarah = 'Z';
        boolean KeaktifanMahasiswa = false;
        short jarakrumahkekampus = 13;
        byte jumlahsksygdiambil = 20;

        System.out.println("nama                    : "+ nama);
        System.out.println("nim                     : "+ nim);
        System.out.println("program study           : "+ programStudy);
        System.out.println("alamat                  : "+ Alamat);
        System.out.println("tinggi badan            : "+ tinggiBadan + " Cm");
        System.out.println("berat badan             : "+ beratBadan + " Kg");
        System.out.println("usia                    : "+ usia);
        System.out.println("ukt                     : "+ ukt);
        System.out.println("golongan darah          : "+ golonganDarah);
        System.out.println("keaktifan mahasiswa     : "+ KeaktifanMahasiswa);
        System.out.println("jarak rumah ke kampus   : "+ jarakrumahkekampus + " Km");
        System.out.println("jumlah sks yang diambil : "+ jumlahsksygdiambil);

        System.out.print("nama           : ");
        nama = sc.nextLine();
        System.out.print("alamat         : ");
        Alamat = sc.nextLine();
        System.out.print("tinggi badan   : ");
        tinggiBadan = sc.nextDouble();
        System.out.print("golongan darah : ");
        golonganDarah = sc.next().charAt(0);
        System.out.print("jarak          :");
        jarakrumahkekampus = sc.nextShort();

//        System.out.println("Setelah di update :");
//        System.out.println("nama                    : "+ nama);
//        System.out.println("nim                     : "+ nim);
//        System.out.println("program study           : "+ programStudy);
//        System.out.println("alamat                  : "+ Alamat);
//        System.out.println("tinggi badan            : "+ tinggiBadan + " Cm");
//        System.out.println("berat badan             : "+ beratBadan + " Kg");
//        System.out.println("usia                    : "+ usia);
//        System.out.println("ukt                     : "+ ukt);
//        System.out.println("golongan darah          : "+ golonganDarah);
//        System.out.println("keaktifan mahasiswa     : "+ KeaktifanMahasiswa);
//        System.out.println("jarak rumah ke kampus   : "+ jarakrumahkekampus + " Km");
//        System.out.println("jumlah sks yang diambil : "+ jumlahsksygdiambil);

        System.out.println( "nama          : "+nama +
                            "\nnim           : "+nim+
                            "\nprogram study : "+ programStudy+
                            "\nalamat        : "+ Alamat+
                            "\nTinggi badan  : "+tinggiBadan+
                            "\nberat badan   : "+ beratBadan+
                            "\nusia          : " + usia+
                            "\nukt           : "+ ukt+
                            "\ngolongan darah:"+golonganDarah+
                            "\nkeaktifan     : " + KeaktifanMahasiswa+
                            "\njarak         : "+jarakrumahkekampus+
                            "\njumlah sks    : "+ jumlahsksygdiambil  );

    }
}
