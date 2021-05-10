
public class DiverseArrayProject {
    public static class DiverseArray {
        //See instructions for implemention details
        public static int arraySum(int [] list){
            int response = 0;
            for (int i : list){
                response += i;
            }
            return response;
        }
        //See instructions for implemention details
        public static int [] rowSums(int [][] d2){
            int [] response = new int[d2.length];
            for (int i=0;i<d2.length;i++){
                response[i] = DiverseArray.arraySum(d2[i]);
            }
            return response;
        }
        //See instructions for implemention details
        public static boolean isDeverse(int [][] d2){
            int[] rowSums = DiverseArray.rowSums(d2);
            int[] runStack = new int[rowSums.length];
            for (int i =0;i<rowSums.length;i++){
                for (int j=0;j<runStack.length;j++){
                    if (rowSums[i]==runStack[j]){
                        return false;
                    }
                }
                runStack[i] = rowSums[i];
            }
            return true;
        }
    }
    public static void main(String[] args) {
        int [] row = {1,2,3,4,5,6};
        int [][] array1 = {{1,3,2,7,3},
                        {10,10,4,6,2},
                        {5,3,5,9,6},
                        {7,6,4,2,1}};
        int [][] array2 = {{1,1,5,3,4},
                        {12,7,6,1,9},
                        {8,11,10,2,5},
                        {3,2,3,0,6}};
        int [][] array3 = {{1,2,3,4,5,6},
                        {-2,7,-6,1,-9,0},
                        {-8,-11,10,2,5,0},
                        {3,2,3,0,2,-12}};
        int [][] array4 = {{6},
                        {-2},
                        {-5},
                        {-12}};
        System.out.println("Can we sum up an array of integers?: should be 21: " + DiverseArray.arraySum(row));
        System.out.println();
        System.out.println("Now can we sum all rows of a 2D integer array? " );
        int [] sumRows = DiverseArray.rowSums(array1);
        for(int value:sumRows)
        System.out.print(value + ", ");
        System.out.println();
        System.out.println();
        System.out.println("array1 diverse? "+ DiverseArray.isDeverse(array1));
        System.out.println("array2 diverse? "+ DiverseArray.isDeverse(array2));
        System.out.println("array3 diverse? "+ DiverseArray.isDeverse(array3));
        System.out.println("array4 diverse? "+ DiverseArray.isDeverse(array4));
    }
}
