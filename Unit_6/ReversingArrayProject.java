package Unit_6;
import java.lang.Math;

public class ReversingArrayProject {
    public static void main(String args[]){
        int[] Storage = new int[101];
        int holder;
        //Assignment
        for (int i = 0;i<Storage.length;i++){
            holder = (int)(Math.random()*101) - 15;
            Storage[i] = holder;
            System.out.print(holder + " ");
            if ((i+1)%10 ==0){
                System.out.println();
            }
        }
        for (int i =0;i<Storage.length/2;i++){
            holder = Storage[i];
            Storage[i] = Storage[Storage.length-1-i];
            Storage[Storage.length-1-i] = holder;
        }
        System.out.println();
        System.out.println();
        for (int i = 0;i<Storage.length;i++){
            System.out.print(Storage[i] + " ");
            if ((i+1)%10 ==0){
                System.out.println();
            }
        }
    }
}
