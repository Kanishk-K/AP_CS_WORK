package Unit_3.ProgrammingProjectsPart2;
import java.util.Scanner;

public class RevisedStars {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the number of iterations you want this star to be.");
        int iterations = scan.nextInt();
        if (iterations > 0){
            for (int i = 0;i<iterations;i++){
                for (int j = iterations-i;j>0;j--){
                    System.out.print(" ");
                }
                for (int j=2*i+1;j>0;j-=2){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = iterations;i>=0;i--){
                for (int j = iterations-i;j>0;j--){
                    System.out.print(" ");
                }
                for (int j=2*i+1;j>0;j-=2){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Please enter a whole number greater than 0.");
        }
        scan.close();
    }
}
