import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        ab.addNewAddressBook();
        ab.addContacts();

        int choice;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to Address Book Program");
            System.out.println("Kindly Enter choice \n 1. Add new Contact \n 2. Edit Contact details \n 3. Show Contact details \n 4. Delete Contact");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    ab.addContacts();
                    break;
                case 2:
                    ab.editContacts();
                    break;
                case 3:
                    ab.showContacts();
                    break;
                case 4:
                    ab.deleteContact();
                    break;
            }
        } while (choice != 3);
    }
}