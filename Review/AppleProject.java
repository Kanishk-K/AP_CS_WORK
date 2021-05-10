public class AppleProject {
    public static class AppleBagger {
        public static double getApple(){
            return ((int)(Math.random()*11 + 30))/100.0;
        }
        public static int bagApples(double targetWeight, double allowedVariation){
            int i = 0;
            double currentWeight = 0;
            while (currentWeight < (targetWeight-allowedVariation)){
                i++;
                currentWeight += getApple();
            }
            return i;
        }
        /*
        public static int bagApples(double targetWeight){
            double currentWeight = getApple();
            double allowedVariation = currentWeight * .2;
            
            ***
                This function assumes that the user will at least accept one apple.
                If after collecting the first apple, the weight exceeds targetWeight - allowedVariation
                then it won't add another. Otherwise it will loop until currentWeight exceeds the difference.
                Instead of writing another while loop we can reuse the previous function by simply removing 
                the weight of the first apple from the targetWeight and add one extra to account for its quantity.
            ***

            return 1 + bagApples(targetWeight-currentWeight, allowedVariation);
        }
        */
    }
    public static void main(String[] args) {
        for(int x = 0; x < 5; ++x){
            System.out.println("Apples to fill 5lb. bag: " + AppleBagger.bagApples(5, .4));
        }
    }
}
