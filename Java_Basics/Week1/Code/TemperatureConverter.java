

public class TemperatureConverter {
    public static void main(String[] args){
        //conver Celsius to Fahrenheit
        double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("==== Temperature Conversion ====");
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        //convert Fahrenheit to Celsius

        double fahrenheit2 = 77.0;
        double celsius2 = (fahrenheit2 - 32) * 5/9;

        System.out.println(fahrenheit2 + "°F = " + celsius2 + "°C");

        // using Multiple values:
        System.out.println("\n === Multiple Conversions ===");

        int[] celsiusValues = {0, 10, 20, 30, 40};

        for(int c : celsiusValues){
            double f = (c * 9/5) + 32;
            System.out.println(c + "°C = " + f + "°F"); 
        }
    }
}
