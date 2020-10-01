package Unit_3;

public class PhoneNumber {
    public static void main(String args[]){
        int NewDigit;
        int FirstDigit = (int)(Math.random() * 10);
        String output = "Your randomly generated number is: " + (int)(1 + Math.random() * 9) + (int)(1 + Math.random() * 9) + (int)(1 + Math.random() * 9) + "-" + String.format("%03d",(int)(Math.random() * 743)) + "-" + FirstDigit;
        // Output length has to be less than 47 since the first phrase is 35 characters, and the number needs to be 12.
        // 35 + 12 = 47
        while (output.length() < 47){
            NewDigit = (int)(Math.random() * 10);
            if (NewDigit != FirstDigit){
                output += NewDigit;
            }
        }
        System.out.println(output);
    }
}
