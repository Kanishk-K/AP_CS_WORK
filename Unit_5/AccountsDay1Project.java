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
public class AccountsDay1Project {
    public static class Account {
        // Swanson's Variables
        private double balance;
        private String name;
        private int accountNumber;
        // My Variables 
            /* 
            This is a static variable, this means that it is shared among all objects of this class.
            This variable will point to the same area in storage, so if a number 3 is there all three objects
            will point to that number 3.
            */
        private static int NumberOfAccounts = 0,NumDeposits = 0,NumWithdrawals = 0,TotalDeposited = 0,TotalWithdrawn = 0;
        //----------------------------------------------
        //Constructor -- initializes balance, owner, and account number
        //----------------------------------------------
        public Account(double initBal, String owner, int num){
            balance = initBal;
            name = owner;
            accountNumber = num;
            NumberOfAccounts += 1;
        }
        //----------------------------------------------
        // Checks to see if balance is sufficient for withdrawal.
        // If so, decrements balance by amount; if not, prints message.
        //----------------------------------------------
        public void withdraw(double amount){
            if (balance >= amount){
                balance -= amount;
                NumWithdrawals += 1;
                TotalWithdrawn += amount;
            }
            else{
                System.out.println("Insufficient funds");
            }
        }
        //----------------------------------------------
        // Adds deposit amount to balance.
        //----------------------------------------------
        public void deposit(double amount){
            balance += amount;
            NumDeposits += 1;
            TotalDeposited += amount;
        }
        //----------------------------------------------
        // Returns balance.
        //----------------------------------------------
        public double getBalance(){
            return balance;
        }
        //----------------------------------------------
        // Returns a string containing the name and balance.
        //----------------------------------------------
        public String toString(){
            // This line returns a name concantenated with the amount of money within the account.
            return name+"'s account has "+balance+" dollars.";
        }
        public String getName(){
            // this returns the name of this account.
            return name;
        }
        public int getAccountNumber(){
            // This reutrns the account number of the account.
            return accountNumber;
        }
        public static int getNumAccounts(){
            return NumberOfAccounts;
        }
        public void close(){
            name += " CLOSED";
            balance = 0;
            NumberOfAccounts -= 1;
        }
        public static Account consolidate(Account acc1, Account acc2){
            /*
            This checks if the user has the same name (not-casesensitive) between accounts and
            that the accounts don't have the same number.
            */
            if (acc1.getName().equals(acc2.getName()) && acc1.getAccountNumber() != acc2.getAccountNumber()){
                double acc1Bal = acc1.getBalance();
                double acc2Bal = acc2.getBalance();
                String acc1Name = acc1.getName();
                int acc1Number = acc1.getAccountNumber();
                acc1.close();
                acc2.close();
                return new Account(acc1Bal+acc2Bal,acc1Name,acc1Number);
            }
            else{
                /*
                This will return a message and return a null, a better method would be to do:
                throw new IllegalArguementException("This action was forbidden") since it would be more succinct.
                */
                System.out.println("This action was forbidden.");
                return null;
            }
        }
        public static int getNumDeposits(){
            return NumDeposits;
        }
        public static int getNumWithdrawals(){
            return NumWithdrawals;
        }
        public static double getDepositTotal(){
            return TotalDeposited;
        }
        public static double getWithdrawalTotal(){
            return TotalWithdrawn;
        }
    }
    public static void main(String[] args) {
        Account bill = new Account(100, "Bill", 1);
        Account bob = new Account (50, "Bob", 2);
        Account betsy = new Account (150, "Betsy", 3);
        Account barbra = new Account (200, "Barbra", 4);
        Account bill2 = new Account(20, "Bill", 5);
        Account nbill;
        System.out.println("Current number of accounts open: "+Account.getNumAccounts() );
        nbill = Account.consolidate(bill, bill);
        nbill = Account.consolidate(bob, bill2);
        System.out.println(nbill);
        nbill = Account.consolidate(bill, bill2);
        System.out.println(nbill);
        System.out.println("Current number of accounts open: "+Account.getNumAccounts() );
        System.out.println(bill2);
        betsy.deposit(13.25);
        barbra.withdraw(16.30);
        nbill.deposit(2000.45);
        bob.withdraw(75.6);
        bob.withdraw(49.75);
        System.out.println("Dailey bank deposit transactions:"+Account.getNumDeposits());
        System.out.println("Dailey bank amount deposit totals: "+Account.getDepositTotal());
        System.out.println("Dailey bank withdrawal transactions:"+Account.getNumWithdrawals());
        System.out.println("Dailey bank amount withdrawal totals: "+
        Account.getWithdrawalTotal());
        System.out.println(bob);
    }
}
