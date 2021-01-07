package Unit_6;

public class MagicSquareProject {
    public static class Square {
        private int[][] square;
        //--------------------------------------
        //implement the constructor
        //--------------------------------------
        public Square(int [][] magic){
            square = magic;
        }
        //--------------------------------------
        //return the sum of the values in the given row
        //--------------------------------------
        public int sumRow(int row){
            int sum = 0;
            for(int j=0;j<square[row].length;j++){
                sum += square[row][j];
            }
            return sum;
        }
        //--------------------------------------
        //return the sum of the values in the given column
        //--------------------------------------
        public int sumCol(int col){
            int sum=0;
            for (int i=0;i<square.length;i++){
                sum += square[i][col];
            }
            return sum;
        }
        //--------------------------------------
        //return the sum of the values in the main diagonal
        //--------------------------------------
        public int sumMainDiag(){
            int sum = 0;
            for (int i=0;i<square.length;i++){
                sum += square[i][i];
            }
            return sum;
        }
        //--------------------------------------
        //return the sum of the values in the other ("reverse") diagonal
        //--------------------------------------
        public int sumOtherDiag(){
            int sum = 0;
            for (int i=0;i<square.length;i++){
                sum += square[(square.length-1-i)][i];
            }
            return sum;
        }
        //--------------------------------------
        //return true if the square is magic (all rows, cols, and diags have
        //same sum), false otherwise
        //--------------------------------------
        public boolean magic(){
            boolean rowSum= true,colSum=true;
            for (int i=0;i<square.length-1;i++){
                rowSum = rowSum && (sumRow(i) == sumRow(i+1));
            }
            for (int j=0;j<square[0].length-1;j++){
                colSum = colSum && (sumCol(j) == sumCol(j+1));
            }
            return colSum && rowSum && (sumMainDiag() == sumOtherDiag()) && (sumRow(0) == sumCol(0)) && (sumRow(0) == sumMainDiag());
        }
    }
    public static void main(String[] args){
        int [][] square1 = {{8, 1, 6},
                            {3, 5, 7},
                            {4, 9, 2}};
        int [][] square2 = {{30, 39, 48, 1, 10, 19, 28},
                            {38, 47, 7, 9, 18, 27, 29},
                            {46, 6, 8, 17, 26, 35, 37},
                            {5, 14, 16, 25, 34, 36, 45},
                            {13, 15, 24, 33, 42, 44, 4},
                            {21, 23, 32, 41, 43, 3, 12},
                            {22, 31, 40, 49, 2, 11, 20}};
        int [][] square3 = {{48, 9, 6, 39},
                            {27, 18, 21, 36},
                            {15, 30, 33, 24},
                            {12, 45, 42, 3}};
        int [][] square4 = {{6, 2, 7},
                            {1, 5, 3},
                            {2, 9, 4}};
        int [][] square5 = {{3, 16, 2, 13},
                            {6, 9, 7, 12},
                            {10, 5, 11, 8},
                            {15, 4, 14, 1}};
        int [][] square6 = {{17, 24, 15, 8, 1},
                            {23, 5, 16, 14, 7},
                            {4, 6, 22, 13, 20},
                            {10, 12, 3, 21, 19},
                            {11, 18, 9, 2, 25}};
        int [][] square7 = {{30, 39, 48, 1, 10, 28, 19},
                            {38, 47, 7, 9, 18, 29, 27},
                            {46, 6, 8, 17, 26, 37, 35},
                            {5, 14, 16, 25, 34, 45, 36},
                            {13, 15, 24, 33, 42, 4, 44},
                            {21, 23, 32, 41, 43, 12, 3},
                            {22, 31, 40, 49, 2, 20, 11}};
        Square magic1 = new Square(square1);
        Square magic2 = new Square(square2);
        Square magic3 = new Square(square3);
        Square magic4 = new Square(square4);
        Square magic5 = new Square(square5);
        Square magic6 = new Square(square6);
        Square magic7 = new Square(square7);
        //we will test our your sum row, column, both diagonal
        //on square one. these are in play to determine magic
        System.out.println("Row "+0+" sum: "+magic4.sumRow(0));
        //print the sums of its columns
        System.out.println("column "+0+" sum: "+magic4.sumCol(0));
        //print the sum of the main diagonal
        System.out.println("Main diangonal sum: "+magic4.sumMainDiag());
        //print the sum of the other diagonal
        System.out.println("Main diangonal sum: "+magic4.sumOtherDiag());
        //determine and print whether it is a magic square
        System.out.println("\n******** square1 " + magic1.magic() + " ********");
        System.out.println("----------------------------------------------------");
        System.out.println("\n******** square2 " + magic2.magic() + " ********");
        System.out.println("----------------------------------------------------");
        System.out.println("\n******** square3 " + magic3.magic() + " ********");
        System.out.println("----------------------------------------------------");
        System.out.println("\n******** square4 " + magic4.magic() + " ********");
        System.out.println("----------------------------------------------------");
        System.out.println("\n******** square5 " + magic5.magic() + " ********");
        System.out.println("----------------------------------------------------");
        System.out.println("\n******** square6 " + magic6.magic() + " ********");
        System.out.println("----------------------------------------------------");
        System.out.println("\n******** square7 " + magic7.magic() + " ********");
        System.out.println("----------------------------------------------------");
    }
}
