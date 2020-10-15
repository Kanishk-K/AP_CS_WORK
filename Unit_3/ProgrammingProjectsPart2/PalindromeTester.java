package Unit_3.ProgrammingProjectsPart2;
import java.util.Scanner;

public class PalindromeTester {
    public static void main(String args[]){
        String str,input,another = "y";
        int left, right;
        Scanner scan = new Scanner (System.in);
        while (another.equalsIgnoreCase("y")){
            System.out.println ("Enter a potential palindrome:");
            str = "";
            input = scan.nextLine().toLowerCase();
            for (char letter:input.toCharArray()){
                if(Character.isLetter(letter) && !Character.isWhitespace(letter)){
                    str += Character.toString(letter);
                }
            }
            left = 0;
            right = str.length() - 1;
            while (str.charAt(left) == str.charAt(right) && left < right){
                left++;
                right--;
            }
            System.out.println();
            if (left < right){
                System.out.println ("That string is NOT a palindrome.");
            }
            else{
                System.out.println ("That string IS a palindrome.");
                System.out.println();
                System.out.print ("Test another palindrome (y/n)? ");
                another = scan.nextLine();
            }
        }
        scan.close();
    }
}
