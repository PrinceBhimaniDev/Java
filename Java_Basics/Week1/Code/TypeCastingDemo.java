package Code;

public class TypeCastingDemo {
    public static void main(String[] args) {
        System.out.println("=== Widening (Automatic) Casting ===");
        
        // Widening - automatic, safe (smaller to larger)
        byte b = 10;
        short s = b;      // byte → short
        int i = s;        // short → int
        long l = i;       // int → long
        float f = l;      // long → float
        double d = f;     // float → double
        
        System.out.println("byte → short: " + s);
        System.out.println("short → int: " + i);
        System.out.println("int → long: " + l);
        System.out.println("long → float: " + f);
        System.out.println("float → double: " + d);
        
        System.out.println("\n=== Narrowing (Manual) Casting ===");
        
        // Narrowing - manual, may lose data (larger to smaller)
        double price = 19.99;
        float discountedPrice = (float) price;      // double → float removes the values after point it dosen't roundup the number
        long bigNumber = 1234567899090L;
        int smallerNumber = (int) bigNumber;        // long → int. When you perform a narrowing cast using (int), Java takes a "brute-force" approach : it completely chops off the upper 32 bits of the long and keeps only the lower 32 bits.
        int quantity = 129;
        byte tinyNum = (byte) quantity;             // int → byte (might lose data!)
        
        System.out.println("double → float: " + discountedPrice);
        System.out.println("long → int: " + smallerNumber);
        System.out.println("int → byte: " + tinyNum);
        
        System.out.println("\n=== String Conversions ===");
        
        // String to primitive
        String numStr = "42";
        int convertedInt = Integer.parseInt(numStr);
        System.out.println("String \"42\" to int: " + convertedInt);
        
        String floatStr = "3.14";
        double convertedDouble = Double.parseDouble(floatStr);
        System.out.println("String \"3.14\" to double: " + convertedDouble);
        
        // Primitive to String
        int number = 100;
        String stringNum = Integer.toString(number);
        System.out.println("int 100 to String: " + stringNum);
        System.out.println("Type of stringNum: " + stringNum.getClass().getSimpleName());
}}
