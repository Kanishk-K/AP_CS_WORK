
public class WordCheckerProject {
    public static class CodeWordChecker{
        int lowerbound,upperbound;
        String contains;
        public CodeWordChecker(String contain){
            lowerbound = 6;
            upperbound = 20;
            contains = contain;
        }
        public CodeWordChecker(int lower, int upper, String contain){
            lowerbound = lower;
            upperbound = upper;
            contains = contain;
        }
        public boolean isValid(String str){
            if (str.length() > upperbound | str.length() < lowerbound){
                return false;
            }
            return !str.contains(contains);
        }
    }
    public static void main(String[] args) {
        CodeWordChecker t1 = new CodeWordChecker(5,8,"$");
        CodeWordChecker t2 = new CodeWordChecker("animal");
        System.out.println("T1: " + t1.isValid("happy!"));
        System.out.println("T1: " + t1.isValid("happy$"));
        System.out.println("T1: " + t1.isValid("Code"));
        System.out.println("T1: " + t1.isValid("happyCode"));
        System.out.println("T2: " + t2.isValid("Animal"));
        System.out.println("T2: " + t2.isValid("animal"));
        System.out.println("T2: " + t2.isValid("doggy"));
        System.out.println("T2: " + t2.isValid("crazycatAnimalgonewilderness"));
    }
}
