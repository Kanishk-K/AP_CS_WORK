package Unit_3.ProgrammingProjectsPart1;
import java.util.Scanner;

public class EvenInteger {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number that you want the even numbers summed: ");
        int number = scan.nextInt();
        int response = 0;
        if (number >= 2){
            for(int i = 2; i<=number; i++){
                if (i % 2 == 0){
                    response += i;
                }
            }
            System.out.println("Your sum of numbers is: " + response);
        }
        else{
            System.out.println("Error: Please put an input value greater than 2.");
        }
        scan.close();
    }
}
