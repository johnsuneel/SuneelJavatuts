package Basics.Exceptions;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        String Type = "UPI";
        double amount = 500.0;

        try {
            System.out.println("Initiating payment system...");

            Payment p = processor.getPaymentMethod(Type);
            p.process(amount);

        } catch (Exception e) {
            System.out.println("System Alert: " + e.getMessage());
        }

        System.out.println("System Status: Operational. Program shut down safely.");
    }
}