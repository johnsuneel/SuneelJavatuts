package Basics.Oops.CallByReference;

class Account {
    double balance;
    Account(double balance)
    { this.balance = balance; }
}

public class BankSystem {
    public void deposit(Account acc, double amount) {
        acc.balance = acc.balance + amount;
        System.out.println("Deposit successful inside method.");
    }
}