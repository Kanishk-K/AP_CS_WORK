package Unit_7.ProgrammmingProjectsPart1;

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
    public static class Doctor extends Hospital{
        public Doctor(String f,String l){
            super(f,l);
        }
        public String performCheckup(){
            return getFName() + " " + getLName() + " is diagnosing some patients!";
        }
    }
    public static class Nurse extends Hospital{
        public Nurse(String f,String l){
            super(f,l);
        }
        public String performMedicine(){
            return getFName() + " " + getLName() + " is handing out medicine!";
        }
    }
    public static class Administrator extends Hospital{
        public Administrator(String f,String l){
            super(f,l);
        }
        public String performManagement(){
            return getFName() + " " + getLName() + " is managing things!";
        }
    }
    public static class Surgeon extends Hospital{
        public Surgeon(String f,String l){
            super(f,l);
        }
        public String performSurgery(){
            return getFName() + " " + getLName() + " is doing some surgery!";
        }
    }
    public static class Receptionist extends Hospital{
        public Receptionist(String f,String l){
            super(f,l);
        }
        public String performReception(){
            return getFName() + " " + getLName() + " is helping some patients!";
        }
    }
    public static class Janitor extends Hospital{
        public Janitor(String f,String l){
            super(f,l);
        }
        public String performSurgery(){
            return getFName() + " " + getLName() + " is cleaning the Hospital!";
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
        System.out.println(new Doctor(randomString(),randomString()).performCheckup());
        System.out.println(new Nurse(randomString(),randomString()).performMedicine());
        System.out.println(new Administrator(randomString(),randomString()).performManagement());
        System.out.println(new Surgeon(randomString(),randomString()).performSurgery());
        System.out.println(new Receptionist(randomString(),randomString()).performReception());
        System.out.println(new Janitor(randomString(),randomString()).performSurgery());
    }
}
