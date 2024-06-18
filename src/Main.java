//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    PhoneBook phoneBook = new PhoneBook();

    phoneBook.addContact(new Contact("María", 12345678));
    phoneBook.addContact(new Contact("Arturo", 987654321));
    phoneBook.addContact(new Contact("Edwar", 456789123));


    phoneBook.contactsList();

    phoneBook.addContact(new Contact("María", 456789789));

    phoneBook.addContact(new Contact("Angélica", 456789789));
    phoneBook.addContact(new Contact("Yobán", 456789789));
    phoneBook.addContact(new Contact("Alejandro", 456789789));
    phoneBook.addContact(new Contact("Natalia", 456789789));
    phoneBook.addContact(new Contact("Lolo", 456789789));
    phoneBook.addContact(new Contact("Rose", 456789789));
    phoneBook.addContact(new Contact("Lola", 456789789));

    phoneBook.addContact(new Contact("Carlos", 456789789));


    phoneBook.contactsList();

    phoneBook.isAvailable();
  }
}