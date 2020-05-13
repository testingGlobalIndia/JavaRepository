package academy.learnprogramming;

import java.lang.management.MonitorInfo;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {
	    int choice =0;
	    boolean quit = false;
	    while (!quit){
	        printMenu();
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printMenu();
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("Press any key" +
                "\t\n0 - To display menu options" +
                "\t\n1 - To print contact list" +
                "\t\n2 - To add contact in contact list" +
                "\t\n3 - To remove contact from contact list" +
                "\t\n4 - To update contact in contact list" +
                "\t\n5 - To search contact from contact list" +
                "\t\n6 - To quit application");
    }

    public static void addContact(){
        System.out.println("Enter contact name");
        String contactName = scanner.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();
        Contacts contacts = new Contacts(contactName,phoneNumber);
        mobilePhone.addContact(contacts);
    }

    public static void removeContact(){
        System.out.println("Enter contact name to be removed");
        String contactName = scanner.nextLine();
        mobilePhone.removeContact(contactName);
    }

    public static void updateContact(){
        System.out.println("Enter old contact name to be replaced");
        String oldContactName = scanner.nextLine();
        Contacts oldContact = mobilePhone.findContact(oldContactName);
        System.out.println("Enter new contact name");
        String newContactName = scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newContactPhone = scanner.nextLine();
        Contacts newContact = new Contacts(newContactName,newContactPhone);
        mobilePhone.updateContact(oldContact,newContact);
    }

    public static void searchContact() {
        System.out.println("Enter contact to be searched");
        String searchContactName = scanner.nextLine();
        if (mobilePhone.searchContact(searchContactName)) {
            System.out.println("Contact was found");
        } else {
            System.out.println("Contact was not found");
        }
    }

}
