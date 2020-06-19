import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    public static void main(String[] args) {




    }

    ArrayList<Contacts> arrayContacts = new ArrayList<Contacts>();
    public static Scanner scanner = new Scanner(System.in);


    public void addContact(){
        System.out.println("Enter new contact name: ");
        String newContactName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter new contact number: ");
        int newContactNumber = scanner.nextInt();
        Contacts newContact = new Contacts(newContactName, newContactNumber);
        arrayContacts.add(newContact);
    }

    public void removeContact(String name){
        int index = findContact(name);
        if (index >= 0)
            arrayContacts.remove(name);
        else {
            System.out.println("There's no such contact in contact list.");
        }
    }


    public void printContactList(){
        int amountOfContacts = arrayContacts.size();
        System.out.println("You have " + amountOfContacts + " contacts in your contacts list.");
        for (int i = 0; i < amountOfContacts; i++){
            System.out.println((i + 1) + ". " + arrayContacts.get(i).printContact());
        }
    }



    public int findContact(String name){
        if (arrayContacts.contains(name)){
            return arrayContacts.indexOf(name);
        }
        else{
            return -1;
        }
    }
}
