import java.util.Scanner;

public class TrackingSalesProject {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many salespersons are there?");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum, max=sales[0],maxid=0,min=sales[0],minid=0;
        for (int i=0; i<sales.length; i++){
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
            if (i == 0){
                min = sales[0];
            }
            else if (min > sales[i]){
                min = sales[i];
                minid = i;
            }
            if (max < sales[i]){
                max = sales[i];
                maxid = i;
            }
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++){
            System.out.println(" " + (i+1) + "        " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sales: " + ((double)sum/sales.length));
        System.out.println("Salesperson " + (maxid+1) + " had the highest sale with $" + max);
        System.out.println("Salesperson " + (minid+1) + " had the lowest sale with $" + min);
        System.out.println("Please enter a minimum number for sales to display Salespersons who scored higher.");
        min = scan.nextInt();
        int total=0;
        for (int i=0;i<sales.length;i++){
            if (sales[i]>min){
                System.out.println("Salesperson " + (i+1) + " earned more than $" + min);
                total += 1;
            }
        }
        System.out.println("Total people who earned more: " + total);
        scan.close();
    }
}
