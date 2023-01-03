package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        /*Bank account = new Bank();  // 12345, 0 , "Bob" , "asd@bobs.com", 224456;
        account.deposit(100);
        account.deposit(200);
        account.withdrawal(150);

        Bank myAccount = new Bank("Ele", "emailHere" ,4232);
        System.out.println(myAccount.getAccountNumber() + " name " + myAccount.getCustomerName());*/

        VipCustomer task0 = new VipCustomer();
        System.out.println(task0.getName());
        System.out.println(task0.getCreditLimit());
        System.out.println(task0.getEmailAddress());
        System.out.println();

        VipCustomer task = new VipCustomer("Rope", 24.44, "bring@noise.com");
        System.out.println(task.getName());
        System.out.println(task.getCreditLimit());
        System.out.println(task.getEmailAddress());

        System.out.println();

        VipCustomer task2 = new VipCustomer("Mary", 211.21);
        System.out.println(task2.getName());
        System.out.println(task2.getCreditLimit());
        System.out.println(task2.getEmailAddress());

        System.out.println();
    }
}
