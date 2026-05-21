package Basics.Exceptions;
interface Payment {
    void process(double amt);
}
class Card implements Payment {
    public void process(double amt) {
        System.out.println("Paid " + amt + " via Card");
    }
}
class UPI implements Payment {
    public void process(double amt) {
        System.out.println("Paid " + amt + " via UPI");
    }
}
public class PaymentProcessor {

    public Payment getPaymentMethod(String type) throws Exception {
        Payment p = null;

        if (type.equals("Card")) {
            p = new Card();
        }
        else if (type.equals("UPI")) {
            p = new UPI();
        }
        else {
            throw new Exception("Unsupported payment method: " + type);
        }
        return p;
    }
}