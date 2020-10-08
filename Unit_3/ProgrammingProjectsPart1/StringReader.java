package Unit_3.ProgrammingProjectsPart1;
import java.util.Scanner;

public class StringReader {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a string of characters you want separated by character.");
        String response = scan.nextLine();
        for (int i = 0;i<response.length();i++){
            System.out.println(response.charAt(i));
        }
        scan.close();
    }
}
