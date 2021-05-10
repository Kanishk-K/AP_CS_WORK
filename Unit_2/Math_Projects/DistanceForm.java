import java.util.Scanner;
import java.lang.Math;

public class DistanceForm {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in the x coordinate for the first point.");
        double x_coord_one = scan.nextFloat();
        System.out.println("Type in the y coordinate for the first point.");
        double y_coord_one = scan.nextFloat();
        System.out.println("Type in the x coordinate for the second point.");
        double x_coord_two = scan.nextFloat();
        System.out.println("Type in the y coordinate for the second point.");
        double y_coord_two = scan.nextFloat();
        double distance = Math.sqrt(
            Math.pow((x_coord_one-x_coord_two), 2) + Math.pow((y_coord_one-y_coord_two), 2)
        );
        System.out.println("The distance between the two points is: " + distance);
        scan.close();
    }
}
