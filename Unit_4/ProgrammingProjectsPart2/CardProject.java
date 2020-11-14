package Unit_4.ProgrammingProjectsPart2;

public class CardProject {
    public static class Card{
        private int value;
        private String suit;
        public Card(String input_suit){
            value = (int)(Math.random()*13 + 1);
            suit = input_suit;
        }
        public String toString(){
            return "This card is a "+value+" of " +suit;
        }
    }
    public static void main(String args[]){
        String[] suits = {"Diamond","Club","Heart","Spade"};
        for(int i=0;i<20;i++){
            Card response = new Card(suits[(int)(Math.random()*4)]);
            System.out.println(response.toString());
        }
    }
}
