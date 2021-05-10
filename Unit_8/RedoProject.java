
public class RedoProject {
    public static class Redo {
        public static int factorial(int value){
            if (value == 1){
                return 1;
            }
            else{
                return value * factorial(value - 1);
            }
        }
        public static int sum(int s, int b){
            if (b == s){
                return b;
            }
            else{
                return s + sum(s+1,b);
            }
        }
        public static int power(int base, int exponent){
            if (exponent == 0){
                return 1;
            }
            else{
                return base * power(base,exponent-1);
            }
        }
        public static void rand1To10(int n){
            if (n >= 1){
                System.out.print((int)(Math.random()*10 + 1));
                rand1To10(n-1);
            }
            else{
                System.out.println();
            }
        }
        public static void string1PerLine(String s){
            if (s.length() <= 1){
                System.out.println(s);
            }
            else{
                System.out.println(s.substring(0,1));
                string1PerLine(s.substring(1,s.length()));
            }
        }
        public static void stringBackwords(String s){
            if (s.length() <= 1){
                System.out.println(s);
            }
            else{
                System.out.println(s.substring(s.length()-1, s.length()));
                stringBackwords(s.substring(0, s.length()-1));
            }
        }
        public static boolean palin(String s){
            if (s.length() <= 1){
                return true;
            }
            else{
                if (s.substring(0, 1).equalsIgnoreCase(s.substring(s.length()-1,s.length()))){
                    return true && palin(s.substring(1, s.length()-1));
                }
                else{
                    return false;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("**Factorial work????**");
        System.out.println(Redo.factorial(7));
        System.out.println("**Sum????**");
        System.out.println(Redo.sum(-3, 7));
        System.out.println(Redo.sum(0, 50));
        System.out.println("**How about power?**");
        System.out.println("3^4 = "+Redo.power(3, 4));
        System.out.println("-3^3 = "+Redo.power(-3, 3));
        System.out.println("-3^0 = "+Redo.power(-3, 0));
        System.out.println("**How about some random numbers 1 to 10?**");
        Redo.rand1To10(3);
        System.out.println("Fun with some Srings...one one letter each line");
        Redo.string1PerLine("Animal");
        Redo.string1PerLine("");
        System.out.println("Now to end our fun a String backwards");
        Redo.stringBackwords("reverse");
        System.out.println("Is it a palindrome????");
        System.out.println("rac1e1car? "+Redo.palin("rac1e1car"));
        System.out.println("B? "+Redo.palin("B"));
        System.out.println("race1car? "+Redo.palin("race1car"));
    }
}
