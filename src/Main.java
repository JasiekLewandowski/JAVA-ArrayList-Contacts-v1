import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Contacts> arrayContacts = new ArrayList<Contacts>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Welcome to your contacts list. Choose your option:");
        boolean work = true;
        while (work){
            printInstructions();
            int decision = scanner.nextInt();
            scanner.nextLine();
            if (decision >= 0 && decision < 5){
                switch (decision){
                    case 0:
                        printContactList();
                        break;
                    case 1:
                        addContact();
                        break;
                    case 2:
                        removeContact();
                        break;
                    case 3:
                        modifyContact();
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        work = false;
                        break;
                }
            }
            else
                System.out.println("Wrong choice");
        }
    }


       public static void printInstructions(){
           System.out.println("0 - Show your contacts");
           System.out.println("1 - Add new contact");
           System.out.println("2 - Remove a contact");
           System.out.println("3 - Modify a contact");
           System.out.println("4 - Quit");

       }
        public static void addContact(){
            System.out.println("Enter new contact name: ");
            String newContactName = scanner.nextLine();
            System.out.println("Enter new contact number: ");
            int newContactNumber = scanner.nextInt();
            Contacts newContact = new Contacts(newContactName, newContactNumber);
            arrayContacts.add(newContact);
        }

        public static void removeContact(){
            System.out.println("Which contact do you want to delete?");
            String name = scanner.nextLine();
            int index = findContact(name);
            if (index >= 0) {
                arrayContacts.remove(index);
                System.out.println("Contact " + name + " has been removed.");
            }
            else {
                System.out.println("There's no such contact in contact list.");
            }
        }


        public static void printContactList(){
            int amountOfContacts = arrayContacts.size();
            System.out.println("You have " + amountOfContacts + " contacts in your contacts list.");
            for (int i = 0; i < amountOfContacts; i++){
                System.out.println((i + 1) + ". " + arrayContacts.get(i).printContact());
            }
        }

        public static void modifyContact(){
            System.out.println("Enter contact name you want to modify.");
            String name = scanner.nextLine();
            int contactIndex = findContact(name);
            if (contactIndex >= 0){
                System.out.println("Press 1 to change name or 2 to change number.");
                int decision = scanner.nextInt();
                scanner.nextLine();
                switch (decision){
                    case 1:
                        System.out.println("Enter new name: ");
                        String newName = scanner.nextLine();
                        arrayContacts.get(contactIndex).setName(newName);
                        System.out.println("Contact name is now set as: " + newName);
                        break;
                    case 2:
                        System.out.println("Enter new number: ");
                        int newNumber = scanner.nextInt();
                        arrayContacts.get(contactIndex).setNumber(newNumber);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }

        public static int findContact(String name){
            for (int i = 0; i < arrayContacts.size(); i++) {
                String theName = arrayContacts.get(i).getName();
                if (theName .equals(name)) {
                    return i;
                }
                    else {
                        return -1;
            }
            }
            return -1;
        }
    }



