package Unit_6;
import java.util.Scanner;

public class WarmupProject {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] IntStorage = new int[3];
        for (int i=0;i<IntStorage.length;i++){
            System.out.println("Please enter an integer to the array");
            IntStorage[i] = scan.nextInt();
        }
        IntStorage[1] += 3;
        char[] CharStorage = {'C','O','L','D'};
        System.out.println(CharStorage.length);
        CharStorage[0] = 'T';
        for (int i = 0;i<CharStorage.length;i++){
            System.out.print("\n");
            for(int j = 0;j<i;j++){
                System.out.print("\t");
            }
            System.out.print(CharStorage[i]);
        }
        scan.close();
    }
}
