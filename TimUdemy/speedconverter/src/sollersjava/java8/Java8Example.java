package sollersjava.java8;

import sollersjava.oops.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Example {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Java", "Hello", "Parse");
        // non-stream way
//        for (String s : li) {
//            System.out.println(s);
//        }
        li.stream().forEach(s -> {
            System.out.printf(s);
        });

        li.stream().sorted().forEach(s -> System.out.println(s));
        List<String> li2 = li.stream().filter(x -> x.startsWith("p")).collect(Collectors.toList());
        li.stream().filter(y -> y.startsWith("p"))
                .map(y -> y.charAt(4)).collect(Collectors.toList())
                .forEach(s -> System.out.println(s));

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "java");
        myMap.put(2, "python");
        myMap.put(3, "C#");

        myMap.entrySet().stream().forEach(value -> {
            System.out.println(value.getKey());
        });

        myMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(s -> {
            System.out.println(s.getKey() + "-" + s.getValue());
        });
    }
}
