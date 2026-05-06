package Basics.examples;

import javax.lang.model.util.AbstractElementVisitor14;

public class Demo {
    public static void main(String[] args) {

        Operations calc=new Operations();
//        System.out.println("ArithmeticOperations");
//        System.out.println("* * * * *");
//
//        System.out.println("Addition of two numbers is:"+ (calc.num1+ calc.num2));
//        System.out.println("Subtraction of two numbers is:"+(calc.num1- calc.num2));
//        System.out.println("Multiplication of two numbers is:"+(calc.num1*calc.num2));
//        System.out.println("Division of two numbers is:"+(calc.num2!=0?(calc.num1/ calc.num2):("Undefined(Divided by zero)")));
//        System.out.println("Mod of two numbers is:"+(calc.num2!=0?(calc.num1% calc.num2):("Undefined(mod of zero)")));

//        System.out.println("RelationalOperations");
//        System.out.println("* * * * *");
//        System.out.println("A1>A2:"+(calc.A1>calc.A2));
//        System.out.println("A1<A2:"+(calc.A1< calc.A2));
//        System.out.println("A1>=A2:"+(calc.A1>= calc.A2));
//        System.out.println("A1!=A2"+(calc.A1!= calc.A2));

//        System.out.println("logicalOperations");
//      System.out.println("* * * * *");
//        System.out.println("A1&&A2:"+(calc.A1 && calc.A2));
//        System.out.println("A1||A2:"+(calc.A1|| calc.A2));
//        System.out.println("!A1:"+ (!calc.A1));
//        System.out.println("!A2:"+(!calc.A2));

//        System.out.println("BitwiseOperations");
//     System.out.println("* * * * *");
//
//        System.out.println("x & y:"+(calc.x & calc.y));  //0100 & 0110 = 0100 (4)
//        System.out.println("x | y:"+(calc.x | calc.y));   //0100 | 0110 = 0110 (6)
//        System.out.println("x ^ y:"+ (calc.x ^ calc.y));  //0100 ^ 0110 = 0010 (2)
//        System.out.println("x ~ y:"+(~calc.y));           //-(y+1) (-7)


        System.out.println("Ternary Operators");
        System.out.println("* * * * *");

        int res= (calc.a)>(calc.b)? calc.a : calc.b;
        System.out.println("Greater num:"+res);

        String eq=(calc.a)==(calc.b)?"numbers are Equal":"numbers are not equal";
        System.out.println(eq);
    }
}
