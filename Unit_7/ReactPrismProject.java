package Unit_7;

public class ReactPrismProject {
    public static class Rectangle {
        private double length;
        private double width;
        //Default constructor setting attributes to zero
        //********************************************
        public Rectangle (){
            length = 0;
            width = 0;
        }
        //Constructor with lenght and width passed as paremeters
        //******************************************************
        public Rectangle (double l, double w){
            length = l;
            width = w;
        }
        //This method edits the length of your object
        //*****************************************
        public void changeLen(double l){
            length = l;
        }
        //This method edits the width of the rectangle
        //*******************************************
        public void changeWid(double w){
            width = w;
        }
        //using this method will calculate the area of our rectangle object
        //*************************************************************
        public double area (){
            return length * width;
        }
        //using this method will calculate the perimeter of our rectangle
        //***************************************************************
        public double perimeter(){
            return 2*length + 2*width;
        }
    }
    public static class RectPrism extends Rectangle {
        private double height;
        public RectPrism (double l, double w, double h){
            super(l, w);//We need to use the parent constructor in order to give life to
            height = h;
        }
        //This method will calculate the volume of the rect. prism and returning as a
        public double volume(){
            return area() * height;
        }
        //This method will calculate the SA of the rect. prism returning as a double
        public double SA(){
            return 2 * (area() + super.width * height + super.length * height);
        }
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10.2, 11.6);
        RectPrism p1 = new RectPrism(12.7, 14, 4.1);
        RectPrism p2 = new RectPrism(3, 3, 3);
        System.out.printf("The area of r1 is: %.2f\n", r1.area());
        System.out.println("The preimeter of r1 is: " +r1.perimeter());
        System.out.println("Now lets calculate some volumes! ");
        System.out.printf("The volume of p1: %.2f\n", p1.volume() );
        System.out.printf("The SA of p2: %.2f\n", p2.SA());
    }
}
