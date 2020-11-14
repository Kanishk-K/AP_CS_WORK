package Unit_4.ProgrammingProjectsPart2;
import java.util.Scanner;
import java.util.Arrays;

public class StudentInforProject {
    public static class Student{
        // Initialize base variables.
        private String name;
        private int[] testScores = new int[3];
        // Create a Scanner variable for each Student Object.
        // If a student is created, use the provided studentname to set its name.
        public Student(String studentName){
            name = studentName;
        }
        // When this is called, ask for scores.
        public void inputGrades(int test_number,int score){
            System.out.println("Please input the grade one score for " + name);
            testScores[test_number-1] = score;
        }
        // Get the average and reuturn it as a double.
        public double average(){
            return Arrays.stream(testScores).sum()/testScores.length;
        }
        // Return the student's name as a String.
        public String getName(){
            return name;
        }
    }
    public static void main(String args[]){
        Student person = new Student("Jerry");
        person.inputGrades(1,90);
        person.inputGrades(2,95);
        person.inputGrades(3,100);
        System.out.println("Average: "+person.average());
    }
}
