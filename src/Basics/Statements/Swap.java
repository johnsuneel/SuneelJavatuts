package Basics.Statements;

public class Swap {
    int a = 24;
    int b = 26;

    public void swapNumbers() {
        int swap = a;
        a = b;
        b = swap;
        System.out.println("After swap 'a':"+a+",'b':"+b);
    }

}
