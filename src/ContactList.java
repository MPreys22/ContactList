import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that stores subclasses of Person as a contact list.
 * The user is presented with a menu of options and may add, sort,
 * search, or list the contacts.
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */

public class ContactList
{
    // TODO: Create your array contacts
    private ArrayList<Person> contacts = new ArrayList<Person>();
    private Scanner input = new Scanner(System.in);
    // TODO: Write a Constructor

    public ContactList() {

    }

    public void printMenuOptions() {
        System.out.println("Menu: ");
        System.out.println("1. Add Contact");
        System.out.println("2. List All Contacts By First Name");
        System.out.println("3. List All Contacts By Last Name");
        System.out.println("4. List All Contacts By Phone Number");
        System.out.println("5. List All Students");
        System.out.println("6. Search By First Name");
        System.out.println("7. Search By Last Name");
        System.out.println("8. Search by Phone Number");
        System.out.println("0. Exit");
    }

    /**
     * Asks user for input to create and add a new Person
     * to the contact list
     */
    public void addContact() {
        // TODO: Complete the addContact method
        System.out.println("Select a type of contact to add: \n" +
                "1. Student \n" +
                "2. Worker");
        int choice = input.nextInt();
        if(choice == 1) {
            input.nextLine();
            System.out.println("First Name");
            String first = input.nextLine();
            System.out.println("Last Name");
            String last = input.nextLine();
            System.out.println("Phone Number");
            String number = input.nextLine();
            System.out.println("Grade");
            int grade = input.nextInt();
            input.nextLine();
            Student student = new Student(first, last, number, grade);
            contacts.add(student);
        } else if (choice == 2) {
            input.nextLine();
            System.out.println("First Name");
            String first = input.nextLine();
            System.out.println("Last Name");
            String last = input.nextLine();
            System.out.println("Phone Number");
            String number = input.nextLine();
            System.out.println("Terms");
            int grade = input.nextInt();
            input.nextLine();
            President president = new President(first, last, number, grade);
            contacts.add(president);
        }
        return;
    }

    /**
     * Loops through and prints all contacts
     */
    public void printContacts() {
        // TODO: Complete the printContacts method
        for(Person contact: contacts) {
            System.out.println(contact);
        }
    }

    /**
     * Bubble sorts the contacts in the list by firstName,
     * lastName, or phoneNumber
     * @param sortBy: 0=firstName, 1=lastName, 2=phoneNumber
     */
    public void sort(int sortBy) {
        // TODO: Complete the sort method
        int n = contacts.size();
        Person temp;
        if(sortBy == 0) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    int compare = contacts.get(j).getFirstName().compareTo(contacts.get(j+1).getFirstName());
                    if(compare < 0){
                         temp = contacts.get(j);
                         contacts.set(j, contacts.get(j+1));
                         contacts.set(j+1, temp);
                    }
                }
            }
        }

    }

    // TODO: Write searchByFirstName

    // TODO: Write searchByLastName

    // TODO: Write searchByPhoneNumber

    /**
     * Lists just the Student objects in the Contact List
     */
    public void listStudents() {
        // TODO: Complete the listStudents method
    }

    /**
     * Loops providing menu options to the user
     * until the user exits
     */
    public void run() {
        System.out.println("Welcome to your Contacts List");
        System.out.println("Please pick from the following menu options");
        int choice = 1;
        // TODO: Complete the run method
        while(choice != 0) {
            printMenuOptions();
            choice = input.nextInt();
            if (choice == 1) {
                input.nextLine();
                addContact();
            } else if (choice == 2) {
                sort(0);
                printContacts();
            } else if(choice == 5) {
                input.nextLine();
                printContacts();
            }
        }
    }


    public static void main(String[] args)
    {
        ContactList cl = new ContactList();
        cl.run();
    }
}
