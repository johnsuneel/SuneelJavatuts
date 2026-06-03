package Basics.Collection;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void processData(String input1, String input2, BiFunction<String, String, String> processor) {
        String result = processor.apply(input1, input2);
        System.out.println("Processed Result: " + result);
    }

    public static void main(String[] args) {
        System.out.println(" 1. Passing a BiFunction as an Argument");
        String firstName = "Suneel";
        String location = "Bengaluru";

        processData(firstName, location, (name, loc) -> name  + loc);
        processData(firstName, location, (name, loc) -> name.toUpperCase());

        System.out.println(" 2. BiFunction Lambda Assignment ");
        BiFunction<Integer, Integer, Integer> addAges = (age1, age2) -> age1 + age2;
        int totalAge = addAges.apply(25, 28);
        System.out.println("Total combined age: " + totalAge);

        System.out.println(" 3. BiFunction Method Reference ");
        BiFunction<String, String, String> data = BiFunctionExample::bio;
        String profile = data.apply("Suneel", " Java");
        System.out.println(profile);
    }
    public static String bio(String n, String dept) {
        return "Name: " + n + " | Domine: " + dept;
    }
}