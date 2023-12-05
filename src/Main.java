import Service.impl.ContactServiceImpl;
import model.Contact;
import model.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerForNum = new Scanner(System.in);

        ArrayList<Contact> myontacts = new ArrayList<>(Arrays.asList(new Contact("Nurkamil", 123546, 1), new Contact("Nurlan", 20231, 2),
                new Contact("Nurislam", 5642, 3), new Contact("Aiturgan", 41, 4), new Contact("Nurtaazim", 564213, 5),
                new Contact("Gulumkan", 54123, 6), new Contact("Zhigit", 541, 7), new Contact("Ali", 4564, 8)));


        Phone phone = new Phone("ios", "iphone_13", "1921", myontacts);
        ContactServiceImpl contactService = new ContactServiceImpl();
        contactService.add(phone);
        while (true) {

            System.out.println("turn your phone on/off");
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("on")) {
                System.out.println("Enter phone password: ");
                String pass = scanner.nextLine();
                if (pass.equalsIgnoreCase(phone.getPassword())) {
                    System.out.println("Correct password!!!");
                    InnerLoop:
                    while (true) {
                        System.out.println("""
                                1.Get all contacts.
                                2.Get contact by name.
                                3.Update contact name.
                                4.Delete contact by id.
                                5.Call by phone number.
                                6.Call by full name.
                                7.Exit.
                                """);
                        switch (scanner.nextLine()) {
                            case "1" -> {
                                contactService.getAll();
                            }
                            case "2" -> {
                                System.out.println("enter contact name: ");
                                String name = scanner.nextLine();
                                contactService.getContactByName(name);
                            }
                            case "3" -> {
                                System.out.println("Enter id: ");
                                long id = scannerForNum.nextLong();
                                System.out.println(contactService.update(id));
                            }
                            case "4" -> {
                                System.out.println("Enter  id: ");
                                long id = scannerForNum.nextLong();
                                System.out.println(contactService.deleteContact(id));
                            }
                            case "5" -> {
                                while (true){
                                try {
                                    System.out.println("Enter phone number: ");
                                } catch (Exception e) {
                                    throw new RuntimeException("you must");
                                }
                                long number = scanner.nextLong();

                                if (contactService.call(number) == null) {
                                    System.err.println("incorrect phone number!!!");
                                } else System.out.println("connection");
                            }}
                            case "6" -> {
                                System.out.println("Enter name: ");
                                String name = scanner.nextLine();
                                if (contactService.call(name) == null) {
                                    System.err.println("incorrect name!!!");
                                } else System.out.println("connection...");
                            }
                            case "7" -> {
                                break InnerLoop;
                            }
                        }
                    }
                } else if (word.equalsIgnoreCase("off")) {
                    break;
                } else {
                    System.out.println("Invalid pass");
                }
            }
        }
    }
}