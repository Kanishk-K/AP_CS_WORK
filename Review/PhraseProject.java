package Review;
public class PhraseProject {
    public static class Phrase {
        private String currentPhrase;
        public Phrase(String s){
            currentPhrase = s;
        }
        //Returns the start index of the nth occurrnece of str in the parameter phrase
        //returns -1 if the nth occurrence does not exist
        public int findNthOccurrence(String s, int n){
            int loc = 0;
            int count = 0;
            do{
                loc = currentPhrase.indexOf(s, loc);
                ++count;
                if(count == n)
                return loc;
                ++loc;
            } while(loc!=0);
            return -1;
        }
        public void replaceNthOccurrence(String str, int n, String repl){
            int index = findNthOccurrence(str, n);
            if (index != -1){
                currentPhrase = currentPhrase.substring(0,index) + repl + currentPhrase.substring(index+str.length(), currentPhrase.length());
            }
        }
        public int findLastOccurrence(String str){
            int i = 1;
            if (findNthOccurrence(str, i) == -1){
                return -1;
            }
            else{
                while(findNthOccurrence(str, i) != -1){
                    i++;
                }
                return i;
            }
        }
        public String toString(){
            return currentPhrase;
        }
    }
    public static void main(String[] args) {
        Phrase p1 = new Phrase("the cat in thi hat was black");
        Phrase p2 = new Phrase("bbbbbbbbbb");
        Phrase p3 = new Phrase("is a dish a wish if it is really a fish?");
        System.out.println("Where is the bbb?");
        System.out.println(p1.findNthOccurrence("bbb", 1));
        System.out.println("\nNow we will replace some words in a string");
        p1.replaceNthOccurrence("at", 2, "it");
        p3.replaceNthOccurrence("is", 3, "at");
        System.out.println(p1);
        System.out.println(p3);
        System.out.println(p3.findLastOccurrence("is"));
        System.out.println(p3.findLastOccurrence("our"));
    }
}
