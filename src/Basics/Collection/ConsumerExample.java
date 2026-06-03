package Basics.Collection;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> alertSystem = message -> System.out.println("ALERT: " + message);
        alertSystem.accept("Database connection lost!");
        List<String> tasks = List.of("Task 1", "Task 2", "Task 3");
        tasks.forEach(task -> System.out.println("Processing " + task));
    }
}