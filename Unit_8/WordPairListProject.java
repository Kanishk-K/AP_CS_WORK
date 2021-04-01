package Unit_8;
import java.util.ArrayList;

public class WordPairListProject {
    public static class WordPair {
        private String p1;
        private String p2;
        public WordPair(String s1, String s2){
            p1 = s1;
            p2 = s2;
        }
        public String getFirst(){
            return p1;
        }
        public String getSecond(){
            return p2;
        }
        public String toString(){
            return "(\"" + p1 +"\"," + "\""+ p2+"\")";
        }
    }
    public static class WordPairList {
        private ArrayList<WordPair> allPairs;
        public WordPairList(String [] words){
            allPairs = new ArrayList<WordPair>();
            for (int i=0;i<words.length;i++){
                for (int j=i+1;j<words.length;j++){
                    allPairs.add(new WordPair(words[i],words[j]));
                }
            }
        }
        public int numMatches(){
            int response = 0;
            for (int i=0;i<allPairs.size();i++){
                if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())){
                    response += 1;
                }
            }
            return response;
        }
        public String toString (){
            return "" + allPairs;
        }
    }
    public static void main(String[] args) {
        String[] words1 = {"the", "more", "the", "merrier"};
        String[] words2 = {"the", "red", "fox", "the", "red"};
        String[] words3 = {"chicken", "soup", "chicken", "soup", "chicken"};
        WordPairList list1 = new WordPairList(words1);
        WordPairList list2 = new WordPairList(words2);
        WordPairList list3 = new WordPairList(words3);
        System.out.println("Lets check to see if your constructor works");
        System.out.println("List 1: "+list1);
        System.out.println("List 2: "+list2);
        System.out.println("List 3: "+list3);
        System.out.println("---------------------------------------------");
        System.out.println("now does numMatches work?");
        System.out.println("list 1 matches: "+ list1.numMatches());
        System.out.println("list 2 matches: "+ list2.numMatches());
        System.out.println("list 3 matches: "+ list3.numMatches());
    }
}
