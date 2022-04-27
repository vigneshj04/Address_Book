import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice;
        AddressBook addressBook = new AddressBook();
        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to Address Book Program");
            System.out.println("Kindly Enter choice \n 1. Add new Contact \n 2. Edit Contact details \n 3. Show Contact details");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addContacts();
                    break;

                case 2:
                    addressBook.editContacts();
                    break;

                case 3:
                    addressBook.showContacts();
                    break;
            }
        } while (choice != 3);
    }
}