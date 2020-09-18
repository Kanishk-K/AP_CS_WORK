package Unit_2.Projects;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the amount of hours you want converted.");
        int hours = scan.nextInt();
        System.out.println("Please input the amount of minutes you want converted.");
        int minutes = scan.nextInt();
        System.out.println("Please input the amount of seconds you want converted.");
        int seconds = scan.nextInt();
        System.out.println("The amount of seconds that equals is: " + (hours*3600+minutes*60+seconds));
        scan.close();
    }
}
