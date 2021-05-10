import java.util.Scanner;
public class TrackingGrades {
    public static class Student{
        // Initialize base variables.
        private String name;
        private int test1score, test2score;
        // Create a Scanner variable for each Student Object.
        private Scanner scan = new Scanner(System.in);
        // If a student is created, use the provided studentname to set its name.
        public Student(String studentName){
            name = studentName;
        }
        // When this is called, ask for scores.
        public void inputGrades(){
            System.out.println("Please input the grade one score for " + name);
            test1score = scan.nextInt();
            System.out.println("Please input the test two score for "+ name);
            test2score = scan.nextInt();
        }
        // Get the average and reuturn it as a double.
        public double getAverage(){
            return (test1score+test2score)/2.0;
        }
        // Return the student's name as a String.
        public String getName(){
            return name;
        }
    }
    public static void main(String args[]){
        Student student1 = new Student("Mary");
        Student student2 = new Student ("Mike");
        student1.inputGrades();
        System.out.println("Here is the average for: "+student1.getName()+"\'s two test scores: " +student1.getAverage());
        System.out.println();
        student2.inputGrades();
        System.out.println("Here is the average for: "+student2.getName()+"\'s two test scores: " +student2.getAverage());
    }
}
