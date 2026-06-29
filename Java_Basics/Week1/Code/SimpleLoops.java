public class SimpleLoops {
    public static void main(String[] args) {
        System.out.println("===== Count from 1 to 10 =====");
        for(int i=1 ; i<= 10; i++){
            System.out.println(i+ " ");
        }
        System.out.println();

        System.out.println("=== Table of 5 ===");
        for(int i=1 ; i<= 10; i++){
            System.out.println(i*5 + " ");
        }
        System.out.println();

        System.out.println("===== countDown =====");
        for(int i=10; i>0; i--){
            System.out.println(i + " ");
        }
        System.out.println("Blast OFF!");
    }
}
