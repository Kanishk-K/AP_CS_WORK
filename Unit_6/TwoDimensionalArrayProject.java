package Unit_6;
public class TwoDimensionalArrayProject {
    public static void main(String args[]){
        int[][] Container = new int[3][4];
        int sum = 0;
        for (int i=0;i<Container.length;i++){
            for(int j=0;j<Container[i].length;j++){
                int data = (int)(10 * Math.random());
                Container[i][j] = data;
                System.out.print(data + "\t");
            }
            System.out.println();
        }
        for (int i=0;i<Container.length;i++){
            for(int j=0;j<Container[i].length;j++){
                sum += Container[i][j];
            }
            System.out.println("Row " + (i+1) + " sum: " + sum);
            sum = 0;
        }
        for (int i=0;i<Container[0].length;i++){
            for(int j=0;j<Container.length;j++){
                sum += Container[j][i];
            }
            System.out.println("Column " + (i+1) + " sum: " + sum);
            sum = 0;
        }
    }
}
