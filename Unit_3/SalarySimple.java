package Unit_3;
import java.util.Scanner;

public class SalarySimple {
    public static void main(String args[]){
        double currentSalary,raise,newSalary;
        String rating;
        Scanner scan = new Scanner(System.in);
        // Get user input.
        System.out.println("Enter the current salary of the person: ");
        currentSalary = scan.nextDouble();
        // Move scanner head one line ahead.
        scan.nextLine();
        System.out.println("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.nextLine().toLowerCase();
        if (rating.equals("excellent")){
            raise = currentSalary * .06;
        }
        else if (rating.equals("good")){
            raise = currentSalary * .04;
        }
        else if (rating.equals("good")){
            raise = currentSalary * .015;
        }
        else {
            // raise declaration needed here for default code execution even though termination is present.
            raise = 0;
            System.out.println("Input was invalid terminating script.");
            System.exit(0);
        }
        newSalary = currentSalary + raise;
        System.out.println("Current Salary: $" + String.format("%.2f", currentSalary));
        System.out.println("Amount of raise: $" + String.format("%.2f", raise));
        System.out.println("Your new salary: $" + String.format("%.2f", newSalary));
        scan.close();
    }
}
