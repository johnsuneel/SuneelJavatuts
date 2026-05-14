package Basics.Oops.AccountAndPayment;

public class Account {
    double balance;
    Account(double bal)
    {
        this.balance = bal;
    }
    public void addInterest()
    {
        double interestAmount = balance * 0.02;
        balance = balance + interestAmount;
    }
}
class Savings extends Account {
    Savings(double bal)
    {
        super(bal);
    }
   public void addInterest()
    {
        double interestAmount = balance * 0.05;
        balance = balance + interestAmount;
    }
}
