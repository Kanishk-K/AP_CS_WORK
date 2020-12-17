package Unit_6.ProgrammingProjects1;
import java.text.NumberFormat;
public class BankProject {
    public static class Account{
        private NumberFormat fmt = NumberFormat.getCurrencyInstance();
        private final double RATE = 0.030;
        private int acctNumber;
        private double balance;
        private String name;
        public static int totalAccounts = 0;
        public Account (String owner, int account){
            name = owner;
            acctNumber = account;
            balance = 0;
            totalAccounts++;
        }
        public Account (String owner, int account, double initial){
            name = owner;
            acctNumber = account;
            balance = initial;
            totalAccounts++;
        }
        public double deposit (double amount){
            if (amount < 0){
                System.out.println ();
                System.out.println ("Error: Deposit amount is invalid.");
                System.out.println (acctNumber + " " + fmt.format(amount));
                return -1;
            }
            else{
                balance = balance + amount;
                return balance;
            }
        }
        public double withdraw (double amount, double fee){
            amount += fee;
            if (amount < 0){
                System.out.println ();
                System.out.println ("Error: Withdraw amount is invalid.");
                System.out.println ("Account: " + acctNumber);
                System.out.println ("Requested: " + fmt.format(amount));
                return -1;
            }
            else if (amount > balance){
                System.out.println ();
                System.out.println ("Error: Insufficient funds.");
                System.out.println ("Account: " + acctNumber);
                System.out.println ("Requested: " + fmt.format(amount));
                System.out.println ("Available: " + fmt.format(balance));
                return -1;
            }
            else{
                balance = balance - amount;
                return balance;
            }
        }
        public double addInterest (){
            balance += (balance * RATE);
            return balance;
        }
        public double getBalance (){
            return balance;
        }
        public int getAccountNumber (){
            return acctNumber;
        }
        public String toString (){
            return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
        }
        public void transferTo (Account Acc2, double value){
            if (value > 0 && balance > value){
                withdraw(value,0);
                Acc2.deposit(value);
            }
            else{
                System.out.println("This account does not have sufficient funds or the amount transfered is less than 0");
            }
        }
        public static void add3PercentAll(Account[] AccountInput){
            for (int i=0;i<Account.totalAccounts;i++){
                AccountInput[i].addInterest();
            }
        }
    }
    public static void main(String args[]){
        Account [] bank = new Account[50];
        bank[0] = new Account("Barb", 1, 233.55);
        bank[1] = new Account("Leroy", 2, 34.05);
        bank[2] = new Account("Hellan", 3, 1200.55);
        bank[3] = new Account("Dorothy", 4, 10000.75);
        bank[4] = new Account("Deloris", 5, 999.99);
        Account.add3PercentAll(bank);
        for(int x = 0; x < Account.totalAccounts;++x){
            System.out.println(bank[x]);
            System.out.println();
        }
    }
}
