import java.util.ArrayList;
public class UserNameProject {
    public static class UserName {
        private ArrayList<String> possibleNames;
        public UserName(String firstName, String lastName)
        {
            possibleNames = new ArrayList<String>();
            for (int i = 1;i<=firstName.length();i++){
                possibleNames.add(lastName + firstName.substring(0, i));
            }
        }
        public boolean isUsed(String name, String[] arr){
            for(int x = 0; x < arr.length; ++x){
                if(name.equalsIgnoreCase(arr[x])){
                    return true;
                }
            }
            return false;
        }
        public void setAvailableUserNames(String[] usedNames){
            for (int i=0;i<possibleNames.size();i++){
                if (isUsed(possibleNames.get(i), usedNames)){
                    possibleNames.remove(i);
                    i--;
                }
            }
        }
        public String toString(){
        String holder = "";
            for(int x = 0; x < possibleNames.size()-1;++x){
                holder += possibleNames.get(x)+ ", ";
                holder += possibleNames.get(possibleNames.size()-1);
            }
            return holder;
        }
    }
    public static void main(String[] args) {
        String [] words1 = {"voglef", "voglefr", "vogleky", "voglefran","vogley"};
        String [] words2 = {"harta", "hartm", "harty"};
        UserName person1 = new UserName("franky", "vogle");
        UserName person2 = new UserName("mary", "hart");
        //Checking to see if your constructor works.....
        System.out.println(person1);
        System.out.println(person2);
        //Now after setAvailableUserNames was implemented
        person1.setAvailableUserNames(words1);
        person2.setAvailableUserNames(words2);
        System.out.println("\n\nAfter setAvailalbe..... was implemented");
        System.out.println(person1);
        System.out.println(person2);
    }
}
