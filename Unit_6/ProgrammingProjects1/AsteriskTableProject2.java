package Unit_6.ProgrammingProjects1;
import java.util.Scanner;

public class AsteriskTableProject2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] Storage = new int[100];
        System.out.println("Please enter a number within 1 to 100");
        int sum=0,input = scan.nextInt();
        while(input>=1 && input<=100){
            Storage[input-1]++;
            System.out.println("Please enter a number within 1 to 100");
            input = scan.nextInt();
        }
        for(int i = 0;i<Storage.length/10;i++){
            for (int j = 0;j<10;j++){
                sum += Storage[i*10+j];
            }
            System.out.printf("%d - %d | ",i*10+1,i*10+10);
            for (int j = 0;j<sum/5;j++){
                System.out.print("*");
            }
            System.out.println();
            sum=0;
        }
        scan.close();
    }
}
