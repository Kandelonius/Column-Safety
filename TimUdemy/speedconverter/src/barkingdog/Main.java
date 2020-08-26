package barkingdog;

public class Main {
    public static void main(String[] args) {
        shouldWakeUp(true,
            1);
        shouldWakeUp(true,
            55);
        Cat cat = new Cat("jo", 2);
        Cat cat1 = new Cat("jo1", 2);
        Cat cat2 = new Cat("jo2", 2);
        Cat cat3 = new Cat("jos", 2);
        Cat cat4 = new Cat("jod", 2);
        Cat cat5 = new Cat("joz", 2);
        Cat cat6 = new Cat("joh", 2);
        Cat.getNumberOfCats();
    }

    public static boolean shouldWakeUp(
        boolean dogBarking,
        int hourOfDay) {
        if (hourOfDay < 0) {
            return false;
        } else if (dogBarking && (hourOfDay < 8 || (hourOfDay > 22 && hourOfDay < 24))) {
            return true;
        }
        return false;
    }
}