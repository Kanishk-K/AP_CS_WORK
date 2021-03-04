package Unit_8;

public class Redo2Project {
    public static class Redo2{
        public static int prodEven(int n){
            if (n == 2){
                return 2;
            }
            else{
                if (n%2==0){
                    return n * prodEven(n-2);
                }
                else{
                    return prodEven(n-1);
                }
            }
        }
        public static int sumEvenDigits(int n){
            if (n == 0){
                return 0;
            }
            else{
                if (n%2==0){
                    return n + sumEvenDigits(n-2);
                }
                else{
                    return sumEvenDigits(n-1);
                }
            }
        }
        public static int sumInts(int[] nums, int size){
            return helpSumInts(nums, 0);
        }
        private static int helpSumInts(int[] n, int loc){
            if (loc == n.length-1){
                return n[n.length-1];
            }
            else{
                return n[loc] + helpSumInts(n, loc+1);
            }
        }
        public static int numMatches(String [] words, String w){
            return numMatchesHelp(words, w, 0);
        }
        public static int numMatchesHelp(String[] words, String w, int loc){
            if (loc == words.length-1){
                return words[loc].equalsIgnoreCase(w)?1:0;
            }
            else{
                return words[loc].equalsIgnoreCase(w)?1+numMatchesHelp(words, w, loc+1):0+numMatchesHelp(words, w, loc+1);
            }
        }
        public static void oneDigitPerLine(int num){
            if (num == 0){
                return;
            }
            else{
                oneDigitPerLine(num/10);
            }
            System.out.println(num % 10);
        }
    }
    public static void main(String[] args) {
        System.out.println("Find the product of the even numbers 2 through value");
        System.out.println("Evens values through 10: "+ Redo2.prodEven(11));
        System.out.println("\nNow provide the sum of the even digits for the integer");
        System.out.println("132485 sum even digits is: "+
        Redo2.sumEvenDigits(132485));
        System.out.println("\nSum up the integers in the given array!");
        int [] nums = { 4, -2, 7, 9, 0, -1};
        System.out.println("{ 4, -2, 7, 9, 0 -1}summed is: "+ Redo2.sumInts(nums, 6));
        String [] words = {"dog", "cat", "rat", "snake", "rat", "Monkey"};
        System.out.println("Do we have a match? How many? "+
        Redo2.numMatches(words, "Rat"));
        System.out.println("Here's the number 1234 one digit per line");
        Redo2.oneDigitPerLine(1234);
    }
}
