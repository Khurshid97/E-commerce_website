package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import onlineBookShop.Buyable;

public class BuyableTest {

	private Buyable buyable;

    @Before
    public void setUp() throws Exception {
        buyable = new Buyable("Book Purchase", 19.99); // Assuming a buyable service with a price of 19.99
    }

    @Test
    public void testGetBuyPrice() {
        assertEquals(19.99, buyable.getBuyPrice(), 0.001); // Using delta for double comparison
    }

    @Test
    public void testSetBuyPrice() {
        buyable.setBuyPrice(29.99);
        assertEquals(29.99, buyable.getBuyPrice(), 0.001); // Using delta for double comparison
    }

}
