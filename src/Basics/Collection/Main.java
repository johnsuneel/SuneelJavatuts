package Basics.Collection;

import java.util.*;

public class Main {
    public static <Student> void main(String[] args) {
        int a=20;
        int b=30;
        if (a==b){
            System.out.println("numbers are equal");
        }
        else {
            System.out.println("numbers are not equal");
        }

        Person visitor1 = new Person(25, 5.8);
        Person visitor2= new Person(22, 5.10);

        if (visitor1.equals(visitor2)) {
            System.out.println("Match Found");
        } else {
            System.out.println("No match found.");
        }

        Set <Person> profile= new HashSet<>();
        profile.add(visitor1);
        profile.add(visitor2);
        System.out.println("Set profile size:"+profile.size());

        Map<Person,Integer> Bio= new HashMap<>();
        Bio.put(visitor1,24);
        Bio.put(visitor2,26);
        System.out.println("Map Bio size:"+Bio.size());



    }
}


