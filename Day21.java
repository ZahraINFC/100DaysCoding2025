public class Day21 {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;

        System.out.println("Sebelum ditukar");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nSetelah ditukar");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
}
