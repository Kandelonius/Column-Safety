package sollersjava.oops;

public class PersonObj {
    public static void main(String[] args) {
        Person jessi = new Person();
        Person Ravi = new Person("Ravi", 2, 40, "Other Place", 'm');

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
