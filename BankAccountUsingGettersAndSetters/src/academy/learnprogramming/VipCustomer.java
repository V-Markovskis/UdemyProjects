package academy.learnprogramming;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Vlad", 22.22, "here@mms.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "opa@mms.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
