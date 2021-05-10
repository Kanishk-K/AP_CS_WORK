public class BigHailProject {
    public static class Hailstone {
        public static int hailstoneLength(int n){
            if (n == 1){
                return 1;
            }
            else{
                if (n%2 == 0){
                    return 1 + hailstoneLength(n/2);
                }
                else{
                    return 1 + hailstoneLength(3*n + 1);
                }
            }
        }
        public static boolean isLongSeq(int n){
            return n < hailstoneLength(n);

        }
        public static double propLong(int n){
            int count = 0;
            for (int i = 1;i<=n;i++){
                if(isLongSeq(i)){
                    count++;
                }
            }
            return ((double)(count))/n;
        }
    }
    public static void main(String[] args) {
        System.out.println("Does hailstoneLength work?");
        System.out.println("hailstoneLength of 1 = " + Hailstone.hailstoneLength(1));
        System.out.println("hailstoneLength of 5 = " + Hailstone.hailstoneLength(5));
        System.out.println("hailstoneLength of 9 = " + Hailstone.hailstoneLength(9));
        System.out.println("hailstoneLength of 55 = " + Hailstone.hailstoneLength(55));
        System.out.println("*******************************************");
        System.out.println("Does isLongSeq work?");
        System.out.println("isLongSeq for 4? " + Hailstone.isLongSeq(4));
        System.out.println("isLongSeq for 3? " + Hailstone.isLongSeq(3));
        System.out.println("***********************************************");
        System.out.println("Last will propLong work?");
        System.out.println("propLong for 10 is: " + (int)(Hailstone.propLong(10)*100+.5)/100.0);
        System.out.println("propLong for 15 is: " + (int)(Hailstone.propLong(15)*100+.5)/100.0);
    }
}
