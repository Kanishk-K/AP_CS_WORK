package Unit_2.Projects;
import java.util.Scanner;

public class Average {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide the first integer.");
        int first_int = scan.nextInt();
        System.out.println("Please provide the second integer.");
        int second_int = scan.nextInt();
        System.out.println("Please provide the third integer.");
        int third_int = scan.nextInt();
        double output = (first_int+second_int+third_int)/3.0;
        System.out.println("The average of the numbers is: " + output);
        scan.close();
    }
}
