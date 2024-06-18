import java.util.ArrayList;

public class PhoneBook {
  public ArrayList<Contact> contacts;

  public PhoneBook() {
    contacts = new ArrayList<>();
  };


  public void addContact(Contact newContact) {

    if (!isAvailable()) return;

    for(Contact contact : contacts) {
      if (newContact.getName().equals(contact.getName())){
        System.out.println("This contact name is already exist");
        return;
      };
    };

    contacts.add(newContact);

  }

  public void contactsList () {
      for(Contact contact : contacts) {
        System.out.println(contact);
      };
  }

  public boolean isAvailable () {
    if (contacts.size() < 10) {
      int placeAvalilable = 10 - contacts.size();
      System.out.println("You can add " + placeAvalilable + " contacts");
      return true;
    } else {
      System.out.println("Your phonebook is full, you can't add more contacts");
      return false;
    }
  }



}
