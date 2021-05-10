
public class HospitalEmployeesProject {
    public static class Hospital {
        private String fName;
        private String lName;
        public Hospital(String f, String l){
            fName = f;
            lName = l;
        }
        //returns the first name as a String
        public String getFName(){
            return fName;
        }
        //Returns the last name as a String
        public String getLName(){
            return lName;
        }
    }
    public static class Employee extends Hospital{
        private int number;
        public Employee(String f, String l, int number){
            super(f,l);
            this.number = number;
        }
    }
    public static class Patient extends Hospital{
        private String diagnosis;
        public Patient(String f, String l, String diagnosis){
            super(f,l);
            this.diagnosis = diagnosis;
        }
    }
    public static class Doctor extends Employee{
        public Doctor(String f,String l,int number){
            super(f,l,number);
        }
        public String performCheckup(){
            return getFName() + " " + getLName() + " is diagnosing some patients!";
        }
    }
    public static class Nurse extends Employee{
        public Nurse(String f,String l, int number){
            super(f,l,number);
        }
        public String performMedicine(){
            return getFName() + " " + getLName() + " is handing out medicine!";
        }
    }
    public static class Administrator extends Employee{
        public Administrator(String f,String l, int number){
            super(f,l,number);
        }
        public String performManagement(){
            return getFName() + " " + getLName() + " is managing things!";
        }
    }
    public static class Surgeon extends Doctor{
        public Surgeon(String f,String l,int number){
            super(f,l,number);
        }
        public String performSurgery(){
            return getFName() + " " + getLName() + " is doing some surgery!";
        }
    }
    public static class Receptionist extends Administrator{
        public Receptionist(String f,String l, int number){
            super(f,l,number);
        }
        public String performReception(){
            return getFName() + " " + getLName() + " is helping some patients!";
        }
    }
    public static class Janitor extends Administrator{
        public Janitor(String f,String l, int number){
            super(f,l,number);
        }
        public String performSurgery(){
            return getFName() + " " + getLName() + " is cleaning the Hospital!";
        }
    }
    public static class Admitted extends Patient{
        public Admitted(String f, String l, String diagnosis){
            super(f,l,diagnosis);
        }
        public String identify(){
            return getFName() +  " " + getLName() + " is currently suffering from " + super.diagnosis + ".";
        }
    }
    public static class Discharged extends Patient{
        public Discharged(String f, String l, String diagnosis){
            super(f,l,diagnosis);
        }
        public String identify(){
            return getFName() +  " " + getLName() + " was suffering from " + super.diagnosis + ".";
        }
    }
    /*
        While I could just manually give these people names,
        wouldn't that be boring? Let's make it wacky by
        generating some really weird randomized names.
        Hey, we just needed a functioning hospital, not a
        conventional one.
    */
    public static String randomString(){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //Random name must be between 1 to 10 characters.
        char[] name = new char[(int)((Math.random()*10) + 1)];
        for (int i = 0;i<name.length;i++){
            name[i] = alphabet.charAt((int)(Math.random()*alphabet.length()));
        }
        return new String(name);
    }
    public static void main(String args[]){
        System.out.println(new Doctor(randomString(),randomString(),1).performCheckup());
        System.out.println(new Nurse(randomString(),randomString(),2).performMedicine());
        System.out.println(new Administrator(randomString(),randomString(),3).performManagement());
        System.out.println(new Surgeon(randomString(),randomString(),4).performSurgery());
        System.out.println(new Receptionist(randomString(),randomString(),5).performReception());
        System.out.println(new Janitor(randomString(),randomString(),6).performSurgery());
        System.out.println(new Admitted(randomString(),randomString(),"being weird").identify());
        System.out.println(new Discharged(randomString(),randomString(),"lack of creativity").identify());
    }
}
