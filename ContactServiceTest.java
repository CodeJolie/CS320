package Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	 @Test
	    void testContactInvalid() {
	        String contactId = "0123456789";
	        String firstName = "Serenity";
	        String lastName = "Rogers";
	        String phone = "1234567890";
	        String address = "123 Main st. Springfield";
	        
	        Contact contact = new Contact(contactId, firstName, lastName, phone, address);
	        
	        assertNotNull(contact);
	        assertEquals(contactId, contact.getContactId());
	        assertEquals(firstName, contact.getFirstName());
	        assertEquals(lastName, contact.getLastName());
	        assertEquals(phone, contact.getPhone());
	        assertEquals(address, contact.getAddress());
	    }
	 
	 @Test
	    void testContactIdInvalid() {
	        String contactId = "01234567890"; //Invalid ID too long
	        String firstName = "Serenity";
	        String lastName = "Rogers";
	        String phone = "1234567890";
	        String address = "123 Main st. Springfield";
	        
	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	            new Contact(contactId, firstName, lastName, phone, address);
	        });
	        
	        assertEquals("Contact Id must not be null and must not exceed 10 characters.", exception.getMessage());
	    } 	 
	 
	 @Test
	    void testFirstNameInvalid() {
	        String contactId = "0123456789";
	        String firstName = "SerenitySerenity"; //Name too long
	        String lastName = "Rogers";
	        String phone = "1234567890";
	        String address = "123 Main st. Springfield";
	        
	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	            new Contact(contactId, firstName, lastName, phone, address);
	        });
	        
	        assertEquals("Contact Id must not be null and must not exceed 10 characters.", exception.getMessage());
	    } 
	 
	 @Test
	    void testLastNameInvalid() {
	        String contactId = "0123456789";
	        String firstName = "Serenity";
	        String lastName = "RogersRogers"; //Last Name Too Long
	        String phone = "1234567890";
	        String address = "123 Main st. Springfield";
	        
	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	            new Contact(contactId, firstName, lastName, phone, address);
	        });
	        
	        assertEquals("Contact Id must not be null and must not exceed 10 characters.", exception.getMessage());
	    } 
	 
	 @Test
	    void testPhoneInvalid() {
	        String contactId = "0123456789";
	        String firstName = "Serenity";
	        String lastName = "Rogers";
	        String phone = "01234567890"; //Phone Number too long
	        String address = "123 Main st. Springfield";
	        
	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	            new Contact(contactId, firstName, lastName, phone, address);
	        });
	        
	        assertEquals("Contact Id must not be null and must not exceed 10 characters.", exception.getMessage());
	    } 
	 
	 @Test
	    void testAddressInvalid() {
	        String contactId = "0123456789";
	        String firstName = "Serenity";
	        String lastName = "Rogers";
	        String phone = "1234567890";
	        String address = "123 Main st. Springfield Springfield Springfield"; //Address too long
	        
	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	            new Contact(contactId, firstName, lastName, phone, address);
	        });
	        
	        assertEquals("Contact Id must not be null and must not exceed 10 characters.", exception.getMessage());
	    } 
	 
	 
}
