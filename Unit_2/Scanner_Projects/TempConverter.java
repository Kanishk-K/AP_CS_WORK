package Unit_2.Scanner_Projects;
import java.util.Scanner;

public class TempConverter {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the degrees of Farenheight your want converted.");
        double Faren = scan.nextDouble();
        double Celcius = (Faren - 32) * 5/9;
        System.out.println("The celcius value of the temperature is " + Celcius);
        scan.close();
    }
}
