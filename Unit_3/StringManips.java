package Unit_3;
import java.util.Scanner;

public class StringManips {
    public static void main(String args[]){
        String phrase = new String ("This is a String test.");
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the city?");
        String city = scan.nextLine();
        System.out.println("What's the state?");
        String state = scan.nextLine();
        int phraseLength; // number of characters in the phrase String
        int middleIndex;
        // index of the middle character in the String
        String firstHalf; // first half of the phrase String
        String secondHalf; // second half of the phrase String
        String middle3;
        String switchedPhrase; // a new phrase with original halves switched
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;
        firstHalf = phrase.substring(0,middleIndex);
        middle3 = phrase.substring(middleIndex-1,middleIndex+2);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        switchedPhrase = secondHalf+firstHalf;
        //replace ‘ ‘ with ‘*’ in switchPhrase right here!!!!
        switchedPhrase = switchedPhrase.replace(" ", "*");
        System.out.println();
        System.out.println ("Original phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength +
        " characters");
        System.out.println ("Index of the middle: " + middleIndex);
        System.out.println ("Character at the middle index: " +
        phrase.charAt(middleIndex));
        System.out.println ("Switched phrase: " + switchedPhrase);
        System.out.println ("The middle 3 characters are: " + middle3);
        System.out.println();
        System.out.println(state.toUpperCase() + city.toLowerCase() + state.toUpperCase());
        scan.close();
    }
}
