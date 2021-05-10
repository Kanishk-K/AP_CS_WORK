import java.util.Scanner;

public class DigitAnalyzer {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number.");
        int input = scan.nextInt();
        int odd = 0,even = 0,zero = 0;
        while (input>0){
            if (input%10 == 0){
                zero += 1;
            }
            else if((input%10)%2==0){
                even += 1;
            }
            else{
                odd += 1;
            }
            input = (int)(input/10);
        }
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
        System.out.println("Zero: " + zero);
        scan.close();
    }
}
