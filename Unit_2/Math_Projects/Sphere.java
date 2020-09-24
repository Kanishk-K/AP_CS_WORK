package Unit_2.Math_Projects;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class Sphere {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the radius of your sphere?");
        double radius = scan.nextFloat();
        String volume = String.format("%.4f",Math.pow(radius, 3) * Math.PI * 4/3);
        String SurfaceArea = String.format("%.4f",Math.pow(radius, 2) * Math.PI * 4);
        System.out.println("Volume: " + volume + "\n" + "Surface Area: " + SurfaceArea);
        scan.close();
    }
}
