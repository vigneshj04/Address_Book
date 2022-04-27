import java.util.Scanner;

public class Main {
     static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            AddressBook ab = new AddressBook();
            System.out.println("Welcome to Address Book Program");
            AddressBook.chooseoptionforcontact();

            int choice;
            do {
                Scanner scan = new Scanner(System.in);
                System.out.println("Kindly Enter choice \n 1. Add New Address Book \n 2. Edit Address Book  \n 3. Display Address Book  \n 4. Delete Address book" +
                        " \n 5. Search Person through City or State \n 6. Quit");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        AddressBook.addNewAddressBook();
                        break;
                    case 2:
                        AddressBook.editAddressBook();
                        break;
                    case 3:
                        AddressBook.displayAddressBooks();
                        break;
                    case 4:
                        AddressBook.deleteAddressBook();
                        break;
                    case 5:
                        AddressBook.searchByOptions();
                        break;
                    case 6:
                        System.out.println("Thank you.");
                        break;
                }
            } while (choice != 7);

        }
    }
}