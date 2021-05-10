import java.util.Hashtable;
import java.lang.Comparable;

public class ChessProject {
    public interface Pieces {
        //you will return true if the two pieces are from the same player.
        public boolean samePlayer(ChessPiece c2);
    }
    public static class ChessPiece implements Comparable<ChessPiece>, Pieces{
        /*
        Utilizing final keyword for best-practicies. 
        These variables should not change anywhere during operation and thus 
        should be enforced as such. Not really vital here, however,
        with larger projects and more complicated workflows 
        involving multiple files this can become
        increasingly important.
        */
        private final String type;
        private final int player;
        /* 
        Hashtable matches the value of a string to an integer 
        designating its value. The benefit of this is that it reduces 
        the usage of if-elseif-else statements which operate at O(1) 
        each (assuming underlying call doesn't involve higher O operation). 
        Thus if I was to run multiple if statements those O(1)s 
        would accumulate over time. Hashtables operate at O(1) and 
        would theoretically operate faster since they call like an array. 
        While not a data structure we have learned yet, the effieciency 
        is apparent in larger datasets or operations.
        */
        private static final Hashtable<String,Integer> PieceLookup = new Hashtable<String,Integer>(){
            {
                put("Pawn",0);
                put("Knight",1);
                put("Rook",1);
                put("Bishop",1);
                put("Queen",2);
                put("King",3);
            }
        };
        public ChessPiece(String type,int player){
            this.type = type;
            this.player = player;
        }
        public String getType(){
            return type;
        }
        public int getPlayer(){
            return player;
        }
        public String toString(){
            return type + " Player: " + player;
        }
        public boolean samePlayer(ChessPiece SecondPiece){
            return player == SecondPiece.getPlayer();
        }
        public int compareTo(ChessPiece SecondPiece){
            if (PieceLookup.get(type)<PieceLookup.get(SecondPiece.getType())){
                return -1;
            }
            if (PieceLookup.get(type)==PieceLookup.get(SecondPiece.getType())){
                return 0;
            }
            else{
                return 1;
            }
        }
    }
    public static void main(String args[]){
        ChessPiece p1 = new ChessPiece("King", 1);
        ChessPiece p2 = new ChessPiece("Queen", 1);
        ChessPiece p3 = new ChessPiece("Knight", 1);
        ChessPiece p4 = new ChessPiece("Pawn", 1);
        ChessPiece t1 = new ChessPiece("Pawn", 0);
        ChessPiece t2 = new ChessPiece("Rook", 0);
        ChessPiece t3 = new ChessPiece("Knight", 0);
        System.out.println(p1.compareTo(t3));
        System.out.println(p4.compareTo(t1));
        System.out.println(p4.compareTo(t3));
        System.out.println(p2.compareTo(p1));
        System.out.println(p2.compareTo(t2));
        System.out.println(p3.compareTo(t2));
        System.out.println(p1.samePlayer(p3));
        System.out.println(p1.samePlayer(t2));
        System.out.println(p3);
    }
}
