package Contact;
import java.util.Scanner;

public class ContactService {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Prompt user to enter Contact ID
		System.out.print("Enter Contact ID. (up to 10 char.): ");
		String contactId = scanner.nextLine();
		
		//Prompt user to enter First Name
		System.out.print("Enter your First Name. (up to 10 char.): ");
		String firstName = scanner.nextLine();
		
		//Prompt user to enter Last Name
		System.out.print("Enter your Last Name. (up to 10 char.): ");
		String lastName = scanner.nextLine();
		
		//Prompt user to enter Phone Number
		System.out.print("Enter your Phone Number. (must be 10 digits): ");
		String phone = scanner.nextLine();
		
		//Prompt user to enter Address
		System.out.print("Enter your Address: (must not exceed 30 char.): ");
		String address = scanner.nextLine();
		
		//Create new contact object
		Contact contact = new Contact(contactId, firstName, lastName,
				phone, address);
		
		//Print Contact Information 
		System.out.println("Contact created: ");
		System.out.println("Contact ID: " + contact.getContactId());
		System.out.println("First Name: " + contact.getFirstName());
		System.out.println("Last Name: " + contact.getLastName());
		System.out.println("Phone: " + contact.getPhone());
		System.out.println("Address: " + contact.getAddress());
		
		scanner.close();
		
	}
}
