import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class SlotMachine {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String another = "y";
        int random;
        Set<Integer> Slots = new HashSet<Integer>();
        while (another.equalsIgnoreCase("y")){
            for(int i = 0;i<3;i++){
                random = (int)(Math.random()*10);
                System.out.print(Integer.toString(random)+" ");
                Slots.add(random);
            }
            if(Slots.size() == 3){
                System.out.println("\nUnfortunately you got none to match.");
            }
            else if(Slots.size() == 2){
                System.out.println("\nCongrats, you matched two!");
            }
            else{
                System.out.println("\nJACKPOT!");
            }
            Slots.clear();
            System.out.println("Type \"y\" if you want to play again.");
            another=scan.nextLine();
        }
        scan.close();
    }
}
