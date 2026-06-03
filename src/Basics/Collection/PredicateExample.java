package Basics.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isAllowedOnRide = age -> age >= 12;

        System.out.println("Can a 9-year-old ride? " + isAllowedOnRide.test(9));
        System.out.println("Can a 15-year-old ride? " + isAllowedOnRide.test(15));

        List<Integer> queueAges = new ArrayList<>(List.of(10, 14, 8, 19, 11));

        queueAges.removeIf(age -> age < 12);

        System.out.println("Approved riders in queue: " + queueAges);
    }
}