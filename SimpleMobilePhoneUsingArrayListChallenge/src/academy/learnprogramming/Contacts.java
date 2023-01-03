package academy.learnprogramming;

import java.util.ArrayList;

public class Contacts {

    private String name;
    private String number;

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    // Calling constructor in CreateContact method
    public static Contacts createContact(String name, String number) {
        return new Contacts(name,number);
    }

    ArrayList<String> contactList = new ArrayList<>();

    public ArrayList<String> getContactList() {
        return contactList;
    }

    public void storeContacts(String names) {
        getContactList().add(names);
    }

    public void printContacts() {
        System.out.println("You have " + contactList.size() + " contacts in your list");
        for(int i = 0; i < contactList.size(); i++) {
            System.out.println(i + ") " + contactList.get(i));
        }
    }
}
