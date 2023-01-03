package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName,transaction);
        }
        return false;
    }

    public Branch findBranch(String branchName) {
        for(int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCostumers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Costumer details for branch " + branch.getName());

            ArrayList<Customer> branchCostumers = branch.getCustomers();
            for(int i = 0; i < branchCostumers.size(); i++) {
                Customer branchCostumer = branchCostumers.get(i);
                System.out.println("Customer: " + branchCostumer.getName() + "[" + (i+1) + "]");
                if(showTransactions) {
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = branchCostumer.getTransactions();
                    for(int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "]  Amount " + transactions.get(j));
                    }
                }
             }
            return true;
        } else {
            return false;
        }
    }
}
