import java.util.Arrays;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many games do you want to play?");
        int games = scan.nextInt();
        String[] choices = {"rock","paper","scissors"};
        scan.nextLine();
        for (int i=0;i<games;i++){
            System.out.println("Please insert your choice");
            String choice = scan.nextLine().toLowerCase();
            String computerchoice = choices[(int)(Math.random()*choices.length)];
            if (Arrays.asList(choices).contains(choice)){
                System.out.println("Computer Chose: " + computerchoice + "\t" + "User chose: " + choice);
                if(computerchoice.equals("rock")){
                    if(choice.equals("rock")){
                        System.out.println("It's a tie!");
                    }
                    if(choice.equals("paper")){
                        System.out.println("You won this one!");
                    }
                    if(choice.equals("scissors")){
                        System.out.println("You lost this one!");
                    }
                }
                if(computerchoice.equals("paper")){
                    if(choice.equals("rock")){
                        System.out.println("You lost this one!");
                    }
                    if(choice.equals("paper")){
                        System.out.println("It's a tie!");
                    }
                    if(choice.equals("scissors")){
                        System.out.println("You won this one!");
                    }
                }
                if(computerchoice.equals("scissors")){
                    if(choice.equals("rock")){
                        System.out.println("You won this one!");
                    }
                    if(choice.equals("paper")){
                        System.out.println("You lost this one!");
                    }
                    if(choice.equals("scissors")){
                        System.out.println("It's a tie!");
                    }
                }
            }
            else{
                System.out.println("Please input a valid item");
                i--;
            }
        }
        scan.close();
    }
}
