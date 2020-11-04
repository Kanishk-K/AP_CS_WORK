package Unit_4;

public class APLineProject {
    public static class APLine{
        private int x,y,b;
        public APLine(int x_input,int y_input,int b_input){
            x = x_input;
            y = y_input;
            b = b_input;
        }
        public double getSlope(){
            return -((double)x/(double)y);
        }
        public boolean isOnLine(int x_pos,int y_pos){
            return x*x_pos + y*y_pos + b == 0;
        }
    }
    public static void main(String[] args) {
        APLine l1 = new APLine (5, 4, -17);
        System.out.printf("The slope is: %.2f\n",l1.getSlope());
        System.out.println("The points are on your line: "+ l1.isOnLine(5, -2));
        APLine l2 = new APLine (-5, 8, -7);
        System.out.printf("The slope is: %.2f\n",l2.getSlope());
        System.out.println("The points are on your line: "+ l2.isOnLine(6, 0));
    }
}
