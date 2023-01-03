package academy.learnprogramming;

public class Bank {
    private long accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public Bank() {
        this(34343, 22 , "Default name", "Default address" , 123);
        System.out.println("Empty constructor");
    }

    public Bank(long number, int balance, String name, String email, int phoneNumber) {
        System.out.println("Bank account with parameters called");
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(String customerName, String email, int phoneNumber) {
        this(99999, 100, customerName, email, phoneNumber);
    }

    public void deposit(int depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance = " + this.balance);
    }

    public void withdrawal(int withdrawalAmount) {
        if(balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance " + this.balance);
        }
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
