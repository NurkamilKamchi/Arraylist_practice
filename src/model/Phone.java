package model;

import java.util.ArrayList;

public class Phone {
    private String brand;
    private  String name;
    private String password;
    public ArrayList<Contact>contacts=new ArrayList<>();

    public Phone() {
    }

    public Phone(String brand, String name, String password, ArrayList<Contact> contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
////Task1
////Окшош созду очуруу:
////List-te окшош создор бар болсо анда анын экинчи окшош созун
////очуруу керек(мисалы : cat, dog, horse, dog. анда экинчи dog
////очурулуш керек
////Task2 2 класс тузунуз * Contact(phoneNumber, fullName) * Phone(brand, name, password,
////Contacts[] contacts)
//// * PhoneInterface деген interface тузунуз, turnOn(); телефонду жандырат, пароль
////сурайт анан ошол пароль туура болсо "Телефон жанды" деп кайтарат метод.
//// * call(); деген 2 метод бар бироосу параметрине телефон номер сурайт анан
////издейт эгер тапса номер менен ошол номерди жана ошол номер кандай атта
////сакталган болсо ошол аты менен чалып жатасыз деп кайтарып берет
//// * call(); дагы бир методу атын жазасыз эгер ошол ат менен сакталган контакт
////табылса ошол контакттын атын жана ошол номерди кайтарып ушуга чалып
////жатасыз деп кайтарып берет
//// * searchContact(); деген методдун жардамы менен контакттарды издейсиз
////параметрине бир контактын аты жазылат, ошол ат менен контакт табылса ошол
////контакты(Contact) кайтарып берет
//// * Contact updateName(); бул методдун жардамы менен контакттын атын
////озгортсо болот, параметрине 2 соз алат ( эскиАты, жаныАты)
//// * getAllContacts(); бул метод бир телефондун ичиндеги контактардын баарын
////алып берет
//// * main - ден класстардын объекттерин тузуп программанызды иштетиниз
