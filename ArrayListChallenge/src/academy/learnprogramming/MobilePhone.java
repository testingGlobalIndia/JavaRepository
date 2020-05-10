package academy.learnprogramming;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> contacts = new ArrayList<>();
    private ArrayList<String> groceryList = new ArrayList<>();

    public boolean addNewContact(Contacts contact){
        if(findContact(contact.getName())>=0) {
            System.out.println("Contact is already exists in file");
            return false;
        }else{
            contacts.add(contact);
            return true;
        }
    }

    public boolean removeContact(Contacts contacts){
        int findPosition = findContact(contacts);
        if(findPosition <0){
            System.out.println(contacts.getName() + ", was not found");
            return false;
        }
        this.contacts.remove(findPosition);
        System.out.println(contacts.getName()+" was remove from file");
        return true;
    }

    private int findContact(Contacts contact){
        return contacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i=0;i<contacts.size();i++){
            Contacts contacts = this.contacts.get(i);
            if(contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContacts){
        int findPosition = findContact(oldContact);
        if(findPosition <0){
            System.out.println(oldContact.getName() +", was not found");
            return false;
        } else if(findContact(newContacts.getName())!=-1){
            System.out.println(newContacts.getName()+" already exists");
            return false;
        }
        this.contacts.set(findPosition,newContacts);
        System.out.println(oldContact.getName()+", was replaced by "+newContacts.getName());
        return true;
    }

    public void printContacts(){
        System.out.println("Contact List");
        for (int i=0;i<contacts.size();i++){
            System.out.println((i+1)+ "."+contacts.get(i).getName() +
                    "->"+contacts.get(i).getPhoneNumber());
        }
    }

    public String queryContact(Contacts contacts){
        if(findContact(contacts)>=0){
            return contacts.getName();
        }
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >=0 ){
            return this.contacts.get(position);
        }
        return null;

    }
}
