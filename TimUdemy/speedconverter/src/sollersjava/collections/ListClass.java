package sollersjava.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        // generics
        List li = new ArrayList(); // this is not type safe
        li.add(1);
        li.add(2);
        li.add(55);
        li.add("not an int");

        int b = Integer.parseInt(li.get(0).toString());
        a[0] = (int) li.get(2);

        List<Integer> intList = new ArrayList<>(); // this is type safe
        intList.add(11);
        intList.add(22);
        intList.add(33);
//        intList.add("not an int as well"); // this is not allowed

        a[1] = intList.get(0);
        System.out.println(intList.size());
        System.out.println(intList.get(0));
        intList.forEach(System.out::println);
        Iterator iter = intList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
