package Basics.Collection;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Function;

public class FunctionExample {
    public static void processData(String input, Function<String, String> processor) {
        String result = processor.apply(input);
        System.out.println("Processed Result: " + result);
    }

    public static void main(String[] args) {
        System.out.println(". Passing a Function as an Argument ");
        String name = "sunil";

        processData(name, str -> str.toUpperCase());

        processData(name, String::toLowerCase);

        System.out.println(" Lambda Assignment ");
        Function<Integer, Integer> ageText = age -> age;
        int result = ageText.apply(25);
        System.out.println(result);

        System.out.println(" Remainder Calculation");
        int Num = 24;
        boolean isOdd = (Num % 2 != 0);
        System.out.println("is 24 odd: " + isOdd);

        System.out.println( "Method Reference Assignment ");
        Function<String, String> data = FunctionExample::bio;
        String s = data.apply("sunil");
        System.out.println(s);


    }
    public static String bio(String n) {
        return n;
    }
}