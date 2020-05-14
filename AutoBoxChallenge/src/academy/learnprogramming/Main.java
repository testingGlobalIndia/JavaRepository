package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.addBranch("SBI","Virender",200.00d);
        bank.addAdditionTransaction("SBI","Virender",300.9);
        bank.addAdditionTransaction("SBI","Virender",600.30);
        bank.printBranches();
        Bank bank2 = new Bank();
        bank2.addBranch("Citi","John",700.9d);
        bank2.addAdditionTransaction("Citi","John",200.9);
        bank2.addAdditionTransaction("Citi","John",900.30);
        bank2.printBranches();

    }
}
