package sollersjava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<Integer,Integer> m = new HashMap<>();

        m.put(1,1);
        m.put(2,1);
        m.put(3,5);

        m.entrySet().forEach(value -> {
            System.out.println(value.getKey() + " " + value.getValue());
        });

        Iterator it = m.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println("using iterator " + it.next());
        }

        Map<Integer, String> mixed = new HashMap<>();

        mixed.put(1, "hello");
        mixed.put(2, Integer.toString(1));

        mixed.forEach((key, value1) -> System.out.println("the value is " + value1));
    }
}
