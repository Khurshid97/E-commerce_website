package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import onlineBookShop.Address;
import onlineBookShop.Cart;
import onlineBookShop.GuestUser;
import onlineBookShop.Item;
import onlineBookShop.Ticket;
import onlineBookShop.User;

public class UserTest {
	
	private User khurshid;
    private User purn;
    private User adyrney;
    private Date registrationDate;
    private Date registrationDate1;
    private Date registrationDate2;
    
    private Ticket ticket1;
    private Ticket ticket2;
    private Ticket ticket3;

	@Before
	public void setUp() throws Exception {
		khurshid = new User(1, "Khurshid");
		Address address1 = new Address(1, "Kozykowa", 18, 90, "Warsaw");
		
		purn = new User(2, "Purn");
		Address address2 = new Address(2, "Masovian", 15, 70, "Warsaw");
		
		adyrney = new User(3, "Adyrney");
		Address address3 = new Address(3, "Wola", 10, 50, "Warsaw");
		
		khurshid.setAddress(address1);
		purn.setAddress(address2);
		adyrney.setAddress(address3);

        registrationDate = new Date();
        registrationDate1 = new Date();
        registrationDate2 = new Date();
        
        khurshid.setResgistrationDate(registrationDate);
        purn.setResgistrationDate(registrationDate1);
        adyrney.setResgistrationDate(registrationDate2);
		
        khurshid.setPassword("hulk");
        purn.setPassword("hulk1");
        adyrney.setPassword("hulk2");
        
        ticket1 = new Ticket(1, "Hello", registrationDate, registrationDate);
        ticket2 = new Ticket(2, "Book is not arrived", registrationDate, registrationDate);
        ticket3 = new Ticket(1, "Accepted", registrationDate, registrationDate);
        
        khurshid.tickets.add(ticket1);
        purn.tickets.add(ticket2);
        adyrney.tickets.add(ticket3);
	}
	
	@Test
    public void testGetTicket() {
        assertEquals(ticket1, khurshid.getTicket(1, ticket1));
        assertEquals(ticket2, purn.getTicket(2, ticket2));
        assertEquals(ticket3, adyrney.getTicket(1, ticket3));
    }
	
	@Test
    public void testEditTicket() {
        assertEquals(ticket1, khurshid.editTicket(ticket1, "Updated Hello"));
        assertEquals(ticket2, purn.editTicket(ticket2, "Book accepted"));
        assertEquals(ticket3, adyrney.editTicket(ticket3, "Simple check"));
    }
	
	@Test
    public void testCreateTicket() {
        assertEquals(true, khurshid.createTicket(ticket1));
        assertEquals(true, purn.createTicket(ticket2));
        assertEquals(true, adyrney.createTicket(ticket3));
    }
	
	@Test
    public void testSelectItem() {
        assertEquals(null, khurshid.selectItem(1));
        
        Cart cart1 = new Cart(adyrney);
        cart1.addItem(new Item(1, 5, "Book"));
        assertEquals("Book", adyrney.selectItem(1));

        Cart cart2 = new Cart(purn);
        cart2.addItem(new Item(1, 5, "Book"));
        cart2.addItem(new Item(2, 1, "AudioBook"));
        assertEquals("AudioBook", purn.selectItem(2));

    }	
	
	@Test
    public void testLogin() {
        assertEquals(true, khurshid.login("Khurshid", "hulk"));
        assertEquals(false, purn.login("Khurshid", "hulk"));
        assertEquals(false, adyrney.login("Khurshid", "hulk"));
    }
	
	@Test
    public void testPay() {
        assertEquals(true, khurshid.pay(100));
        assertEquals(false, purn.pay(0));
        assertEquals(false, adyrney.pay(-150));
    }

	@Test
    public void testGetAddress() {
        assertEquals(1, khurshid.getAddress().get(0).getId());
        assertEquals(2, purn.getAddress().get(0).getId());
        assertEquals(3, adyrney.getAddress().get(0).getId());

       
        assertEquals("Kozykowa", khurshid.getAddress().get(0).getStreet());
        assertEquals("Masovian", purn.getAddress().get(0).getStreet());
        assertEquals("Wola", adyrney.getAddress().get(0).getStreet());
    }

	@Test
    public void testRegistrationDate() {
        assertEquals(registrationDate, khurshid.getResgistrationDate());
        assertEquals(registrationDate1, purn.getResgistrationDate());
        assertEquals(registrationDate2, adyrney.getResgistrationDate());
    }
	

    @Test
    public void testGetId() {
        assertEquals(1, khurshid.getId());
    }

    @Test
    public void testSetId() {
    	khurshid.setId(2);
        assertEquals(2, khurshid.getId());
    }

    @Test
    public void testGetUserName() {
        assertEquals("Khurshid", khurshid.getUserName());
    }

    @Test
    public void testSetUserName() {
    	khurshid.setUserName("JaneDoe");
        assertEquals("JaneDoe", khurshid.getUserName());
    }

    @Test
    public void testGetPassword() {
    	assertEquals("hulk", khurshid.getPassword());
    }

    @Test
    public void testSetPassword() {
    	khurshid.setPassword("password123");
        assertEquals("password123", khurshid.getPassword());
    }

    @Test
    public void testGetFirstName() {
        assertNull(khurshid.getFirstName());
    }

    @Test
    public void testSetFirstName() {
    	khurshid.setFirstName("John");
        assertEquals("John", khurshid.getFirstName());
    }

    @Test
    public void testGetLastName() {
        assertNull(khurshid.getLastName());
    }

    @Test
    public void testSetLastName() {
    	khurshid.setLastName("Doe");
        assertEquals("Doe", khurshid.getLastName());
    }

    @Test
    public void testGetBirthDay() {
        assertNull(khurshid.getBirthDay());
    }

    @Test
    public void testSetBirthDay() {
        Date birthday = new Date();
        khurshid.setBirthDay(birthday);
        assertEquals(birthday, khurshid.getBirthDay());
    }
}
