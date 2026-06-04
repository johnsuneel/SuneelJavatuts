package Basics.Collection.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> emp= Arrays.asList(new Employee("sunil",24,10000.25),
                new Employee("raj",26,20000.26),
                new Employee("praveen",25,30000.24)
                );
        emp.stream()
                .map(e -> {e.setSalary(e.getSalary() + 2000);
                    return e;
                })
                .filter(e -> e.getSalary() < 25000)
                .forEach(e -> System.out.println(e));


        Map<Integer, Employee> mapemps = Map.of(
                1, new Employee("john", 28, 15000.24),
                2, new Employee("nag", 32, 25000.26),
                3,new Employee("mou",26,35000.34)
        );
        mapemps.forEach((k,v)-> System.out.println("keyId:"+k+"---->"+v) );

    }
}
