package Unit_4;
import java.util.Scanner;

public class CoinFlip {
    // Initiate class within a singular file because I don't want to make another file.
    public static class Coin{
        private boolean face;
        // Instantiation method, when new coin is made. Perform Coin.flip();
        public Coin(){
            flip();
        }
        // Void, no return value once Coin.flip(); is called.
        public void flip(){
            face = (int)(Math.random()*2) == 1;
        }
        // boolean here indicates a return value of a type boolean.
        public boolean isHeads(){
            return (face == true);
        }
        public String faceName(){
            if (face == true){
                return "Heads";
            }
            else{
                return "Tails";
            }
        }
    }
    public static void main(String args[]){
        // Get coin object from class above. Initiate a new object.
        Coin coin = new Coin();
        Scanner scan = new Scanner(System.in);
        double count = 0;
        System.out.println("How many flips do you want to do?");
        int iterations = scan.nextInt();
        for (int i = 0; i<iterations;i++){
            coin.flip();
            if (coin.isHeads()){
                count++;
            }
        }
        System.out.println("The percent of heads is " + (int)(count/iterations * 100 + .5) + "% heads.");
        scan.close();
    }
}
