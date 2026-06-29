

public class SimpleCalculator {
    public static void main(String[] args) {
        double num1 = 25.5;
        double num2 = 10.3;

        //performed operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2;

        //disply results
        System.out.println("=== Simple Calculator ===");
        System.out.println("Number 1: "+ num1);
        System.out.println("Number 2: "+ num2);
        System.out.println("Addition" + num1 + "+" + num2 + "=" + addition);
        System.out.println("Subtraction" + num1 + "+" + num2 + "=" + subtraction);
        System.out.println("Multiplication" + num1 + "+" + num2 + "=" + multiplication);
        System.out.println("Division" + num1 + "+" + num2 + "=" + division);
        System.out.println("Remainder" + num1 + "+" + num2 + "=" + remainder);
    }
}
