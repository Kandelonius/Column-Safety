package sollersjava.exceptions;

public class Main {
    public static void main(String[] args) {
        int age = 13;
        int[] a = {44, 30, 60, 26};
        try {
            System.out.println(a[0]);
            System.out.println(a[2]);
            System.out.println(a[6]);
            System.out.println(a[1]);
        }catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(a[3]);

        if(age >= 18) {
            throw new ArithmeticException("not valid");
        } else {
            System.out.println("valid");
        }
    }
}
