package Basics.Oops.Callbyvalue;

public class Main {
    public static void main(String[] args) {
        InterestRate obj = new InterestRate();
        double currentRate = 5.0;

        obj.updateRate(currentRate);
        System.out.println(" method call: " + currentRate);
    }
}

