package Unit_4.ProgrammingProjectsPart2;
import java.util.Arrays;

public class StudentInforProject {
    public static class Address{
        private String streetAddress, city, state;
        private int zipCode;
        //-----------------------------------------------------------------
        // Sets up this Address object with the specified data.
        //-----------------------------------------------------------------
        public Address (String street, String town, String st, int zip){
            streetAddress = street;
            city = town;
            state = st;
            zipCode = zip;
        }
        //-----------------------------------------------------------------
        // Returns this Address object as a string.
        //-----------------------------------------------------------------
        public String toString(){
            String result;
            result = streetAddress + "\n";
            result += city + ", " + state + " " + zipCode;
            return result;
        }
    }
    public static class Student{
        private String firstName, lastName;
        private Address homeAddress, schoolAddress;
        private int[] testScores = new int[3];
        //-----------------------------------------------------------------
        // Sets up this Student object with the specified initial values.
        //-----------------------------------------------------------------
        public Student (String first, String last, Address home,
        Address school){
            firstName = first;
            lastName = last;
            homeAddress = home;
            schoolAddress = school;
        }
        //-----------------------------------------------------------------
        // Returns this Student object as a string.
        //-----------------------------------------------------------------
        public String toString(){
            String result;
            result = firstName + " " + lastName + "\n";
            result += "Home Address:\n" + homeAddress + "\n";
            result += "School Address:\n" + schoolAddress + "\n";
            result +=  getTestScore(1)+ " "+getTestScore(2)+ " "+getTestScore(3)+ " Average: "+ average();
            return result;
        }
        public void setTestScore(int test_number,int score){
            testScores[test_number-1] = score;
        }
        public String getTestScore(int test_number){
            return "Score for test#"+test_number+": " +testScores[test_number-1];
        }
        // Get the average and reuturn it as a double.
        public double average(){
            return Arrays.stream(testScores).sum()/testScores.length;
        }
        // Return the student's name as a String.
        public String getName(){
            return firstName + " " + lastName;
        }
    }
    public static void main(String args[]){
        Address school = new Address ("800 Lancaster Ave.", "Villanova","PA", 19085);
        Address jHome = new Address ("21 Jump Street", "Lynchburg","VA", 24551);
        Student john = new Student ("John", "Gomez", jHome, school);
        Address mHome = new Address ("123 Main Street", "Euclid", "OH",44132);
        Student marsha = new Student ("Marsha", "Jones", mHome, school);
        marsha.setTestScore(1, 30);
        marsha.setTestScore(2, 32);
        marsha.setTestScore(3, 40);
        System.out.println("Testing out your getTestScore method: " + john.getTestScore(2));
        System.out.println (john);
        System.out.println ();
        System.out.println (marsha);
    }
}
