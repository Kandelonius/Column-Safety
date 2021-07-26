package sollersjava.oops;

public class Person {

    // member variables
    // member methods

    static {
        System.out.println("I'm static");
    }
    {
        System.out.println("I'm an instance block");
    }

    String name;
    final int id;
    int age;
    String city;
    char gender;

    public Person(int id) {
        this.id = id;
    }

    public Person(String name, int id, int age, String city, char gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.city = city;
        this.gender = gender;
    }

    public String getName() {
        if (this.name != null) {
            System.out.println("Name is " + name);
            return this.name;
        } else {
            System.out.println("I wish to remain anonymous");
            return "No Name";
        }
    }

    public void eat() {
        if (this.name != null) {
            System.out.println(name + " is eating");
        } else
            System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("ZZZ");
    }

    public void walk() {
        System.out.println("Taking a walk");
    }

}
