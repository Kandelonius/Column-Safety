package constructors;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println(ConstantsAndUtilities.A_CONSTANT_TTT);
        System.out.println(ConstantsAndUtilities.B_CONSTANT_QQQ);
        System.out.println(ConstantsAndUtilities.getMagicString());
        System.out.println(ConstantsAndUtilities.convertStringToAnotherString("aa"));
         */
        Account user1 = new Account(123, 1337.69, "Guy", "Guy@gmail.com", "555-555-5555");
        Account user2 = new Account(333, 77.53, "secret");
        VIPCustomer fancyPants = new VIPCustomer("Joe Money", "cashdollars@money.com");

        user2.addFunds(100.33);
        user1.withdrawFunds(10_000);
        user1.addFunds(50.00);
        user1.withdrawFunds(75.00);
        System.out.println(user1.getEmail());
        System.out.println(user2.getEmail());
        System.out.println(fancyPants.getCreditLimit());

    }
}
