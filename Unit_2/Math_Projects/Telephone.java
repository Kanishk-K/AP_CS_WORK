import java.lang.Math;
import java.lang.String;

public class Telephone {
    public static void main(String args[]){
        System.out.println("The randomly generated telephone number is: "+
       (int)(Math.random() * 9) + (int)(Math.random() * 9) + (int)(Math.random() * 9) +
       "-" +
       String.format("%03d",(int)(Math.random() * 742)) +
       "-" +
       String.format("%04d",(int)(Math.random() * 10000))
        );
    }
}
