package Unit_3.ProgrammingProjectsPart2;
import java.util.Scanner;

public class HiLoGame {
    public static void main(String args[]){
        int goal = (int)(Math.random() * 99 + 1);
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your guess for the random number?");
        int input = scan.nextInt();
        while (input != goal){
            if (input < goal){
                System.out.println("You're a bit too low.");
            }
            if (input > goal){
                System.out.println("You're a bit too high");
            }
            System.out.println("What's your guess for the random number?");
            input = scan.nextInt();
        }
        System.out.println("Correct, the answer was " + goal);
        scan.close();
    }
}
