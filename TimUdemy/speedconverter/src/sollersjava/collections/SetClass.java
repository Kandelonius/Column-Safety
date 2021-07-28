package sollersjava.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(15);
        s.add(5);
        s.add(12);

        System.out.println("Set is " + s);

        Set<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(15);
        ts.add(5);
        ts.add(12);

        System.out.println("Tree set is " + ts);

        Set<String> hs = new HashSet<>();

        hs.add("hi");
        hs.add("hello");
        hs.add("greetings");
        hs.add("good day");

        System.out.println("hash set is " + hs);
    }
}
