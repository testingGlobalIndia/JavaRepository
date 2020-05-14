package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches = new ArrayList<>();
    private Branch branch;

    public void addBranch(String BranchName,String CustomerName, double initialAmount){
        branch = new Branch(BranchName);
        branch.addNewCustomer(CustomerName,initialAmount);
        branches.add(branch);
        System.out.println(BranchName+", was Added successfully");
    }

    public void addAdditionTransaction(String BranchName,String CustomerName, double amount){
        for(int i =0; i<branches.size();i++){
            boolean isBranchExists = branches.get(i).getBranchName().equals(BranchName);
            boolean isCustomerExists = branch.addAdditionalAmount(CustomerName,amount);
            if( isBranchExists && isCustomerExists){
                System.out.println("additional amount "+amount+" was added successfully in record");
            }else{
                System.out.println("Branch name or customer name does not match");
            }
        }
    }

    public void printBranches(){
        for(int i =0;i<branches.size();i++){
            System.out.println((i+1)+". "+ branches.get(i).getBranchName()+ " -> " +
                    ""+branches.get(i).getCustomers().get(i).getName()+"->" +
                    ""+branches.get(i).getCustomers().get(i).getTransactions().get(i));
            int transactionSize = branches.get(i).getCustomers().get(i).getTransactions().size();
            System.out.println("Additional transaction done by user is: ");
            for(int j=1;j<transactionSize;j++){
                System.out.println((j+1)+". "+branches.get(i).getCustomers().get(i).getTransactions().get(j));
            }
        }
    }


}
