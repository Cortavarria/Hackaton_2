import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    PhoneBook phoneBook = new PhoneBook();

    Scanner scanner = new Scanner(System.in);
    int option;
    do {
      System.out.println("\n PHONE BOOK");
      System.out.println("1. Add contact");
      System.out.println("2. List contacts");
      System.out.println("3. Search contact by name");
      System.out.println("4. Delete contact");
      System.out.println("5. Check if the phone book is full");
      System.out.println("6. Check if the phone book has empty places");
      System.out.println("0. Exit");
      System.out.print("Select an option: ");

      option = scanner.nextInt();
      scanner.nextLine();

      switch(option) {
        case 1:
          System.out.println("Please add a name: ");
          String nameContact = scanner.nextLine();
          System.out.println("Please add a phone number: ");
          int phoneNumber = scanner.nextInt();
          phoneBook.addContact(new Contact(nameContact, phoneNumber));
          break;

        case 2:
          phoneBook.contactsList();
          break;

        case 3:
          System.out.println("Type the name to search");
          String nameToSearch = scanner.nextLine();
          phoneBook.searchContact(nameToSearch);
          break;

        case 4:
          System.out.println("Type the name to delete");
          String nameToDelete = scanner.nextLine();
          phoneBook.deleteContact(nameToDelete);
          break;

        case 5:
          if (phoneBook.isAvailable() != 0) {
            System.out.println("The phonebook is not full");
          } else {
            System.out.println("The phonebook is full");
          }
          break;

        case 6:
          if (phoneBook.isAvailable() != 0) {
            System.out.println("You can add " + phoneBook.isAvailable() + " contacts");
          } else {
            System.out.println("You can't add more contacts");
          }
          break;

        default:
          System.out.println("This option is not available");

      }
    } while (option != 0);


  }
}