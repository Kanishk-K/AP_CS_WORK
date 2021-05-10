public class DeepTissue {
    // I'm not making another file, you can't make me Mr. Swanson.
    public static class Tissue{
        // Create a variable that exists within this object to count the number of visitors.
        private int count = 0;
        // Take a string of name and return a string with it used.
        public String greeting(String name){
            count++;
            return "Welcome " + name + "! You are visitor #" + count+".";
        }
        // Print everything from 2^1 to 2^10 inclusive. Don't return anything.
        public void powersOfTwo(){
            for (int i = 1;i<11;i++){
                System.out.println(Math.round(Math.pow(2, i)));
            }
        }
        // Take two integers and return an int after the method is called.
        public int maxOfTwo(int num1, int num2){
            if (num1 >= num2){
                return num1;
            }
            else{
                return num2;
            }
        }
        // Return a true if num > num2 else return a false.
        public boolean larger(double num1, double num2){
            return num1 > num2;
        }
        // Return a number rounded to two digits.
        public double average(int num1, int num2){
            return Math.round((num1+num2)/2.0 * 100) / 100.0;
        }
        /*
        Really not sure why Mr. Swanson thought this was neccisary, just instantiate a *args array and
        then you can just allow the users to input as many integers as they want, add them up and divide by the
        length of the array. Rounding should work as usual. Making a bunch of methods like this is tedious and gross.
        Would not reccomend 2/10.
        */
        public double average(int num1, int num2, int num3, int num4){
            return Math.round((num1+num2+num3+num4)/4.0 * 100) / 100.0;
        }
    }
    public static void main(String args[]){
        // Create a class object from above and make it do stuff, pretty self explanitory.
        // Also why is this project called tissue? It's like 4am and I can't be bothered so whatever.
        Tissue object = new Tissue();
        System.out.println(object.greeting("Person One"));
        System.out.println(object.greeting("Person Two"));
        object.powersOfTwo();
        System.out.println(object.maxOfTwo(4, 5));
        System.out.println(object.larger(5.312, 3.1419));
        System.out.println(object.average(3, 5));
        System.out.println(object.average(2, 4, 7, 10));
    }
}
