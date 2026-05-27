package Basics.Collection;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> L = new ArrayList<>();
        L.add("john");
        L.add("sunil");
        L.add("1");
        System.out.println(L);
        L.remove(0);
        System.out.println(L);
        L.add(1,"suneel");
        System.out.println(L);

    }
}

