package Basics.Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> L=new LinkedList();
        L.add("mango");
        L.add("grape");
        L.add("Banana");
        L.add("Apple");
        System.out.println(L);
        L.set(0,"orange");
        System.out.println(L);
        L.removeLast();
        System.out.println(L);
        L.addFirst("Litchi");
        System.out.println(L);
    }
}
