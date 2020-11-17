package Unit_4.ProgrammingProjectsPart2;
import java.util.Scanner;

public class PigGameSimple {
    public static class Die{
        private final int MIN_FACES = 4;
        private int numFaces;
        private int faceValue;
        public Die (){
            numFaces = 6;
            faceValue = 1;
        }
        public Die (int faces){
            if (faces < MIN_FACES)
                numFaces = 6;
            else{
                numFaces = faces;
                faceValue = 1;
            }
        }
        public int roll (){
            faceValue = (int)(Math.random()*numFaces)+1;
            return faceValue;
        }
        public int getFaceValue (){
            return faceValue;
        }
    }
    public static class PairOfDice {
        private Die Die1 = new Die();
        private Die Die2 = new Die();
        private int roll1,roll2;
        public String roll(){
            roll1 = Die1.roll();
            roll2 = Die2.roll();
            return "Rolled a " + roll1 + " and a " + roll2;
        }
        public int rollValue(){
            return roll1+roll2;
        }
        public boolean OnePresent(){
            return roll1 == 1 || roll2 == 1;
        }
        public boolean TwoOnePresent(){
            return roll1 == 1 && roll2 == 1;
        }
    }
    public static void main(String args[]){
        boolean ComputerTurn=false;
        String PlayerTurn = "y";
        int ComputerScore=0,PlayerScore=0,TempScore=0;
        Scanner scan = new Scanner(System.in);
        PairOfDice PersonDice = new PairOfDice(); PairOfDice ComputerDice = new PairOfDice();
        while(ComputerScore < 100 && PlayerScore < 100){
            // Player's turn
            while(PlayerTurn.equalsIgnoreCase("y")){
                System.out.println(PersonDice.roll());
                // If a one is not present
                if (!PersonDice.OnePresent()){
                    TempScore += PersonDice.rollValue();
                    System.out.println("Would you like to play again? Press \"y\" if yes.");
                    PlayerTurn = scan.nextLine();
                }
                else{
                    if(PersonDice.TwoOnePresent()){
                        PlayerScore = 0;
                        PlayerTurn = "null";
                    }
                    else{
                        TempScore = 0;
                        PlayerTurn = "null";
                    }
                    System.out.println("Computer's Turn ");
                }
            }
            PlayerScore += TempScore;
            TempScore = 0;
            while(TempScore < 20 && ComputerTurn){
                System.out.println(ComputerDice.roll());
                if (!ComputerDice.OnePresent()){
                    TempScore += ComputerDice.rollValue();
                }
                else{
                    if(PersonDice.TwoOnePresent()){
                        ComputerScore = 0;
                        ComputerTurn = false;
                    }
                    else{
                        TempScore = 0;
                        ComputerTurn = false;
                    }
                    System.out.println("Player's Turn ");
                }
            }
            ComputerScore += TempScore;
            TempScore = 0;
            PlayerTurn = "y";
            ComputerTurn = true;
            System.out.println("Player Score: " + PlayerScore + "\tComputer Score: " + ComputerScore);
        }
        scan.close();
    }
}
