public class Day14 {
    public static void main(String[] args) {

        String strByte = "120";
        String strShort = "32000";
        String strInt = "100000";
        String strLong = "123456789";
        String strFloat = "12.5";
        String strDouble = "123.456";
        String strChar = "A";
        String strBoolean = "true";
        
        //mengubah
        byte nilaiByte = Byte.parseByte(strByte);
        short nilaiShort = Short.parseShort(strShort);
        int nilaiInt = Integer.parseInt(strInt);
        long nilaiLong = Long.parseLong(strLong);
        float nilaiFloat = Float.parseFloat(strFloat);
        double nilaiDouble = Double.parseDouble(strDouble);
        char nilaiChar = strChar.charAt(0);
        boolean nilaiBoolean = Boolean.parseBoolean(strBoolean);

        System.out.println("byte: " + nilaiByte);
        System.out.println("short: " + nilaiShort);
        System.out.println("int: " + nilaiInt);
        System.out.println("long: " + nilaiLong);
        System.out.println("float: " + nilaiFloat);
        System.out.println("double: " + nilaiDouble);
        System.out.println("char: " + nilaiChar);
        System.out.println("boolean: " + nilaiBoolean);
    }
}
