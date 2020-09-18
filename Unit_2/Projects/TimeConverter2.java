package Unit_2.Projects;
import java.util.Scanner;

public class TimeConverter2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a amount of time in seconds.");
        //Gets string from input and converts it into integer for usage.
        int InputTime = scan.nextInt();

        int seconds = InputTime % 60;
        int minutes = InputTime / 60;
        int hours = minutes / 60;
        minutes = minutes % 60;

        System.out.println("Hours: " + hours + " Minutes: " + minutes + " Seconds: " + seconds);
        scan.close();
    }
}
