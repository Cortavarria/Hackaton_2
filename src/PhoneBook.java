import java.util.ArrayList;

public class PhoneBook {
  public ArrayList<Contact> contacts;

  public PhoneBook() {
    contacts = new ArrayList<>();
  };

  // Method to add Contact into Arraylist
  public void addContact(Contact newContact) {

    if (isAvailable() == 0) {
      System.out.println("Your phonebook is full");
      return;
    }

    if (isContactExist(newContact.getName())){
      System.out.println("This contact is already exist, it has not been add");
      return;
    }

    System.out.println("This contact has been add successfully");

    contacts.add(newContact);

  }

  // Method to validate if contact exist
  public boolean isContactExist (String name) {

    for (Contact contact : contacts) {
      if (name.equals(contact.getName())) return true;
    }
    return false;
  }

  // Method to show contacts list
  public void contactsList () {

    if (contacts.size() == 0) {
      System.out.println("Your phonebook is empty");
      return;
    }

    System.out.println("---My PhoneBook---");

    for(Contact contact : contacts) {
        System.out.println(contact);
    };
  }

  // Method to show if contact list has an empty place
  public int isAvailable () {

    if (contacts.size() < 10) {
      int placeAvalilable = 10 - contacts.size();
      return placeAvalilable;
    } else {
      return 0;
    }
  }

  public void searchContact (String name) {

    if (!isContactExist(name)) {
      System.out.println("This contact doesn't exist");
      return;
    }

    for (Contact contact : contacts) {
      if (name.equals(contact.getName())) {
        System.out.println("The number from " + name + " is " + contact.getPhone());
        return;
      }
    }
  }

  public void deleteContact (String name) {
    if (!isContactExist(name)) {
      System.out.println("This contact doesn't exist");
      return;
    }

    contacts.removeIf(contact -> contact.getName().equals(name));
    System.out.println("Contact deleted sucessfully");
  }



}
