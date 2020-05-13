package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static ArrayList<Contacts> contacts = new ArrayList<>();

    public void addContact(Contacts contact){
        if(findContact(contact.getName())!=null){
            System.out.println(contact.getName()+", already exists");
        }
        this.contacts.add(contact);
        System.out.println(contact.getName() +" -> "+contact.getPhoneNumber()+" was added successfully in contact list");
    }

    public boolean updateContact(Contacts oldContact, Contacts newContacts){
        int foundPosition = findContact(oldContact);
        if(foundPosition<0){
            System.out.println(oldContact.getName()+", was not found");
            return false;
        } else if(findContact(newContacts.getName()) != null){
            System.out.println(newContacts.getName() +" was already exits in the contact list");
            return false;
        }
        this.contacts.set(foundPosition,newContacts);
        System.out.println(newContacts.getName() + " is updated successfully");
        return true;
    }

    public void removeContact(String contactName){
        Contacts existingContact = findContact(contactName);
        if(existingContact ==null){
            System.out.println(contactName+" is not exists");
        }
        int foundPosition = this.contacts.indexOf(existingContact);
        this.contacts.remove(foundPosition);
        System.out.println(contactName +", was removed from list");
    }

    public boolean searchContact(String contactName){
        Contacts existingContact = findContact(contactName);
        if(existingContact == null){
            return false;
        }
        this.contacts.remove(existingContact);
        return true;
    }

    public static void printContactList(){
        System.out.println("You have "+contacts.size() + " contacts in your contact list");
        for(int i=0 ;i<contacts.size();i++){
            System.out.println((i+1)+". "+ contacts.get(i).getName()+" -> "+contacts.get(i).getPhoneNumber());
        }
    }

    private int findContact(Contacts contact){
        return this.contacts.indexOf(contact);
    }

    public Contacts findContact(String contactName) {
        for(int i =0;i<contacts.size();i++){
            Contacts contacts = this.contacts.get(i);
            if(contacts.getName().equals(contactName)){
                return contacts;
            }
        }
        return null;
    }
}
