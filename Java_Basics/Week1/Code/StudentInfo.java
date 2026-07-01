public class StudentInfo{
    //attributes
    private String name;
    private int rollNumber;
    private double gpa;
    private String branch;

    //Constructor - initialize student when creating object

    public StudentInfo(String name, int rollNumber, double gpa, String branch){
        this.name = name;
        this.rollNumber = rollNumber;
        this.gpa = gpa;
        this.branch = branch;
    }

    //Getter methods

    public String getName(){
        return name;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public double getGpa(){
        return gpa;
    }

    public String getBranch(){
        return branch;
    }

    //Setter methods
    public void setGpa(double newGpa){
        
    }

}