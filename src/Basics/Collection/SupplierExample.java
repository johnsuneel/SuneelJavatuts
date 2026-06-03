package Basics.Collection;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> randomIdGenerator = () -> Math.random() * 100;

        System.out.println("Generated ID 1: " + randomIdGenerator.get());
        System.out.println("Generated ID 2: " + randomIdGenerator.get());


        String dbResult = null;
        String finalValue = (dbResult != null) ? dbResult : supplyFallback();
        System.out.println("Active Value: " + finalValue);
    }

    public static String supplyFallback() {
        return "Default Guest User";
    }
}