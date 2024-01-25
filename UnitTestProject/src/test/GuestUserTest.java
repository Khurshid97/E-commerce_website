package test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import onlineBookShop.Address;
import onlineBookShop.GuestUser;
import onlineBookShop.Item;

public class GuestUserTest {

    private GuestUser guestUser;

    @Before
    public void setUp() throws Exception {
        guestUser = new GuestUser();
    }

    @Test
    public void testGetAllItems() {
        List<Item> items = guestUser.getAllItems();
        assertNotNull(items);
        assertEquals(0, items.size());
    }


    @Test
    public void testRegister() {
        int id = 1;
        String userName = "JohnDoe";
        String firstName = "John";
        String lastName = "Doe";
        Date registrationDate = new Date();
        Address address = new Address(1, "Main St", 123, 12345, "City");

        guestUser.register(id, userName, firstName, lastName, registrationDate, address);

        List<Item> items = guestUser.getAllItems();
        assertNotNull(items);
        assertEquals(0, items.size());
    }

}
