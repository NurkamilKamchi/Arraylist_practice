package Service;

import model.Contact;
import model.Phone;

public interface ContactService {
    String turnOn(String string);
   Contact call(long number);
   String add(Phone phone);
   void getAll();

    void getContactByName(String name);
    String update (long id);
    String deleteContact(long id);
    Contact call (String fullName);

}
//// * call(); деген 2 метод бар бироосу параметрине телефон номер сурайт анан
//////издейт эгер тапса номер менен ошол номерди жана ошол номер кандай атта
//////сакталган болсо ошол аты менен чалып жатасыз деп кайтарып берет
