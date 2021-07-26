package sollersjava.oops;

public class PersonObj {
    public static void main(String[] args) {
        Person jessi = new Person(1);
        Person Ravi = new Person("Ravi", 2, 40, "Other Place", 'm');

        jessi.name = "Jessi";
//        jessi.id = 1;
        jessi.age = 20;
        jessi.city = "Place";
        jessi.gender = 'f';

        jessi.eat();

        jessi.getName();
        jessi.sleep();
        jessi.walk();
    }
}
