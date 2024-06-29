package Contact;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void test() { 
		fail("Not yet implemented");
	}
	
	@Test
	void testContact() {
		String contactId = "0123456789";
		String firstName = "Serenity";
		String lastName = "Rogers";
		String phone = "1234567890";
		String address = "123 Main st. Springfield";
		
		Contact contact = new Contact(contactId,
				firstName, lastName, phone, address);
		
		
		assertEquals(contactId, contact.getContactId());
		assertEquals(firstName, contact.getFirstName());
		assertEquals(lastName, contact.getLastName());
		assertEquals(phone, contact.getPhone());
		assertEquals(address, contact.getAddress());
	}
	
	//Test to ensure Contact Id is valid
	@Test
	void testContactInvalidId() { 
		Exception exception = assertThrows(IllegalArgumentException.class, ()->{
			new Contact(null, "0123456789", "Serenity","Rogers","1234567890");
		});
		assertEquals("Contact Id must not be null. Must not exceed 10 char.",
				exception.getMessage());
		
		exception = assertThrows(IllegalArgumentException.class, ()->{
			new Contact("0123456789", "Serenity", "Rogers", "1234567890", "123 Main st. Springfield");
		});
		assertEquals("Contact Id must not be null. Must not exceed 10 char.",
				exception.getMessage());
	}
	
	//Tests to make sure name, phone, and address is valid
	@Test 
	void testSetFirstName() {
		Contact contact = new Contact("0123456789", "Serenity", "Rogers", "1234567890", "123 Main st. Springfield");
		contact.setFirstName("Ren");
		assertEquals("Ren", contact.getFirstName());
	} 
	
	@Test
	void testSetLastName() {
		Contact contact = new Contact("0123456789", "Serenity", "Rogers", "1234567890", "123 Main st. Springfield");
		contact.setLastName("Ro");
		assertEquals("Ro", contact.getLastName());
	} 
	
	void testSetPhone() {
		Contact contact = new Contact("0123456789", "Serenity", "Rogers", "1234567890", "123 Main st. Springfield");
		contact.setLastName("7609008888");
		assertEquals("7609008888", contact.getPhone());
	} 
	
	void testSetAddress() {
		Contact contact = new Contact("0123456789", "Serenity", "Rogers", "1234567890", "123 Main st. Springfield");
		contact.setAddress("Wallaby Way Sydney");
		assertEquals("Wallaby Way Sydney", contact.getAddress());
	} 
}


