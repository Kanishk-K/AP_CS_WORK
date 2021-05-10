import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class HeronsForm {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the length of the first side of the triangle.");
        double first_side = scan.nextDouble();
        System.out.println("What's the length of the second side of the triangle.");
        double second_side = scan.nextDouble();
        System.out.println("What's the length of the third side of the triangle.");
        double third_side = scan.nextDouble();
        double s = (first_side+second_side+third_side)/2;
        double area = Math.sqrt(
            s*(s-first_side)*(s-second_side)*(s-third_side)
        );
        System.out.println("The area of the triangle is: " + String.format("%.3f", area));
        scan.close();
    }
}
