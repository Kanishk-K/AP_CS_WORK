package Unit_4;
public class DeepTissue {
    public static class Tissue{
        private int count = 0;
        public String greeting(String name){
            count++;
            return "Welcome " + name + "! You are visitor #" + count+".";
        }
        public void powersOfTwo(){
            for (int i = 1;i<11;i++){
                System.out.println(Math.round(Math.pow(2, i)));
            }
        }
        public int maxOfTwo(int num1, int num2){
            if (num1 >= num2){
                return num1;
            }
            else{
                return num2;
            }
        }
        public boolean larger(double num1, double num2){
            return num1 > num2;
        }
        public double average(int num1, int num2){
            return Math.round((num1+num2)/2.0 * 100) / 100.0;
        }
        public double average(int num1, int num2, int num3, int num4){
            return Math.round((num1+num2+num3+num4)/4.0 * 100) / 100.0;
        }
    }
    public static void main(String args[]){
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
