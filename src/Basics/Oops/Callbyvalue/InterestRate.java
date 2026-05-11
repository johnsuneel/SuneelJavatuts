package Basics.Oops.Callbyvalue;

public class InterestRate {
    public void updateRate(double rate) {
        rate = rate+ 2.0;
        System.out.println("Inside method: " + rate);
    }
}