package Unit_2.Math_Projects;
import java.util.Scanner;
import java.lang.String;

public class Mileage {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the amount of gas used in the trip (gallons).");
        double gallons = scan.nextDouble();
        System.out.println("What was the value of the odometer at the start of the trip? (miles)");
        int odometer_start = scan.nextInt();
        System.out.println("What was the value of the odometer at the end of the trip? (miles)");
        int odometer_end = scan.nextInt();
        int distance = odometer_end - odometer_start;
        double MPG = distance/gallons;
        System.out.println("Your MPG was " + MPG + " miles per gallon.");
        scan.close();
    }
}
