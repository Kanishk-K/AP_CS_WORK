package Unit_3;
import java.util.Scanner;
import java.lang.Math;

public class RandomGame {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the max number that you want to guess between?");
        int max = scan.nextInt();
        System.out.println("What's the min number that you want to guess between?");
        int min = scan.nextInt();
        int random_num = (int)(Math.random()*(max-min) + min);
        System.out.println("You are now tasked with guessing that random number. What's your guess?");
        int guess = scan.nextInt();
        while (guess != random_num){
            if (guess > random_num){
                System.out.println("Too high, try a lower number.");
            }
            if (guess < random_num){
                System.out.println("Too low, try a higher number.");
            }
            guess = scan.nextInt();
        }
        if (guess == random_num){
            System.out.println("You guessed it correctly! The number was " + random_num + ".");
        }
        scan.close();
    }
}
