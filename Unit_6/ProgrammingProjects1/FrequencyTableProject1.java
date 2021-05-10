import java.util.Scanner;

public class FrequencyTableProject1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] Storage = new int[51];
        System.out.println("Enter a number between 0 and 50");
        int input = scan.nextInt();
        while(input>=0 && input<=50){
            Storage[input]++;
            System.out.println("Enter a number between 0 and 50");
            input = scan.nextInt();
        }
        for(int i=0;i<Storage.length;i++){
            System.out.print(i + ": " +Storage[i]+"\t");
            if((i+1)%10 == 0){
                System.out.println();
            }
        }
        scan.close();
    }
}
