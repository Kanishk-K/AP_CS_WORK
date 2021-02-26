package Unit_7;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class ClimbingClubProject {
    public static class ClimbInfo {
        private String peak;
        private int time;
        public ClimbInfo(String p, int t){
            peak = p;
            time = t;
        }
        public String getName(){
            return peak;
        }
        public int getTime(){
            return time;
        }
        public String toString(){
            return peak + " "+time;
        }
    }
    public static class ClimbingClub {
        private List<ClimbInfo> climbList;
        public ClimbingClub(){
            climbList = new ArrayList<ClimbInfo>();
        }
        //This is yours to implement. See instructions for details!
        public void addClimb(String p, int t){
            climbList.add(new ClimbInfo(p,t));
        }
        //This is yours to implement. See instructions for details!
        public void addClimbAP(String p, int t){
            for (int i = 0;i<climbList.size();i++){
                if (p.compareToIgnoreCase(climbList.get(i).getName()) < 0){
                    climbList.add(i, new ClimbInfo(p, t));
                    return;
                }
            }
            climbList.add(new ClimbInfo(p, t));
        }
        //This is yours to implement. See instructions for details!
        public int distinctPeakNames(){
            /*
                A set is a data structure that does not store duplicates.
                Whenever a duplicate entry is entered it is discarded, if the
                entry doesn't exist then it will be added. 
            */
            Set<String> repeat = new HashSet<String>();
            for (int i = 0;i<climbList.size();i++){
                repeat.add(climbList.get(i).getName());
            }
            return repeat.size();
        }
        public void display(){
            System.out.println(climbList);
        }
    }
    public static void main(String[] args) {
        ClimbingClub hiker = new ClimbingClub();
        System.out.println("Number of unique names: "+hiker.distinctPeakNames());
        hiker.addClimb("Swen", 120);
        hiker.addClimb("Tanner", 110);
        hiker.addClimb("Zeek", 150);
        hiker.display();
        System.out.println("*************************\nfirst part works!");
        hiker.addClimbAP("Art", 121);
        hiker.addClimbAP("Tanner", 180);
        hiker.addClimbAP("Zulla", 90);
        hiker.display();
        System.out.println("Number of unique names: "+hiker.distinctPeakNames());
        System.out.println("*************************\nSecond part works!");
        ClimbingClub hiker2 = new ClimbingClub();
        hiker2.addClimbAP("Longmire", 92);
        hiker2.display();
        System.out.println("Number of unique names: "+hiker2.distinctPeakNames());
        System.out.println("*************************\nthird part works!");
    }
}
