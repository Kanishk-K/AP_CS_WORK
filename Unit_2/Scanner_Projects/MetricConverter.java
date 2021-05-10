import java.util.Scanner;

public class MetricConverter {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the amount of miles you want converted.");
        double miles = scan.nextDouble();
        System.out.println("The amount of kilometers that equals is " + (miles*1.60935) + " km.");
        scan.close();
    }
}
