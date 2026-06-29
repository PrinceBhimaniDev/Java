public class GradeCalculator {
    public static void main(String[] args){
        int score = 86;
        String grade="";

        if(score >= 90) {grade= "A";}
        else if(score >= 80) {grade = "B";}
        else if(score >= 70) {grade = "C";}
        else if(score >= 60) {grade = "D";}
        else {grade="E";}

        System.out.println("Score " + score );
        System.out.println("Grade" + grade);

        //Option B
        // Using nested ternary operatior (fallback little hard to read.)
        String result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

        System.out.println("Ternery operator Grade " + result);
    }
}
