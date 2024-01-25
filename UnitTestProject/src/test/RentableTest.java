package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import onlineBookShop.Rentable;

public class RentableTest {

	private Rentable rentable;

    @Before
    public void setUp() throws Exception {
        rentable = new Rentable("Book Rental", 5.99); // Assuming a rentable service with a price of 5.99
    }

    @Test
    public void testGetRentalPrice1Day() {
        assertEquals(5.99, rentable.getRentalPrice1Day(), 0.001); // Using delta for double comparison
    }

    @Test
    public void testSetRentalPrice1Day() {
        rentable.setRentalPrice1Day(8.99);
        assertEquals(8.99, rentable.getRentalPrice1Day(), 0.001); // Using delta for double comparison
    }

}
