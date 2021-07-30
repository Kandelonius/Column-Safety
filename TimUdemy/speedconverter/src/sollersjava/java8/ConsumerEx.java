package sollersjava.java8;

import java.util.function.Consumer;

public class ConsumerEx implements Consumer {

    @Override
    public void accept(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        ConsumerEx e = new ConsumerEx();
        e.accept("hello");
        e.accept("hi");
    }
}
