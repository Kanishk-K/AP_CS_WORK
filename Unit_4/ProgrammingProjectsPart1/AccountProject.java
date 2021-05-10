import java.text.NumberFormat;

public class AccountProject {
    public static class Account{
        private NumberFormat fmt = NumberFormat.getCurrencyInstance();
        private final double RATE = 0.035;
        private int acctNumber;
        private double balance;
        private String name;
        public Account (String owner, int account){
            name = owner;
            acctNumber = account;
            balance = 0;
        }
        public Account (String owner, int account, double initial){
            name = owner;
            acctNumber = account;
            balance = initial;
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
    }
    public static void main(String args[]){
        Account acct1 = new Account ("Ted Murphy", 72354);
        Account acct2 = new Account ("Anita Gomez", 69713, 40.00);
        Account acct3 = new Account ("Sanchit Reddy", 93757, 759.32);
        acct1.deposit (129.05);
        double gomezBalance = acct2.deposit (500.00);
        System.out.println ("Gomez balance after deposit: " +
        gomezBalance);
        System.out.println ("Gomez balance after withdrawal: " +
        acct2.withdraw (430.75, 1.50));
        acct3.withdraw (800.00, 0.0);
        acct3.addInterest();
        System.out.println ();
        System.out.println("In Acct 1: "+ acct1);
        System.out.println("In Acct 2: "+ acct2);
        acct1.transferTo(acct2, 50);
        System.out.println("After the $50 transfer");
        System.out.println("In Acct 1: "+ acct1);
        System.out.println("In Acct 2: "+ acct2);
        acct1.transferTo(acct2, 100);
        System.out.println("In Acct 1: "+ acct1);
        System.out.println("In Acct 2: "+ acct2);
        System.out.println (acct1.toString());
        System.out.println (acct2);
        System.out.println (acct3);
    }
}
