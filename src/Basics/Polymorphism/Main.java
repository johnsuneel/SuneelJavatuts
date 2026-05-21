package Basics.Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Vehicle v1=new Vehicle();
//        v1.horn("BMW");
//        Vehicle v2=new Car();
//        v2.horn("Benz");
//        Vehicle v3=new Bike();
//        v3.horn("RE");


        Vehicle v=null;
        String s="";
        if(s.equals("Car")){
            v=new Car();
        }
        else if(s.equals("Bike")){
            v=new Bike();
        }
        else {
            v=new Vehicle();
        }
        v.horn("peep");

    }
}
