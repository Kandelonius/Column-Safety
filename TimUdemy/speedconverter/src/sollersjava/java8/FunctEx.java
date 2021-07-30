package sollersjava.java8;

import java.util.function.Function;

public class FunctEx implements Function<String, String> {
    public static void main(String[] args) {
        FunctEx fe = new FunctEx();
        String data = fe.apply("Java");
        System.out.println(data);
    }
    @Override
    public String apply(String s) {
        return s;
    }
}
