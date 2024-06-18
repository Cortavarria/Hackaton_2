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
      String nameContactInput;

      switch(option) {
        case 0:
          scanner.close();
          System.out.println("Exit...");
          break;
        case 1:
          System.out.println("Please add a name: ");
          nameContactInput = scanner.nextLine();
          System.out.println("Please add a phone number: ");
          int phoneNumber = scanner.nextInt();
          phoneBook.addContact(new Contact(nameContactInput, phoneNumber));
          break;

        case 2:
          phoneBook.contactsList();
          break;

        case 3:
          System.out.println("Type the name to search");
          nameContactInput = scanner.nextLine();
          phoneBook.searchContact(nameContactInput);
          break;

        case 4:
          System.out.println("Type the name to delete");
          nameContactInput = scanner.nextLine();
          phoneBook.deleteContact(nameContactInput);
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