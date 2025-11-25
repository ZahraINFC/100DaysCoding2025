import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat akun
        String username = "Zahra";
        String password = "Zahra123";

        String userInput, passInput;

        System.out.println("=== LOGIN SISTEM ===");

        // Loop sampai benar
        do {
            System.out.print("Masukkan username : ");
            userInput = input.nextLine();

            System.out.print("Masukkan password : ");
            passInput = input.nextLine();

            if (!userInput.equals(username) || !passInput.equals(password)) {
                System.out.println("Username atau password salah! Coba lagi.\n");
            }

        } while (!userInput.equals(username) || !passInput.equals(password));

        System.out.println("\nLogin berhasil! Selamat datang, " + username + "!");
    }
}
