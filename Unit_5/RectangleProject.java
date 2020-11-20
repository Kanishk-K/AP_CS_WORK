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
package Unit_5;
public class RectangleProject {
    public static class Rectangle{
        private int width,height;
        public Rectangle(){
            width = 0;
            height = 0;
        }
        public void editLength(int l){
            height = l;
        }
        public void editWidth(int w){
            width = w;
        }
        public int calcArea(){
            return width * height;
        }
        public int calcPerimeter(){
            return 2*width + 2*height;
        }
        public double calcDiagonal(){
            /*
            This function here adds width^2 + height^2 and then puts the result under a square root.
            This does the pythagorean theorem to find the diagonal.
            */
            return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        }
        public boolean equalArea(Rectangle otherRect){
            return otherRect.calcArea() == calcArea();
        }
        public boolean equalPerimiter(Rectangle otherRect){
            return otherRect.calcPerimeter() == calcPerimeter();
        }
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.editLength(3);
        r1.editWidth(4);
        //some basic checks
        System.out.println(r1.calcArea());
        System.out.println(r1.calcPerimeter());
        System.out.println(r1.calcDiagonal());
        //lets have some fun with aliases! First lets set our second object len and wid!
        r2.editLength(10);
        r2.editWidth(5);
        System.out.println("r2's area is: "+ r2.calcArea());
        //The area of these two areas should be different right?
        System.out.println(r1.equalArea(r2)+" yup they are different!");
        r2 = r1;
        //now they should be the same? right?
        System.out.println(r1.equalArea(r2)+" yup they are the same!");
        System.out.println("r2 has become through aliase r1! area is: "+ r2.calcArea());
        r1.editLength(7);
        //what will be the area of r2?
        System.out.println("Say what the area of r2 went from 12 to "+r2.calcArea()+" Though we changed r1?");
        System.out.println("You need to remember, they are aliases, anything done to r1 will "+ "be modified in r2!");
    }
}
