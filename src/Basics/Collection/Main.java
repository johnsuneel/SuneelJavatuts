package Basics.Collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        if (a==b){
            System.out.println("numbers are equal");
        }
        else {
            System.out.println("numbers are not equal");
        }

        Person p1=new Person(28,5.7);
        Person p2=new Person(28,5.8);
        if(p1==p2){
            System.out.println("p1 and p2 are equal");
        }
        else{
            System.out.println("p1 and p2 are not equal");
        }



        List<Person> list = new ArrayList<>();
        list.add(new Person(25, 5.8));
        Person visitor = new Person(25, 5.8);

        if (list.contains(visitor)) {
            System.out.println("Match Found");
        } else {
            System.out.println("No match found.");
        }
    }
}