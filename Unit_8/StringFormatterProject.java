package Unit_8;

import java.util.ArrayList;
public class StringFormatterProject {
    public static class StringFormatter {
        //See instructions for method implementation specs.
        public static int totalLetters(ArrayList<String> words){
            int response = 0;
            for (String i : words){
                response += i.length();
            }
            return response;
        }
        public static int basicGapWidth(ArrayList<String> words, int formLength){
            return (formLength-totalLetters(words))/(words.size()-1);
        }
        public static int leftoverSpaces(ArrayList<String> words, int formLength){
            return (formLength-totalLetters(words))%(words.size()-1);
        }
        public static String format(ArrayList<String> words, int formLength){
            String response = "";
            int spacing = basicGapWidth(words, formLength);
            int leftoverSpaces = leftoverSpaces(words, formLength);
            for (String i : words){
                response += i;
                for (int j=0;j<spacing;j++){
                    response += " ";
                }
                if (leftoverSpaces > 0){
                    response += " ";
                    leftoverSpaces -= 1;
                }
            }
            return response;
        }
    }
    public static void main(String[] args) {
        ArrayList<String> p1 = new ArrayList<String>();
        p1.add("here");
        p1.add("comes");
        p1.add("the");
        p1.add("boom");
        ArrayList<String> p2 = new ArrayList<String>();
        p2.add("whats");
        p2.add("up");
        ArrayList<String> p3 = new ArrayList<String>();
        p3.add("wherez");
        p3.add("da");
        p3.add("beef");
        //Lets check out your total letter method!
        System.out.println(StringFormatter.totalLetters(p3));
        //how about basic gap?????
        System.out.println(StringFormatter.basicGapWidth(p3,17));
        //left over space
        System.out.println(StringFormatter.leftoverSpaces(p3, 17));
        //now lets do some formatting!!!!
        System.out.println(StringFormatter.format(p1, 21));
        System.out.println(StringFormatter.format(p2, 14));
        System.out.println(StringFormatter.format(p3, 17));
    }
}
