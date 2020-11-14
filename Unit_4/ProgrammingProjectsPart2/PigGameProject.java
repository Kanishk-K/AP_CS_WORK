package Unit_4.ProgrammingProjectsPart2;
import java.util.Scanner;
import java.util.Arrays;

public class PigGameProject {
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
        private int intArray[] = new int[2];
        public int[] roll(){
            intArray[0] = Die1.roll();
            intArray[1] = Die2.roll();
            return intArray;
        }
        public boolean BoxCar(int req_val){
            return intArray[0] == req_val && intArray[0] == intArray[1];
        }
    }
    public static void main(String args[]){
        PairOfDice User = new PairOfDice();
        PairOfDice Computer = new PairOfDice();
        String input = "y";
        boolean repeat = true;
        int response[] = new int[2];
        int UserPoints = 0,ComputerPoints = 0,TempPoints = 0;
        Scanner scan = new Scanner(System.in);
        //Play this game until either the user or computer surpasses or equals 100
        System.out.println("Would you like to roll first? Type \"y\" if you do.");
        input = scan.nextLine();
        while (UserPoints < 100 && ComputerPoints < 100){
            //User turn
            while(input.equalsIgnoreCase("y") && ComputerPoints < 100){
                response = User.roll();
                System.out.println("Die 1\tDie2\n"+response[0]+"\t"+response[1]);
                if (response[0] != 1 && response[1] != 1){
                    TempPoints += Arrays.stream(response).sum();
                    System.out.println("Would you like to roll again? Player Current Points: "+TempPoints);
                    input = scan.nextLine();
                }
                else{
                    if(User.BoxCar(1)){
                        UserPoints = 0;
                        TempPoints = 0;
                        input = "0";
                        System.out.println("Player lost all their points!");
                    }
                    else{
                        TempPoints = 0;
                        input = "0";
                        System.out.println("Sorry player, no points this round!");
                    }
                }
            }
            UserPoints += TempPoints;
            TempPoints = 0;
            while(TempPoints < 20 && repeat == true && UserPoints < 100){
                response = Computer.roll();
                System.out.println("Die 1\tDie2\n"+response[0]+"\t"+response[1]);
                if (response[0] != 1 && response[1] != 1){
                    TempPoints += Arrays.stream(response).sum();
                    System.out.println("Computer Current Points: "+TempPoints);
                }
                else{
                    if(Computer.BoxCar(1)){
                        ComputerPoints = 0;
                        TempPoints = 0;
                        input = "0";
                        System.out.println("Computer lost all of their points!");
                        repeat = false;
                    }
                    else{
                        TempPoints = 0;
                        input = "0";
                        System.out.println("Sorry Computer, no points this round!");
                        repeat = false;
                    }
                }
            }
            ComputerPoints += TempPoints;
            System.out.println("Player Points: " + UserPoints + "\tComputer Points: " + ComputerPoints);
            input = "y";
            repeat = true;
            TempPoints = 0;
        }
        scan.close();
    }
}
