
public class NewCounter{
    public static void main (String[] args){
        final int LIMIT = 5;
        int count = 1;
        while (count <= LIMIT){
            count = count + 1;
            System.out.println (count-1);
        }
        System.out.println ("Done");
    }
}