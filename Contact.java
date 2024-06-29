package Contact;
public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactId, String firstName,
			String lastName, String phone, String address) {
		
		if(contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Contact Id must not be"
					+ "null and must not exceed 10 characters.");
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First Name must not be"
					+ "null and must not exceed 10 characters.");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last Name must not be"
					+ "null and must not exceed 10 characters.");
		}
		if(phone == null || phone.length()!= 10) {
			throw new IllegalArgumentException("Phone Number must not be"
					+ "null and must be exactly 10 digits.");
		}
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Address must not be"
					+ "null and must not exceed 30 characters.");
		}
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		
	}
	
	//Setter methods for Contact Info(None for Contact Id as it is not updateable)
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	//Getter methods for Contact Info
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	//Override toString() method for printing contact details
	@Override
	public String toString() {
		return "Contact Information:" + contactId +
				firstName + lastName + phone + address;
	}
	
	
}
