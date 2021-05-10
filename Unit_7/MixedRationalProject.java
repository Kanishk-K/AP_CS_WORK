
public class MixedRationalProject {
    public static class Rational {
        private int numerator, denominator;
        public Rational (int numer, int denom){
            if (denom == 0){
                denom = 1;
            }
            if (denom < 0){
                numer = numer * -1;
                denom = denom * -1;
            }
            numerator = numer;
            denominator = denom;
            reduce();
        }
        public int getNumerator (){
            return numerator;
        }
        public int getDenominator (){
            return denominator;
        }
        public Rational reciprocal (){
            return new Rational (denominator, numerator);
        }
        public Rational add (Rational op2){
            int commonDenominator = denominator * op2.getDenominator();
            int numerator1 = numerator * op2.getDenominator();
            int numerator2 = op2.getNumerator() * denominator;
            int sum = numerator1 + numerator2;
            return new Rational (sum, commonDenominator);
        }
        public Rational subtract (Rational op2){
            int commonDenominator = denominator * op2.getDenominator();
            int numerator1 = numerator * op2.getDenominator();
            int numerator2 = op2.getNumerator() * denominator;
            int difference = numerator1 - numerator2;
            return new Rational (difference, commonDenominator);
        }
        public Rational multiply (Rational op2){
            int numer = numerator * op2.getNumerator();
            int denom = denominator * op2.getDenominator();
            return new Rational (numer, denom);
        }
        public Rational divide (Rational op2){
            return multiply (op2.reciprocal());
        }
        public boolean equals (Rational op2){
            return ( numerator == op2.getNumerator() &&
            denominator == op2.getDenominator() );
        }
        public String toString (){
            String result;
            if (numerator == 0)
            result = "0";
            else
            if (denominator == 1)
            result = numerator + "";
            else
            result = numerator + "/" + denominator;
            return result;
        }
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
    public static class MixedRational extends Rational {
        private int whole;
        //My constructor! We invoke the constructor from Rational to construct
        //some of the object..... This constructor
        //should fix issues as in 1-5/4 to be 2-1/4!!!!! Enjoy!
        public MixedRational(int w, int n, int d){
            super(Math.abs(n)%d,d);
            if(w < 0){
                whole = -1*(-1*w + n/d);
            }
            else{
                whole = w + n/d;
            }
        }
        public int getWhole(){
            return whole;
        }
        //This method Changes an MixedRational to a Rational and Returns it
        public Rational toImproper(){
            Rational returnObject;
            if (whole < 0){
                returnObject = super.add(new Rational(Math.abs(super.getDenominator()*whole),super.getDenominator())).multiply(new Rational(-1,1));
            }
            else{
                returnObject = super.add(new Rational(super.getDenominator()*whole,super.getDenominator()));
            }
            returnObject.reduce();
            whole = 1;
            return returnObject;
        }
        //This method adds two MixedRational's and returns a MixedRational
        public MixedRational add(MixedRational m2){
            Rational returnObject = this.toImproper().add(m2.toImproper());
            returnObject.reduce();
            return new MixedRational(0,returnObject.getNumerator(),returnObject.getDenominator());
        }
        //This method Mult. two MixedRational's and returns a MixedRational
        public MixedRational multiply(MixedRational m2){
            Rational returnObject = this.toImproper().multiply(m2.toImproper());
            returnObject.reduce();
            return new MixedRational(0,returnObject.getNumerator(),returnObject.getDenominator());
        }
        //This method adds two MixedRational's and returns a MixedRational
        public MixedRational subtract(MixedRational m2){
            Rational returnObject = this.toImproper().subtract(m2.toImproper());
            returnObject.reduce();
            return new MixedRational(0,returnObject.getNumerator(),returnObject.getDenominator());
        }
        //This method divides two MixedRational's and returns a MixedRational
        public MixedRational divide(MixedRational m2){
            Rational returnObject = this.toImproper().divide(m2.toImproper());
            returnObject.reduce();
            return new MixedRational(0,returnObject.getNumerator(),returnObject.getDenominator());
        }
        //Write a toString method that will return a string as the following.
        // 2-3/4
        public String toString (){
            return this.getWhole() + "-" + super.toString();

        }
    }
    public static void main(String[] args) {
        //MixedRational [] mix = new MixedRational[4];
        MixedRational mix0 = new MixedRational(-1,6,5);
        MixedRational mix1 = new MixedRational (2,3,4);
        MixedRational mix2 = new MixedRational (-2,1, 3);
        MixedRational mix3 = new MixedRational (3,1,4);
        System.out.println("Was the constructor properly made?");
        System.out.println(mix0);
        System.out.println("Checking out the add, sub, mult, and div methods");
        System.out.println(mix1.subtract(mix1));
        System.out.println(mix0.subtract(mix3));
        System.out.println(mix0.multiply(mix2));
        System.out.println(mix3.divide(mix2));
        System.out.println(mix1.add(mix2));
    }
    
}
