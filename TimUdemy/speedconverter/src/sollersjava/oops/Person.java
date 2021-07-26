package sollersjava.oops;

public class Person {

    // member variables
    // member methods

    String name;
    int id;
    int age;
    String city;
    char gender;

    public Person() {

    }

    public Person(String name, int id, int age, String city, char gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.city = city;
        this.gender = gender;
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("ZZZ");
    }

    public void walk() {
        System.out.println("Taking a walk");
    }

}
