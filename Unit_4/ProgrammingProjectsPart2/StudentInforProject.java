package Unit_4.ProgrammingProjectsPart2;
import java.util.Scanner;
import java.util.Arrays;

public class StudentInforProject {
    public class Address{
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
            result += "School Address:\n" + schoolAddress;
            return result;
        }
    }
    public static void main(String args[]){
        
    }
}
