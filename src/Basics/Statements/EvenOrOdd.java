package Basics.Statements;

import java.util.Scanner;

public class EvenOrOdd {
    Scanner sc=new Scanner(System.in);
     public void compare(){
         System.out.println("Enter  positive number");
         int x =sc.nextInt();
        if (x % 2 == 0)
            System.out.println(x + ":is even number");
        else
            System.out.println(x + ":is odd number");

     }
}
