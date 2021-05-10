import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class StringReader {
    public static void main(String args[]){
        //Intitial Setup
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        dictionary.put("a",0);
        dictionary.put("e",0);
        dictionary.put("i",0);
        dictionary.put("o",0);
        dictionary.put("u",0);
        System.out.println("Please input the string you want counted.");
        String input = scan.nextLine().toLowerCase();
        for (char item:input.toCharArray()){
            if(dictionary.containsKey(Character.toString(item))){
                dictionary.put(Character.toString(item), dictionary.get(Character.toString(item))+1);
            }
        }
        for (String key: dictionary.keySet()){
            System.out.println("Number of vowel "+key+": "+dictionary.get(key));
        }
        scan.close();
    }
}
