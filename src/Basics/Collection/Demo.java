package Basics.Collection;

import java.util.Objects;

class Person {
    int age;
    double height;

    Person(int age, double height) {
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(height, person.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height);
    }
}


