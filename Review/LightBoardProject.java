package Review;
import java.lang.Math;
public class LightBoardProject {
    public static class LightBoard {
        private boolean [][] lights;
        public LightBoard(int row, int col){
            lights = new boolean[row][col];
            for (int i = 0;i<lights.length;i++){
                for (int j = 0;j<lights[0].length;j++){
                    if (Math.random() >= .4){
                        lights[i][j] = true;
                    }
                }
            }
        }
        public boolean evaluateLight(int row, int col){
            if (lights[row][col]){
                boolean base = lights[0][col];
                for (int i=1;i<lights.length;i++){
                    /*
                        Most people would go the typical route of math 
                        sums but I wanted to do something different by 
                        implementing an XOR gate comparison. In this 
                        case if the amount of "true"s are even it will 
                        return a false. If they are not even it will 
                        return a true, hence my if statement after.
                        This isn't something I would typically do in an 
                        AP exam but it's a good thought exercise nevertheless.
                    */
                    base = base ^ lights[i][col];
                }
                if (!base){
                    return false;
                }
            }
            else if (!lights[row][col]){
                int sum = 0;
                for (int i=0;i<lights.length;i++){
                    sum += lights[i][col] ? 1 : 0;
                }
                if (sum % 3 == 0){
                    return true;
                }
            }
            return lights[row][col];
        }
        public String toString()
        {
            String holder = "\t";
            for (int x = 0; x < lights[0].length; ++x){
                holder += x + "\t";
            }
            holder += "\n";
            for(int r = 0; r < lights.length; ++r){
                holder += r + "\t";
                for(int c = 0; c < lights[0].length; ++c){
                    holder += lights[r][c] + "\t";
                }
                holder += "\n";
            }
            return holder;
        }
    }
    public static void main(String[] args) {
        LightBoard board1 = new LightBoard(1, 10);
        LightBoard board2 = new LightBoard(6, 3);
        LightBoard board3 = new LightBoard(4, 1);
        System.out.println("Does your constructor work???");
        System.out.println("Board1:\n" + board1);
        System.out.println("Board2:\n" + board2);
        System.out.println("Board3:\n" + board3);
        System.out.println("***********************************");
        System.out.println("Now how about evaluateLight???\n");
        System.out.println("Board1, position 0, 0" + board1.evaluateLight(0, 0));
        System.out.println("Board2, position 2, 2" + board2.evaluateLight(2, 2));
        System.out.println("Board3, position 3, 0" + board3.evaluateLight(3, 0));
    }
}
