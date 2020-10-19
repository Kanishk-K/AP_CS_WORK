package Unit_3;
import java.util.Scanner;

public class Base10 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String repeat = "",response="";
        int InitialBase = 0,NewBase = 10;
        while (!repeat.equalsIgnoreCase("y")){
            System.out.println("Please insert your base 10 number that you want converted.");
            InitialBase = scan.nextInt();
            System.out.println("What base do you want it converted to?");
            NewBase = scan.nextInt();
            while(InitialBase!= 0){
                if (NewBase > 10){
                    if (InitialBase%NewBase > 10){
                        response += (char)('A'+(InitialBase%NewBase - 10));
                        InitialBase = InitialBase/NewBase;
                    }
                    else{
                        response += (InitialBase%NewBase);
                        InitialBase = InitialBase/NewBase;
                    }
                }
                else{
                    response += (InitialBase%NewBase);
                    InitialBase = InitialBase/NewBase;
                }
            }
            System.out.print("Your converted number in base "+NewBase+" is ");
            for(int i = response.toCharArray().length - 1 ;i >= 0; i--){
                System.out.print(response.toCharArray()[i]);
            }
            response = "";
            System.out.println("\nType \"y\" if you want to exit.");
            scan.nextLine();
            repeat = scan.nextLine();
        }
        scan.close();
    }
}
