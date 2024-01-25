package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import onlineBookShop.Address;

public class AddressTest {

	@Before
	public void setUp() throws Exception {}

	@Test
	public void GettersAndSetters() {
		Address address = new Address(1, "Main St", 123, 12345, "City");

        assertEquals(1, address.getId());
        assertEquals("Main St", address.getStreet());
        assertEquals(123, address.getNumber());
        assertEquals(12345, address.getZipCode());
        assertEquals("City", address.getCity());
        

        address.setId(2);
        address.setStreet("Second St");
        address.setNumber(456);
        address.setZipCode(67890);
        address.setCity("New City");

        assertEquals(2, address.getId());
        assertEquals("Second St", address.getStreet());
        assertEquals(456, address.getNumber());
        assertEquals(67890, address.getZipCode());
        assertEquals("New City", address.getCity());
	}
	
	@Test
    public void testConstructor() {
        Address address = new Address(1, "Main St", 123, 12345, "City");

        assertEquals(1, address.getId());
        assertEquals("Main St", address.getStreet());
        assertEquals(123, address.getNumber());
        assertEquals(12345, address.getZipCode());
        assertEquals("City", address.getCity());
    }

}
