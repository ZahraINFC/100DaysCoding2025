public class Day20 {
    public static void main(String[] args) {
        int angkaInt = 100;
        double angkaDouble = 9.75;
        boolean status = true;

        // konversi primitif ke string
        String strInt = String.valueOf(angkaInt);
        String strDouble = String.valueOf(angkaDouble);
        String strBoolean = String.valueOf(status);
        
        System.out.println("int ke string: " + strInt);
        System.out.println("double ke string: " + strDouble);
        System.out.println("boolean ke string: " + strBoolean);
    }
}
