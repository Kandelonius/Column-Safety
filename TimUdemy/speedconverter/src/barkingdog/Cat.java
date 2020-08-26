package barkingdog;

class Cat {

    // write static and instance variables
    public String name;

    public int age;

    public static int COUNTER = 0;

    public Cat(
        String name,
        int age) {
        // implement the constructor
        // do not forget to check the number of cats
        this.name = name;
        this.age = age;
        COUNTER += 1;
        if (getNumberOfCats() > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return COUNTER;
    }
}