package Unit_7;
import java.util.ArrayList;

public class RandomStringChooserProject {
    public static class RandomStringChooser{
        private ArrayList<String> wordArray = new ArrayList<String>();
        public RandomStringChooser(String[] input){
            for (int i=0;i<input.length;i++){
                wordArray.add(input[i]);
            }
        }
        public String getNext(){
            if (wordArray.size() > 0){
                int randInt = (int)(Math.random() * wordArray.size());
                return wordArray.remove(randInt);
            }
            else{
                return "NONE";
            }
        }
    }
    public static class RandomLetterChooser extends RandomStringChooser {
        //See instructions to implement this method
        public RandomLetterChooser(String letters)
        {
            super(toLetters(letters));
        }
        //A String is sent as a parameter to this method
        //The equivalent String is returned with each individual letter assigned to a String Array
        public static String [] toLetters(String s){
            String[] let = new String [s.length()];
            for(int x = 0; x < s.length();++x){
                let[x] = s.substring(x, x+1);
            }
            return let;
        }
    }
    public static void main(String[] args) {
        String [] list = {"Hello", "Fred", "How", "Warm", "You"};
        RandomStringChooser str = new RandomStringChooser(list);
        for(int x = 0; x < 7; ++x)
        System.out.print(str.getNext()+" ");
        System.out.println("\n*****************************");
        System.out.println("now lets see if we can apply to letters \n");
        RandomLetterChooser letters = new RandomLetterChooser("Goose");
        for(int x = 0; x < 7; ++x)
        System.out.println(letters.getNext());
    }
}
