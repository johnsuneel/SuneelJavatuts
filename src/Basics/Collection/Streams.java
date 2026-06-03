package Basics.Collection;

import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> names = List.of("sunil", "john", "java", "spring");
        names.stream()
                .filter(name -> name.startsWith("s"))
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));

        System.out.println(" remains list: " + names);
    }
}