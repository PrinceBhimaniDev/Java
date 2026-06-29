public class EvenOddChecker{

    public static void main(String[] args){
        int number = 42;

        if(number % 2 == 0){
            System.out.println("number: "+number+"is EVEN.");
        }
        else{
            System.out.println("number:"+number+"is ODD.");
        }

        //checking multiple numbers
        System.out.println("===== Checking Multiple Numbers =====");
        int[] numbers = {7, 14,21,36,45,100};

        for(int num: numbers){
            String result = (num%2 == 0 ) ? "EVEN" : "ODD";
            System.out.println(num + " is " +result);
        }

    }
}