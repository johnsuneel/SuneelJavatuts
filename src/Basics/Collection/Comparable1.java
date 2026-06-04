package Basics.Collection;

import java.util.TreeSet;

public class Comparable1 {
    public static void main(String[] args) {
       // System.out.println("A".compareTo(null));
        System.out.println("A".compareTo("c"));
        System.out.println("k".compareTo("A"));
        System.out.println("c".compareTo("c"));


        //if we depending on natural sorting order adding objects into Treeset

        TreeSet t= new TreeSet();
        t.add("s");
        t.add("u");    //u.compareTo(s)  ->+ve  ans:after s
        t.add("n");   //n.compareTo(s)   ->-ve  ans: before s
        t.add("i");
        t.add("l");
        System.out.println(t);
    }
}
