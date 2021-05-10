import java.util.ArrayList;
import java.util.Collections;

public class CoinArrayListProject {
    public static class Coin
        {
        private final int HEADS = 0;
        private final int TAILS = 1;
        private int face;
        //-----------------------------------------------------------------
        // Sets up the coin by flipping it initially.
        //-----------------------------------------------------------------
        public Coin (){
            flip();
        }
        //-----------------------------------------------------------------
        // Flips the coin by randomly choosing a face value.
        //-----------------------------------------------------------------
        public void flip (){
            face = (int) (Math.random() * 2);
        }
        //-----------------------------------------------------------------
        // Returns true if the current face of the coin is heads.
        //-----------------------------------------------------------------
        public boolean isHeads (){
            return (face == HEADS);
        }
        //-----------------------------------------------------------------
        // Returns the current face of the coin as a string.
        //-----------------------------------------------------------------
        public String toString(){
            String faceName;
            if (face == HEADS){
                faceName = "Heads";
            }
            else{
                faceName = "Tails";
            }
            return faceName;
        }
    }
    public static void main(String args[]){
        ArrayList<Coin> CoinList = new ArrayList<Coin>();
        for (int i=0;i<10;i++){
            Coin CoinObject = new Coin();
            CoinList.add(CoinObject);
            System.out.println(CoinObject);
        }
        System.out.println("------------------------");
        for (int i=0;i<CoinList.size();i++){
            CoinList.get(i).flip();
            System.out.println(CoinList.get(i));
        }
        System.out.println("------------------------");
        ArrayList<Integer> IndexRemove = new ArrayList<Integer>();
        for (int i=0;i<CoinList.size();i++){
            if (CoinList.get(i).isHeads()){
                IndexRemove.add(i);
            }
            else{
                System.out.println(CoinList.get(i));
            }
        }
        // Flips List from greatest to least.
        Collections.reverse(IndexRemove);
        // Deletes heads from CoinList
        for (int Index : IndexRemove){
            CoinList.remove(Index);
        }
    }
}
