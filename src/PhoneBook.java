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

    String nameToLower = name.toLowerCase();

    for (Contact contact : contacts) {
      String contactToLower = contact.getName().toLowerCase();
      if (nameToLower.equals(contactToLower)) return true;
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

  // Method to search an user at the contact list
  public void searchContact (String name) {

    if (!isContactExist(name)) {
      System.out.println("This contact doesn't exist");
      return;
    }

    for (Contact contact : contacts) {
      if (name.toLowerCase().equals(contact.getName().toLowerCase())) {
        System.out.println("The number from " + contact.getName() + " is " + contact.getPhone());
        return;
      }
    }
  }

  // Method to delete an user from contact list
  public void deleteContact (String name) {
    if (!isContactExist(name)) {
      System.out.println("This contact doesn't exist");
      return;
    }

    contacts.removeIf(contact -> contact.getName().equals(name));
    System.out.println("Contact deleted sucessfully");
  }

}
