public class LargestOfThree {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 86;
        int num3 = 24;

        int largest = num1; //just an asumption

        if(num2>largest){
            largest = num2;
        }
        if(num3>largest){
            largest = num3;
        }

        System.out.println("Numbers: "+ num1+ " , " + num2 + " , " + num3);
        System.out.println("Largest: "+largest);
    }
}
