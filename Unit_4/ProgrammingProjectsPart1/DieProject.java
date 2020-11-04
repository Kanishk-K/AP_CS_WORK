package Unit_4.ProgrammingProjectsPart1;
import java.util.HashSet;
import java.util.Set;
public class DieProject {
    public static class Die{
        private final int MIN_FACES = 4;
        private int numFaces;
        private int faceValue;
        public Die (){
            numFaces = 6;
            faceValue = 1;
        }
        public Die (int faces){
            if (faces < MIN_FACES)
                numFaces = 6;
            else{
                numFaces = faces;
                faceValue = 1;
            }
        }
        public int roll (){
            faceValue = (int)(Math.random()*numFaces)+1;
            return faceValue;
        }
        public int getFaceValue (){
            return faceValue;
        }
    }
    public static class PairOfDice {
        private Die Die1 = new Die();
        private Die Die2 = new Die();
        public Set<Integer> roll(){
            Set<Integer> rolls = new HashSet<Integer>();
            rolls.add(Die1.roll());
            rolls.add(Die2.roll());
            return rolls;
        }
        public boolean isBoxCar(Set<Integer> inputRolls){
            return inputRolls.size() == 1 && inputRolls.iterator().next() == 6;
        }
    }
    public static void main(String args[]){
        Die Die1 = new Die(8);
        System.out.println(Die1.roll());

        int count = 0;
        PairOfDice Pair = new PairOfDice();
        for (int i=0;i<1000;i++){
            if (Pair.isBoxCar(Pair.roll())){
                count++;
            }
        }
        System.out.println("Number of BoxCars in 1000 runs: " + count);
    }
}
