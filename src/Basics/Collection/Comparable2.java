package Basics.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {
        return name + "(" + rollNo + ")";
    }
}

public class Comparable2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(List.of(
                new Student("Sunil", 103),
                new Student("Raj", 101),
                new Student("Ram", 102)
        ));
        Collections.sort(list);
        System.out.println("Sorted by Roll Number: " + list);
    }
}
