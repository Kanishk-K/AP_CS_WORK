import java.util.Scanner;

public class Arithmetic {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide the first floating point number: ");
        double first_float = scan.nextDouble();
        System.out.println("Please provide the second floating point number: ");
        double second_float = scan.nextDouble();
        System.out.println("Sum: " + (first_float+second_float));
        System.out.println("Difference: " + (first_float-second_float));
        System.out.println("Product: " + (first_float*second_float));
        scan.close();
    }
}
