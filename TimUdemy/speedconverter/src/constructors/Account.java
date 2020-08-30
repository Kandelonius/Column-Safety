package constructors;

/*
    an account class that has some fields and multiple constructors for different types of
    customers.
 */

class Account {
    private int number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // default constructor with dummy values.
    public Account() {
        this(111, 150.00, "John Doe", "default email", "No Phone");
    }

    // general constructor
    public Account(
        int number,
        double balance,
        String customerName,
        String email,
        String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // paranoid off the grid man constructor with no email of phone number.
    public Account(
        int number,
        double balance,
        String customerName) {
        // gives default values for unused fields. This is not needed just prevents returning
        // null if these values are ever called.
        this(number, balance, customerName,"default email", "No Phone");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addFunds(double amount) {
        this.balance += amount;
        System.out.println("Added funds, new balance is " + this.balance);
    }

    public void withdrawFunds(double amount) {
        if (balance - amount < 0) {
            System.out.println("Not enough funds!!");
        } else {
            this.balance -= amount;
            System.out.println("Successfully withdrew " + amount + " new balance is " + this.balance);
        }
    }
}
