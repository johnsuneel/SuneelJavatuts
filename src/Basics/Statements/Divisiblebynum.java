package Basics.Statements;

import java.util.Scanner;

public class Divisiblebynum {
    Scanner sc=new Scanner(System.in);
    public void divisible(){
        //int x=26;
        System.out.println("Enter positive number");
        int x=sc.nextInt();
        if(x%2==0&&x%3==0)
            System.out.println(x+".....is divisible by both");
        else
            System.out.println(x+"....is not divisible by both");
    }
}
