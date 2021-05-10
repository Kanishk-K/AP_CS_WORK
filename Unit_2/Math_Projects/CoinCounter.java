import java.util.Scanner;

public class CoinCounter {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Quarters?");
        int Quarters = scan.nextInt();
        System.out.println("How many Dimes?");
        int Dimes = scan.nextInt();
        System.out.println("How many Nickels?");
        int Nickels = scan.nextInt();
        System.out.println("How many Pennies?");
        int Pennies = scan.nextInt();
        String total = String.format("%.2f",(Quarters*.25 + Dimes*.1 + Nickels*.05 + Pennies*.01));
        System.out.println("The amount of money present is: $" + total);
        scan.close();
    }
}
