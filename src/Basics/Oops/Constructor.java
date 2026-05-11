package Basics.Oops;

public class Constructor {
    public Constructor (){
        this(10);
        System.out.println("No-arg Constructor");
    }
    public Constructor(int i){
        this(10.5);
        System.out.println("Int-arg Constructor");
    }
    public Constructor(double d){
        System.out.println("double-arg Constructor");
    }
}
