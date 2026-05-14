package Basics.Oops.AccountAndPayment;

interface Payment {
    void process(double amt);
}

 class UPI implements Payment {
    public void process(double amt)
    {
        System.out.println("Paid " + amt + " via UPI");
    }
}

class Card implements Payment {
    public void process(double amt)
    {
        System.out.println("Paid " + amt + " via Card");
    }
}
