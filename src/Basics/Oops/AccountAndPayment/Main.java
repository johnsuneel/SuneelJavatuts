package Basics.Oops.AccountAndPayment;
public class Main {
    public static void main(String[] args) {

        Account myAcc = new Savings(5000);
        myAcc.addInterest();
        System.out.println("New Balance: " + myAcc.balance);


//      Payment p = new UPI();
//      p.process(500);
//
//     Payment p1=new Card();
//    p1.process(2500);

        Payment p=null;
        String s="UPI";
        if(s.equals("Card")){
            p=new Card();
        }
        else if(s.equals("UPI")){
            p=new UPI();
        }
        else {
            System.out.println("Payment not initiated...");
        }

        p.process(500);
    }
}
