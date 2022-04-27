import java.util.*;
import java.util.stream.Collectors;


public class AddressBook {

    static Scanner sc = new Scanner(System.in);
    static Map<String, AddressBook> addressBookMap = new HashMap<>();
    public static Map<String, Contacts> cityHashMap = new HashMap<String, Contacts>();
    public static Map<String, Contacts> stateHashMap = new HashMap<String, Contacts>();


    //ArrayList created for storing contacts.
    static ArrayList<Contacts> list = new ArrayList<Contacts>();

    public static boolean equalsFirstName(Contacts compareContacts) {
        for (Contacts contacts : list) {
            if (compareContacts.equals(contacts)) {
                return true;
            }
        }
        return false;
    }


    public static void addNewAddressBook() {
        System.out.println("Enter the Address Book Name :");
        String addressBookName = sc.next();
        if (addressBookMap.containsKey(addressBookName)) {
            System.out.println("Entered AddressBook is Already Available");
        } else {
            AddressBook addressBook = new AddressBook();
            addressBookMap.put(addressBookName, addressBook);
        }

    }

    // method to search contact by name
    public static List<Contacts> searchByName(String name) {
        return list.stream().filter(person -> person.getFirstName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    // by city
    public static List<Contacts> searchByCity(String city) {
        return list.stream().filter(person -> person.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    // by state
    public static List<Contacts> searchByState(String state) {
        return list.stream().filter(person -> person.getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }


    public static void searchByOptions() {
        Main addressBook = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. By name");
        System.out.println("2. By city");
        System.out.println("3. By state");
        System.out.println("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                list.forEach(book -> searchByName(name).forEach(System.out::println));
                break;
            case 2:
                System.out.println("Enter city: ");
                String city = sc.nextLine();
                list.forEach(book -> searchByCity(city).forEach(System.out::println));
                break;
            case 3:
                System.out.println("Enter state: ");
                String state = sc.nextLine();
                list.forEach(book -> searchByState(state).forEach(System.out::println));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }


    public void viewByCity(Map<String, Contacts> cityHashMap) {
        cityHashMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + "=" + e.getValue().toString()));
    }

    public static void viewByState(Map<String, Contacts> stateHashMap) {
        stateHashMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + "=" + e.getValue().toString()));
    }


    // method for view element by option
    public void viewByOption(Map<String, AddressBook> addressBookMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. View By city");
        System.out.println("2. View By state");
        System.out.print("Enter Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                viewByCity(cityHashMap);
                break;
            case 2:
                viewByState(stateHashMap);
                break;
            default:
                System.out.println("INVALID CHOICE!");
        }
    }


    public static void displayAddressBooks() {
        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().showContacts();

        }
    }

    public static void editAddressBook() {
        displayAddressBooks();
        System.out.println("Enter the Address Book Name :");
        String addressbookName = sc.next();
        if (addressBookMap.containsKey(addressbookName)) {
            addressBookMap.get(addressbookName).chooseoptionforcontact();
        } else {
            System.out.println("Entered Address Book Name is Not Present ");
        }
    }


    public static void deleteAddressBook() {
        displayAddressBooks();
        System.out.println("Enter the Address Book Name :");
        String addressBookName = sc.next();
        if (addressBookMap.containsKey(addressBookName)) {
            addressBookMap.remove(addressBookName);
            System.out.println("Address Book is Deleted");
        } else {
            System.out.println("Entered Address Book Name is Not Present");
        }
    }


    public static void addContacts() {

        Contacts contacts = new Contacts();

        System.out.println("Enter the Contact details");

        System.out.println("Enter the First Name :");
        contacts.setFirstName(sc.next());

        if (!equalsFirstName(contacts)) {

            System.out.println("Enter the Last Name :");
            contacts.setLastName(sc.next());

            System.out.println("Enter the Address :");
            contacts.setAddress(sc.next());

            System.out.println("Enter the City :");
            contacts.setCity(sc.next());

            System.out.println("Enter the State :");
            contacts.setState(sc.next());

            System.out.println("Enter the Zip Code :");
            contacts.setZip(sc.next());

            System.out.println("Enter the Phone Number :");
            contacts.setPhoneNumber(sc.next());

            System.out.println("Enter the EMail ID :");
            contacts.setEmail(sc.next());

            list.add(contacts);
        } else
            System.out.println("Contact already exists");
    }


    //Method to Show the Contact Details
    public static void showContacts() {
        for (Contacts contacts : list) {
            System.out.println("Contact Details -");
            System.out.println("First Name : " + contacts.getFirstName());
            System.out.println("Last Name : " + contacts.getLastName());
            System.out.println("Address : " + contacts.getAddress());
            System.out.println("City : " + contacts.getCity());
            System.out.println("State : " + contacts.getState());
            System.out.println("Zip Code : " + contacts.getZip());
            System.out.println("Phone Number : " + contacts.getPhone_Number());
            System.out.println("EMail ID : " + contacts.getEmail());
        }
    }

    public static void editContacts() {
        // Editing contact detail by using first name.

        System.out.println("Enter the first name");
        String firstName = sc.next();

        boolean isAvailable = false;
        for (Contacts contacts : list) {
            if (firstName.equalsIgnoreCase(contacts.getFirstName())) {
                isAvailable = true;
                System.out.println("Enter the Last Name :");
                contacts.setLastName(sc.next());
                System.out.println("Enter the Address :");
                contacts.setAddress(sc.next());
                System.out.println("Enter the City :");
                contacts.setCity(sc.next());
                System.out.println("Enter the State :");
                contacts.setState(sc.next());
                System.out.println("Enter the Zip Code :");
                contacts.setZip(sc.next());
                System.out.println("Enter the Phone Number :");
                contacts.setPhoneNumber(sc.next());
                System.out.println("Enter the EMail ID :");
                contacts.setEmail(sc.next());
                break;
            }
        }
        if (!isAvailable) {
            System.out.println("Contact Number Not found ");
        }
    }

    public static void deleteContact() {

        System.out.println("Enter the first name");
        String firstName = sc.next();

        boolean isAvailable = false;
        for (Contacts contacts : list) {
            if (firstName.equalsIgnoreCase(contacts.getFirstName())) {
                isAvailable = true;
                list.remove(contacts);
                System.out.println("Contact Deleted ");
                break;
            }
            if (!isAvailable) {
                System.out.println("Contact Number Not found ");
            }
        }
    }


    public static void chooseoptionforcontact() {
        int choice;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Kindly Enter choice \n 1. Add new Contact \n 2. Edit Contact details \n 3. Display details  \n 4 Delete Contact \n 5. Quit");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    addContacts();
                    break;
                case 2:
                    editContacts();
                    break;
                case 3:
                    showContacts();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    System.out.println("Thank you.");
                    break;
            }
        } while (choice != 5);
    }

}
