package Unit_8;

public class ArrayTesterProject {
    public static class ArrayTester {
        //implementation for you. part(a)
        public static int[] getColumn(int[][] arr2d, int c){
            int[] response = new int[arr2d.length];
            for (int i = 0;i<arr2d.length;i++){
                response[i] = arr2d[i][c];
            }
            return response;
        }
        public static boolean hasAllValues(int[] a1, int[]a2){
            boolean pass = false;
            int counter = 0;
            for (int x = 0; x < a1.length;++x){
                for(int y = 0; y < a2.length; ++y){
                    if(a1[x]==a2[y]){
                        pass = true;
                    }
                }
                if(pass == true){
                    ++ counter;
                }
                pass = false;
            }
            return counter == a1.length;
        }
        public static boolean containDuplicates(int[] arr)
        {
            for(int x = 0; x < arr.length-1; ++x){
                for(int y = x+1; y < arr.length; ++y){
                    if(arr[x]==arr[y]){
                        return true;
                    }
                }
            }
            return false;
        }
        //your implementation for part b
        public static boolean isLatin (int[][] sq){
            // Check for duplicates in first row
            if (containDuplicates(sq[0])){
                return false;
            }
            // Check if same numbers are repeated in each row
            for (int i = 1;i<sq.length;i++){
                if (!hasAllValues(sq[0], sq[i])){
                    return false;
                }
            }
            // Check if the columns don't have repeats.
            for (int i=1;i<sq[0].length;i++){
                if (!hasAllValues(getColumn(sq, 0), getColumn(sq, i))){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        int [][] square1 = {{10,30,20,0},
                            {0,20,30,10},
                            {30,0,10,20},
                            {20,10,0,30}};
        int [][] square2 = {{1,2,3},
                            {2,1,1},
                            {1,1,1}};
        int [][] square3 = {{10,30,20,0},
                            {0,30,20,10},
                            {30,0,10,20},
                            {20,10,0,30}};
        int [][] square4 = {{10,30,20,20},
                            {0,20,30,10},
                            {30,0,10,20},
                            {20,10,0,30}};
        System.out.println("Square 1: "+ArrayTester.isLatin(square1));
        System.out.println("Square 2: "+ArrayTester.isLatin(square2));
        System.out.println("Square 3: "+ArrayTester.isLatin(square3));
        System.out.println("Square 4: "+ArrayTester.isLatin(square4));
    }
}
