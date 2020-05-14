package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers;
    private Customer customer;
    private String branchName;

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Branch(String branchName){
        this.branchName = branchName;
        customers = new ArrayList<>();
    }

    public void addNewCustomer(String customerName, double initialAmount){
        customer = new Customer(customerName,initialAmount);
        if(findCustomer(customer)){
            System.out.println(customerName +", already exists in record");
        }else{
            customers.add(customer);
            System.out.println(customerName +" was added successfully in record");
        }
    }

    public boolean addAdditionalAmount(String customerName, double amount){
        Customer customer = findCustomer(customerName,amount);
        if(customer == null){
            return false;
        }else{
            return true;
        }
    }

    private Customer findCustomer(String name,double amount) {
        for (int i = 0; i < customers.size(); i++) {
            customer = customers.get(i);
            if (customer.getName().equals(name)) {
                customer.addTransaction(amount);
                return customer;
            }
        }
        return null;
    }

    private boolean findCustomer(Customer customer){
        int foundPosition = customers.indexOf(customer);
        if(foundPosition>=0){
            return true;
        }
        return false;
    }

    public String getBranchName() {
        return branchName;
    }
}
