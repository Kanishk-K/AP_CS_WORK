/*
 █████╗ ████████╗████████╗███████╗███╗   ██╗████████╗██╗ ██████╗ ███╗   ██╗
██╔══██╗╚══██╔══╝╚══██╔══╝██╔════╝████╗  ██║╚══██╔══╝██║██╔═══██╗████╗  ██║
███████║   ██║      ██║   █████╗  ██╔██╗ ██║   ██║   ██║██║   ██║██╔██╗ ██║
██╔══██║   ██║      ██║   ██╔══╝  ██║╚██╗██║   ██║   ██║██║   ██║██║╚██╗██║
██║  ██║   ██║      ██║   ███████╗██║ ╚████║   ██║   ██║╚██████╔╝██║ ╚████║
╚═╝  ╚═╝   ╚═╝      ╚═╝   ╚══════╝╚═╝  ╚═══╝   ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝

- So it seems that this repository for classwork has gotten a lot more attention than I anticipated.

- There are more people accessing my code than I've given access to meaning that it's being shared around.

- I'm fine with this just let me know that you're sharing it with someone so I can keep track to how big this is.

- Also if you do plan on using any code from here at least make some changes in variable names/method names(when applicable)
or logic for pretty obvious reasons.

*/
package Unit_5;
public class CustomerProject {
    public static class Customer{
        private static int nextAccNum = 1;
        private String Name;
        private int AccountNumber;
        public Customer(String InputName){
            AccountNumber = nextAccNum;
            Name = InputName;
            nextAccNum += 1;
        }
        public String billNote(double payment){
            return Name + ", account number " + AccountNumber + ", please pay $" + payment;
        }
        public static int getNextAccNum(){
            return nextAccNum;
        }
        public void updateName(String InputName){
            Name = InputName;
        }
    }
    public static void main(String[] args) {
        Customer c1 = new Customer("Frank");
        Customer c2 = new Customer("Suesie");
        System.out.println(Customer.getNextAccNum());
        Customer c3 = new Customer("Gus");
        System.out.println(Customer.getNextAccNum());
        System.out.println(c3.billNote(1.88));
        c3.updateName("GusIV");
        System.out.println(c1.billNote(10.25));
        System.out.println(c2.billNote(7.19));
        System.out.println(c3.billNote(.33));
        System.out.println(Customer.getNextAccNum());
    }
}
