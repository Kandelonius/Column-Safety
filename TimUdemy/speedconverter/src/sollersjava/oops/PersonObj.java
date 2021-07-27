package sollersjava.oops;

public class PersonObj {
    static {
        System.out.println("I'm outside of main!");
        Person carl = new Person("Carl", 3, 42, "New Place", 'H');
        System.out.println(carl.toString());
    }
    public static void main(String[] args) {
        Person jessi = new Person();
        Person Ravi = new Person("Ravi", 2, 40, "Other Place", 'M');

        jessi.setName("Jessi");
        jessi.setId(1);
        jessi.setAge(20);
        jessi.setCity("Place");
        jessi.setGender('f');

        jessi.eat();

        jessi.getName();
        jessi.sleep();
        jessi.walk();
    }
}
