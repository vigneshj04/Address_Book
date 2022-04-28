import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while (choice <= 8) {

            System.out.println("Kindly Enter choice \n 1. Add New Address Book \n 2. Edit Address Book  \n 3. Display Address Book  \n 4. Delete Address book" +
                    " \n 5. Search Person through Name, City or State \n 6. Count contacts \n 7. Sorting \n 8. Write data \n 9. Read data \n 10. Quit");
            choice = scan.nextInt();
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
                    AddressBook.countByOption();
                    break;
                case 7:
                    AddressBook.sortByOption();
                    break;
                case 8:
                    FileIO fileIO = new FileIO();
                    fileIO.writeData(AddressBook.addressBookMap);
                    break;
                case 9 : FileIO fileIORead = new FileIO();
                    System.out.println(fileIORead.readData());
                    break;
                case 10 :
                    System.out.println("Thank you.");
                    break;
            }

        }
    }
}