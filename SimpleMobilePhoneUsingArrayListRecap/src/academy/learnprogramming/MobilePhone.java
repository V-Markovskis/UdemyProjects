package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact) >= 0) {
            System.out.println("Contact is on file");
            return false;
        }
        this.myContacts.add(contact);
        System.out.println("Contact successfully added");
        return true;
    }

    public boolean updateContact(Contact oldContact,Contact newContact) {
        int position = findContact(oldContact);
        if(position < 0) {
            System.out.println("Cannot find contact with name " + oldContact.getName());
            return false;
        } else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists." +
                                "Update was not successful");
            return false;
        }
        this.myContacts.set(position,newContact);
        System.out.println(oldContact.getName() + " was deleted");
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if(position < 0) {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(contact);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }

    public Contact queryContacts(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContact() {
        System.out.println("Contact list");
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + "." + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for(int i = 0; i < this.myContacts.size(); i++) {
            Contact copyOfContact = this.myContacts.get(i);
            if(copyOfContact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
     }
}
