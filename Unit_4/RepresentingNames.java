
public class RepresentingNames {
    public static class Name{
        private String first,middle,last;
        public Name(String firstInput, String middleInput, String lastInput){
            first = firstInput;
            middle = middleInput;
            last = lastInput;
        }
        public String getFirst(){
            return first;
        }
        public String getMiddle(){
            return middle;
        }
        public String getLast(){
            return last;
        }
        public String firstMiddleLast(){
            return first + " " + middle + " " + last;
        }
        public String lastFirstMiddle(){
            return last + ", " + first + " " + middle;
        }
        public boolean equals(Name otherName){
            return otherName.getFirst().equalsIgnoreCase(first) && otherName.getMiddle().equalsIgnoreCase(middle) && otherName.getLast().equalsIgnoreCase(last);
        }
        public String initials(){
            return first.substring(0, 1).toUpperCase()+middle.substring(0, 1).toUpperCase()+last.substring(0, 1).toUpperCase();
        }
        public int length(){
            return firstMiddleLast().length() - 2;
        }
    }
    public static void main(String args[]){
        Name n1 = new Name("bob", "Ole", "barTone");
        Name n2 = new Name("Susie", "olivia", "Sanders");
        Name n3 = new Name("BOb", "ole", "BarTone");
        System.out.println("Lets try first name: " + n1.getFirst());
        System.out.println("Lets try middle name: " + n1.getMiddle());
        System.out.println("Lets try last name: " + n1.getLast());
        System.out.println("Lets try first firstmiddlelast: " + n2.firstMiddleLast());
        System.out.println("Lets try first lastfirstmiddle: " + n2.lastFirstMiddle());
        System.out.println("Lets try initials: " + n1.initials());
        System.out.println("Are they equal: " + n1.equals(n2));
        System.out.println("Are they equal: " + n1.equals(n3));
        System.out.println("how long is the string?: " + n2.length());
    }
}
