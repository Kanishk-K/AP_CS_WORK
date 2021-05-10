import java.util.Scanner;

public class FrequencyTableProject2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] Storage = new int[51];
        System.out.println("Enter a number between -25 and 25");
        int input = scan.nextInt();
        while(input>=-25 && input<=25){
            Storage[input+25]++;
            System.out.println("Enter a number between -25 and 25");
            input = scan.nextInt();
        }
        for(int i=0;i<Storage.length;i++){
            System.out.print((i-25) + ": " +Storage[i]+"\t");
            if((i+1)%10 == 0){
                System.out.println();
            }
        }
        scan.close();
    }
}
