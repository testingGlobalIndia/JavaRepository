package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("Tim",98.9);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.32);
        System.out.println("Balance for customer "+customer.getName() + " is "+customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        for(int i =0 ;i<intList.size();i++){
            System.out.println(i +": "+intList.get(i));
        }
        intList.add(1,4);
        for(int i =0 ;i<intList.size();i++){
            System.out.println(i +": "+intList.get(i));
        }
    }
}
