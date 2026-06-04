package Basics.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>(new MyComparator());
        //new MyComparator()
        t.add(10);
        t.add(5);
        t.add(24);
        t.add(26);
        t.add(0);

        System.out.println("Descending Order TreeSet: " + t);
    }
}
class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer I1, Integer I2) {
        return (I1 < I2) ? +1 : (I1 > I2) ? -1 : 0;
    }
}