package Service.impl;

import Daabase.Database;
import Service.ContactService;
import model.Contact;
import model.Phone;

import java.util.Scanner;

public class ContactServiceImpl implements ContactService {

    Database database = new Database();

    @Override
    public String turnOn(String password) {
        Phone phone = new Phone();;
        phone.setPassword("1921");
        System.out.println("Enter phone password: ");
        if (password.equalsIgnoreCase(phone.getPassword())) {
            return "1";
        }
        return "0";
    }

    @Override
    public Contact call(long number) {
        for (Phone phone : database.phones) {
            for (Contact contact : phone.contacts) {
                if (contact.getPhoneNumber()==number){
                    return contact;
                }
            }
        }
        return null;
    }

    @Override
    public String add(Phone phone) {
        database.phones.add(phone);
        return "succes";
    }

    @Override
    public void getAll() {
        for (Phone phone : database.phones) {
            System.out.println(phone.contacts);
        }
    }

    @Override
    public void getContactByName(String name) {
        for (Phone phone : database.phones) {
            for (Contact contact : phone.contacts) {
                if (contact.getFullName().equalsIgnoreCase(name)){
                    System.out.println(contact);
                    System.out.println("wdcwdcs");
                }
            }
        }
    }

    @Override
    public String update(long id) {
        for (Phone phone : database.phones) {
            for (Contact contact : phone.contacts) {
                if (contact.getId()==id){
                    System.out.print("Write new name contact: ");
                    String newName = new Scanner(System.in).nextLine();
                    contact.setFullName(newName);
                }
            }
        }
        return "Success";
    }

    @Override
    public String deleteContact(long id) {
        for (Phone phone : database.phones) {
            phone.contacts.removeIf(contact -> contact.getId() == id);
        }
        return "success";
    }

    @Override
    public Contact call(String fullName) {
        for (Phone phone : database.phones) {
            for (Contact contact : phone.contacts) {
                if (contact.getFullName().equalsIgnoreCase(fullName)){
                    return contact;

                }
            }
        }
        return null;
    }


}
