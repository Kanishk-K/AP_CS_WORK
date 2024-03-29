/*
 █████╗ ████████╗████████╗███████╗███╗   ██╗████████╗██╗ ██████╗ ███╗   ██╗
██╔══██╗╚══██╔══╝╚══██╔══╝██╔════╝████╗  ██║╚══██╔══╝██║██╔═══██╗████╗  ██║
███████║   ██║      ██║   █████╗  ██╔██╗ ██║   ██║   ██║██║   ██║██╔██╗ ██║
██╔══██║   ██║      ██║   ██╔══╝  ██║╚██╗██║   ██║   ██║██║   ██║██║╚██╗██║
██║  ██║   ██║      ██║   ███████╗██║ ╚████║   ██║   ██║╚██████╔╝██║ ╚████║
╚═╝  ╚═╝   ╚═╝      ╚═╝   ╚══════╝╚═╝  ╚═══╝   ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝

- So it seems that this repository for classwork has gotten a lot more attention than I anticipated.

- There are more people accessing my code than I've given access to meaning that it's being shared around.

- I'm fine with this just let me know that you're sharing it with someone so I can keep track to how big this is.

- Also if you do plan on using any code from here at least make some changes in variable names/method names(when applicable)
or logic for pretty obvious reasons.

*/
public class SlopeInterceptProject {
    public static class Rational{
        private int numerator, denominator;
        //-----------------------------------------------------------------
        // Sets up the rational number by ensuring a nonzero denominator
        // and making only the numerator signed.
        //-----------------------------------------------------------------
        public Rational (int numer, int denom){
            if (denom == 0){
                denom = 1;
            }
            // Make the numerator "store" the sign
            if (denom < 0){
                numer = numer * -1;
                denom = denom * -1;
            }
            numerator = numer;
            denominator = denom;
            reduce();
        }
        //-----------------------------------------------------------------
        // Returns the numerator of this rational number.
        //-----------------------------------------------------------------
        public int getNumerator (){
            return numerator;
        }
        //-----------------------------------------------------------------
        // Returns the denominator of this rational number.
        //-----------------------------------------------------------------
        public int getDenominator (){
            return denominator;
        }
        //-----------------------------------------------------------------
        // Returns the reciprocal of this rational number.
        //-----------------------------------------------------------------
        public Rational reciprocal (){
            return new Rational (denominator, numerator);
        }
        //-----------------------------------------------------------------
        // Adds this rational number to the one passed as a parameter.
        // A common denominator is found by multiplying the individual
        // denominators.
        //-----------------------------------------------------------------
        public Rational add (Rational op2){
            int commonDenominator = denominator * op2.getDenominator();
            int numerator1 = numerator * op2.getDenominator();
            int numerator2 = op2.getNumerator() * denominator;
            int sum = numerator1 + numerator2;
            return new Rational (sum, commonDenominator);
        }
        //-----------------------------------------------------------------
        // Subtracts the rational number passed as a parameter from this
        // rational number.
        //-----------------------------------------------------------------
        public Rational subtract (Rational op2){
            int commonDenominator = denominator * op2.getDenominator();
            int numerator1 = numerator * op2.getDenominator();
            int numerator2 = op2.getNumerator() * denominator;
            int difference = numerator1 - numerator2;
            return new Rational (difference, commonDenominator);
        }
        //-----------------------------------------------------------------
        // Multiplies this rational number by the one passed as a
        // parameter.
        //-----------------------------------------------------------------
        public Rational multiply (Rational op2){
            int numer = numerator * op2.getNumerator();
            int denom = denominator * op2.getDenominator();
            return new Rational (numer, denom);
        }
        //-----------------------------------------------------------------
        // Divides this rational number by the one passed as a parameter
        // by multiplying by the reciprocal of the second rational.
        //-----------------------------------------------------------------
        public Rational divide (Rational op2){
            return multiply (op2.reciprocal());
        }
        //-----------------------------------------------------------------
        // Determines if this rational number is equal to the one passed
        // as a parameter. Assumes they are both reduced.
        //-----------------------------------------------------------------
        public boolean equals (Rational op2){
            return ( numerator == op2.getNumerator() &&denominator == op2.getDenominator() );
        }
        //-----------------------------------------------------------------
        // Returns this rational number as a string.
        //-----------------------------------------------------------------
        public String toString (){
            String result;
            if (numerator == 0){
                result = "0";
            }
            else{
                if (denominator == 1){
                    result = numerator + "";
                }
                else{
                    result = numerator + "/" + denominator;
                }
            }
            return result;
        }
        //-----------------------------------------------------------------
        // Reduces this rational number by dividing both the numerator
        // and the denominator by their greatest common divisor.
        //-----------------------------------------------------------------
        private void reduce (){
            if (numerator != 0){
                int common = gcd (Math.abs(numerator), denominator);
                numerator = numerator / common;
                denominator = denominator / common;
            }
        }
        //-----------------------------------------------------------------
        // Computes and returns the greatest common divisor of the two
        // positive parameters. Uses Euclid's algorithm.
        //-----------------------------------------------------------------
        private int gcd (int num1, int num2){
            while (num1 != num2){
                if (num1 > num2){
                    num1 = num1 - num2;
                }
                else{
                    num2 = num2 - num1;
                }
            }
            return num1;
        }
    }
    public static class SlopeIntercept{
        private Rational m,b;
        public SlopeIntercept(int x1,int y1, int x2, int y2){
            m = calcSlope(x1,y1,x2,y2);
            b = calcInt(x1,y1);
        }
        private Rational calcSlope(int x1,int y1,int x2, int y2){
            Rational response = new Rational(y1-y2,x1-x2);
            return response;
        }
        private Rational calcInt(int x1, int y1){
            Rational y = new Rational(y1,1);
            Rational x = new Rational(x1,1);
            Rational response = y.subtract(m.multiply(x));
            return response;
        }
        public String toString(){
            return "y = "+m.toString()+"x + ("+b.toString()+")";
        }
    }
    public static void main(String args[]){
        SlopeIntercept equation = new SlopeIntercept(-1, -7, 3, -7);
        System.out.println(equation);
        System.out.println();
        equation = new SlopeIntercept(0, 5, -3, 18);
        System.out.println(equation);
        System.out.println();
        equation = new SlopeIntercept(-7, -5, 2, 17);
        System.out.println(equation);
    }
}
