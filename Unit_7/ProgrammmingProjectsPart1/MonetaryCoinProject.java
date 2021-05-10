import java.lang.Math;
import java.util.Arrays;

public class MonetaryCoinProject {
    public static class Coin{
        private final int HEADS = 0;
        private final int TAILS = 1;
        private int face;
        //-----------------------------------------------------------------
        // Sets up the coin by flipping it initially.
        //-----------------------------------------------------------------
        public Coin (){
            flip();
        }
        //-----------------------------------------------------------------
        // Flips the coin by randomly choosing a face value.
        //-----------------------------------------------------------------
        public void flip (){
            face = (int) (Math.random() * 2);
        }
        //-----------------------------------------------------------------
        // Returns true if the current face of the coin is heads.
        //-----------------------------------------------------------------
        public boolean isHeads (){
            return (face == HEADS);
        }
        //-----------------------------------------------------------------
        // Returns the current face of the coin as a string.
        //-----------------------------------------------------------------
        public String toString(){
            String faceName;
            if (face == HEADS){
                faceName = "Heads";
            }
            else{
                faceName = "Tails";
            }
            return faceName;
        }
    }
    public static class MonetaryCoin extends Coin{
        private double value;
        public MonetaryCoin(double value){
            super();
            /*
                Let's say that the value of a coin can't be less
                than 1 cent. Wouldn't it be weird to hold half, a 
                quarter, or a tenth of a penny?
                We could set it to (this.value = value) if we
                wanted to allow those weird types of currency.
            */
            this.value = Math.round(value * 100.0) / 100.0;
        }
        public double getValue(){
            return value;
        }
        public String toString(){
            return "Monetary Coin Value: " + value; 
        }
    }
    public static void main(String args[]){
        MonetaryCoin[] Wallet = new MonetaryCoin[10];
        double count  = 0;
        for (int i = 0;i<Wallet.length;i++){
            Wallet[i] = new MonetaryCoin(Math.random());
            System.out.println(Wallet[i]);
            count += Wallet[i].getValue();
        }
        System.out.println("---------------");
        /*
            This seems to sometimes generate a floating point error
            even though I rounded the money within the class itself.
            Seems like Java isn't too fond of operating on floats that
            aren't perfect bases of 2. 
        */
        System.out.println("Total Value (Using Loop): " + count);
        System.out.println("---------------");
        /*
            Now for some reason, using this funky library that I found
            the floating point issue seems to happen less. According 
            to documentation, this function works as such. First the 
            Arrays.stream(Wallet) runs through the Wallet array returning
            the MonetaryCoin objects. The mapToDouble forms another Double
            array by applying the getValue() getter method on all the coins.
            After aggregating all the doubles, the sum function adds them all up.
            Seems very interesting, I wonder if there are any benefits to using
            this library compared to a for loop.
        */
        double total = Arrays.stream(Wallet).mapToDouble(MonetaryCoin::getValue).sum();
        System.out.println("Total Value (Using Arrays Library): " + total);
    }
}