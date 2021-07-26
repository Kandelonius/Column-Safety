package sollersjava.oops;

public class Person {

    // member variables
    // member methods

    // static block
    static {
        System.out.println("I'm static");
    }
    // instance block
    {
        System.out.println("I'm an instance block");
    }

    private String name;
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

    public String getName() {
        if (this.name != null) {
            System.out.println("Name is " + name);
            return this.name;
        } else {
            System.out.println("I wish to remain anonymous");
            return "No Name";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
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
