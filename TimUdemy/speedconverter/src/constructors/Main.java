package constructors;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println(ConstantsAndUtilities.A_CONSTANT_TTT);
        System.out.println(ConstantsAndUtilities.B_CONSTANT_QQQ);
        System.out.println(ConstantsAndUtilities.getMagicString());
        System.out.println(ConstantsAndUtilities.convertStringToAnotherString("aa"));
         */
        Account user1 = new Account(123,
            1337.69,
            "Guy Stephens",
            "Guy@gmail.com",
            "555-555-5555");
        Account user2 = new Account(333,
            77.53,
            "Covert Secret");
        Account dummyUser = new Account();
        Account janeDoe = new Account(101,
            150,
            "Jane Doe");
        Account johnDoe = new Account(102,
            150,
            "John Doe");
        Account marySmith = new Account(103,
            150,
            "Mary Smith");
        Account mikeWilson = new Account(104,
            150,
            "Mike Wilson");
        Account billKent = new Account(105,
            150,
            "Bill Kent");
        VIPCustomer fancyPants = new VIPCustomer("Joe Money",
            "cashdollars@money.com");

        SimpleHashtable ht = new SimpleHashtable();
        ht.put("Stephens",
            user1);
        ht.put("Secret",
            user2);
        ht.put("Doe",
            johnDoe);
        ht.put("Smith",
            marySmith);
        ht.put("Kent",
            billKent);
        ht.put("Wilson",
            mikeWilson);

        janeDoe.getEmail();
        user2.addFunds(100.33);
        user1.withdrawFunds(10_000);
        user1.addFunds(50.00);
        user1.withdrawFunds(75.00);
        dummyUser.getBalance();
        user1.getEmail();
        user2.getEmail();
        System.out.println(fancyPants.getCreditLimit());
//        ht.printHashtable();
        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
    }
}
