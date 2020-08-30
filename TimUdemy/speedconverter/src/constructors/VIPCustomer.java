package constructors;

public class VIPCustomer {
    String name;
    double creditLimit;
    String email;

    public VIPCustomer() {
        this("Not given", 150.00, "No email");
    }

    public VIPCustomer(
        String name,
        String email) {
        this(name, 10_000, email);
        this.name = name;
        this.email = email;
    }

    public VIPCustomer(
        String name,
        double creditLimit,
        String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
