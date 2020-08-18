package barkingdog;

public class Main {
    public static void main(String[] args) {
        shouldWakeUp(true,
            1);
        shouldWakeUp(true,
            55);
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