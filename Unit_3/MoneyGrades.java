package Unit_3;
import java.util.Scanner;
import java.lang.String;

public class MoneyGrades {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("What was the points aquired?");
        double points_aquired = scan.nextDouble();
        System.out.println("How many points could be aquried total?");
        double max_total = scan.nextDouble();
        int percent = (int)((points_aquired/max_total + 0.005)*100);
        System.out.println(percent);
        double money = 0;
        if (percent >= 60 && percent < 70){
            money = (percent-60)*.5;
        }
        if (percent >= 70 && percent < 80){
            money = (percent-70)*.65 + 9*.5;
        }
        if (percent >= 80 && percent < 90){
            money = (percent-80)*.8  + 9*.65 + 9*.5;
        }
        if (percent > 90){
            money = (percent-90) + 9*.8 + 9*.65 + 9*.5;
        }
        System.out.println("The amount of money earned was: $" + String.format("%.2f", money));
        scan.close();
    }
}
