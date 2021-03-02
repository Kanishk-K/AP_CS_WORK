package Unit_8;

public class SpinnerProject {
    public static class GameSpinner{
        private final int sectors;
        private int current;
        private int currentCount = 0;
        public GameSpinner(int sectors){
            this.sectors = sectors;
        }
        public int spin(){
            int value = (int) (Math.random() * sectors + 1);
            if (current == value){
                currentCount += 1;
            }
            else{
                currentCount = 1;
                current = value;
            }
            return value;
        }
        public int currentRun(){
            return currentCount;
        }
    }
    public static void main(String[] args) {
        GameSpinner spinner = new GameSpinner(5);
        System.out.println("Streak: "+spinner.currentRun());
        System.out.println("*****************************");
        for(int x = 0; x < 15; ++x)
        {
        System.out.print("spin: "+spinner.spin());
        System.out.println("Streak: "+spinner.currentRun());
        System.out.println("*****************************");
        }
    }
}
