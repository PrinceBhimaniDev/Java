package Code;

public class DataTypesExplore{
    public static void main(String[] args){

        byte smallNum = 127;           // Range: -128 to 127
        short mediumNum = 32000;       // Range: -32,768 to 32,767
        int normalNum = 100000;        // Range: -2^31 to 2^31-1
        long largeNum = 10000000000L;  // Note the 'L' suffix!

        float singlePrecision = 3.14f;      // Note the 'f' suffix
        double doublePrecision = 3.14159;   // Default for decimals

        char grade = 'A';
        boolean isJavaFun = true;

        String language = "Java";

         System.out.println("=== Data Types in Java ===");
        System.out.println("byte: " + smallNum);
        System.out.println("short: " + mediumNum);
        System.out.println("int: " + normalNum);
        System.out.println("long: " + largeNum);
        System.out.println("float: " + singlePrecision);
        System.out.println("double: " + doublePrecision);
        System.out.println("char: " + grade);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("String: " + language);
        
        // Print memory sizes
        System.out.println("\n=== Memory Sizes ===");
        System.out.println("byte size: " + Byte.BYTES + " bytes");
        System.out.println("int size: " + Integer.BYTES + " bytes");
        System.out.println("long size: " + Long.BYTES + " bytes");
    }
}