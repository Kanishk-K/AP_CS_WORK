package Unit_3;

public class WhileLoop {
    public static void main(String args[]){
        String RandomMade = "Your string is: ";
        int i = 0;
        while (i < 5){
            RandomMade += (char)(int)(Math.random()*62 + 65);
            i++;
        }
        System.out.println(RandomMade);
    }
}
