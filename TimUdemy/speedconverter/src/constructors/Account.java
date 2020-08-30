package constructors;

class Account {
    public int number;
    public double balance;
    public String customerName;
    public String email;
    public String phoneNumber;

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

    public void setBalance(double balance) {
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
        balance += amount;
        System.out.println("Added funds, new balance is " + balance);
    }

    public void withdrawFunds(double amount) {
        if (balance - amount < 0) {
            System.out.println("Not enough funds!!");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + " new balance is " + balance);
        }
    }
}
