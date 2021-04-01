package Unit_8;

public class TokenPassProject {
    public static class TokenPass {
        private int[] board;
        private int currentPlayer;
        //Create the constructor as described by the instructions
        public TokenPass(int pcount){
            board = new int[pcount];
            currentPlayer = (int) (Math.random() * pcount);
            for (int i = 0;i<board.length;i++){
                board[i] = (int)(Math.random()*9 + 1);
            }
        }
        //Write this method as explained in the instructions
        public void distributeCurrentPlayerTokens(){
            int loopcount = board[currentPlayer];
            board[currentPlayer] = 0;
            for (int i = 0;i<loopcount;i++){
                board[(currentPlayer+i+1)%board.length] += 1;
            }
            currentPlayer = (currentPlayer+1)%board.length;
        }
        //I needed this to help in grading your implementations…..
        public int getCurretPlayer(){
            return currentPlayer;
        }
        public String toString(){
            String holder = "";
            for(int x = 0; x < board.length; ++x)
            holder += "\t"+x;
            holder += "\n";
            for(int x = 0; x < board.length;++x)
            holder += "\t" + board[x];
            return holder;
        }
    }
    public static void main(String[] args) {
        TokenPass b1 = new TokenPass(6);
        System.out.println(b1);
        b1.distributeCurrentPlayerTokens();
        //now the after
        System.out.println(b1.getCurretPlayer());
        System.out.println(b1);
    }
}
