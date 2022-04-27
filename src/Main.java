
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice;
        AddressBook ab = new AddressBook();
        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to Address Book Program");
            System.out.println("Kindly Enter choice \n 1. Add new Contact \n 2. Show Contact details");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    ab.addContacts();
                    break;
                case 2:
                    ab.showContacts();
                case 3:
                    ab.showContacts();
                    break;
            }
        }while (choice != 5);
    }
}