package Unit_3;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class SalaryComplex {
    public static void main(String args[]){
        // Initialize a key:dict pair so that scalability is easy.
        Map<String, Double> dictionary = new HashMap<String, Double>();
        dictionary.put("excellent",.06);
        dictionary.put("good",.04);
        dictionary.put("poor",.015);
        // Initialize primiative datatypes.
        double currentSalary,raise,newSalary;
        String rating;
        Scanner scan = new Scanner(System.in);
        // Get user input.
        System.out.println("Enter the current salary of the person: ");
        currentSalary = scan.nextDouble();
        // Move scanner head one line ahead.
        scan.nextLine();
        System.out.println("Enter the performance rating (Excellent, Good, or Poor): ");
        // Sanitize input so it's compatible with dictionary key pair.
        rating = scan.nextLine().toLowerCase();
        // Check if the input exists is a valid input for the dictionary, if not terminate script.
        if (dictionary.containsKey(rating)){
            // Prepare output with a round off at 2 decimals.
            raise = currentSalary * dictionary.get(rating);
            newSalary = currentSalary + raise;
            System.out.println("Current Salary: $" + String.format("%.2f", currentSalary));
            System.out.println("Amount of raise: $" + String.format("%.2f", raise));
            System.out.println("Your new salary: $" + String.format("%.2f", newSalary));
        }
        else{
            // Declare that the input is invalid and terminate script.
            System.out.println("Your response was invalid, terminating script. Please input a valid rating.");
        }
        scan.close();
    }
}
