package Review;
public class CrosswordProject {
    public static class Crossword {
        private Square [][] puzzle;
        public Crossword(boolean [][] bSquare){
            puzzle = new Square[bSquare.length][bSquare[0].length];
            int counter = 0;
            for (int i = 0;i<bSquare.length;i++){
                for (int j = 0;j<bSquare[i].length;j++){
                    if (bSquare[i][j]){
                        /* 
                        Proper convention to set -1 for invalidity,
                        null can be used, however, this can cause bugs.
                        Additionally, null is typically used when a 
                        value is not known. We do know this value, it's
                        just that it's invalid.
                        */
                        puzzle[i][j] = new Square(bSquare[i][j], -1);
                    }
                    else if (!bSquare[i][j] && !toBeLabeled(i, j, bSquare)){
                        puzzle[i][j] = new Square(bSquare[i][j], -1);
                    }
                    else{
                        puzzle[i][j] = new Square(bSquare[i][j], ++counter);
                    }
                }
            }
        }
        private boolean toBeLabeled(int r, int c, boolean[][] bSquare){
            /* 
                There are two edge cases that should be documented.

                Case 1: Block is at the top row.
                    - Here the block will always be labeled since
                    there is never going to be a block above it.
                Case 2: Block is at left edge.
                    - Here the block will always be labeled since
                    there is never going to be a block to its left.

                If both cases are not considered before the actual
                logic, there will be IndexOutOfBound exception as the
                script tries to query before row 0 or before column 0
            */
            if(r == 0 || c==0){
                // Return true as these are edge cases.
                return true;
            }
            else if (bSquare[r-1][c] || bSquare[r][c-1]){
                // Block above or block to the left are black.
                return true;
            }
            else{
                // Block is white, however does not qualify.
                return false;
            }
        }
        public void display(){
            // Changed this a bit so it prints in a "block" shape.
            for(Square[] r : puzzle){
                for(Square value: r){
                    System.out.print(value + "\t");
                }
                System.out.println();
            }
        }
    }
    public static class Square {
        private boolean black;
        private int num;
        public Square(boolean b, int n){
            black = b;
            num = n;
        }
        public String toString(){
            if(black){
                return "b ";
            }
            else if(num>0){
                return "w"+num+" ";
            }
            else{
                return "w ";
            }
        }
    }
    public static void main(String[] args) {
        boolean [][] black = {{true, false, true, false, false},
                            {false, false, false, true, false},
                            {true, false, false, false, false},
                            {false, false, false, false, true}};
        Crossword puz1 = new Crossword(black);
        puz1.display();
    }
}