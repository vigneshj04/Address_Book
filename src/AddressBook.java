import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contacts> list = new ArrayList<Contacts>();
    Scanner sc = new Scanner(System.in);

    public void addContacts() {

        Contacts contacts = new Contacts();
        System.out.println("Enter the Contact details");

        System.out.println("Enter the First Name :");
        contacts.setFirstname(sc.next());

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
        contacts.setPhone_number(sc.next());

        System.out.println("Enter the EMail ID :");
        contacts.setEmail(sc.next());

        list.add(contacts);
    }

    public void showContacts() {
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
    public void editContacts() {

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
                contacts.setPhone_number(sc.next());
                System.out.println("Enter the EMail ID :");
                contacts.setEmail(sc.next());
                break;
            }
        }
        if (!isAvailable) {
            System.out.println("Contact Number Not found ");
        }
    }

    public void deleteContact() {
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
}