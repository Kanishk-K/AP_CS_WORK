package Unit_6;
import java.util.ArrayList;

public class DigitsProject {
    public static class Digits{
        private ArrayList<Integer> digitlist = new ArrayList<Integer>();
        public Digits(int num){
            do {
                digitlist.add(num%10);
                num/= 10;
            } while (num > 0);
        }
        public boolean isStrictlyIncreasing(){
            for (int i = digitlist.size()-1;i>0;i--){
                if (digitlist.get(i) >= digitlist.get(i-1)){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String args[]){
        System.out.println("The integer: 0 is: "+ new Digits(0).isStrictlyIncreasing());
        System.out.println("The integer: 1479 is: "+ new Digits(1479).isStrictlyIncreasing());
        System.out.println("The integer: 13368 is: "+ new Digits(13368).isStrictlyIncreasing());
        System.out.println("The integer: 2507 is: "+ new Digits(2507).isStrictlyIncreasing());
        System.out.println("The integer: 13 is: "+ new Digits(13).isStrictlyIncreasing());
    }
}
