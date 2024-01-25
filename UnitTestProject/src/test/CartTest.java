package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import onlineBookShop.Cart;
import onlineBookShop.Item;
import onlineBookShop.User;

public class CartTest {

	private Cart cart;
    private User user;

    @Before
    public void setUp() throws Exception {
        user = new User(1, "JohnDoe");
        cart = new Cart(user);
    }

    @Test
    public void testAddItem() {
        Item item = new Item(1, 5, "Book");
        cart.addItem(item);

        List<Item> items = cart.getAllItems();
        assertEquals(1, items.size());
        assertEquals(item, items.get(0));
    }

    @Test
    public void testRemoveItem() {
        Item item = new Item(1, 5, "Book");
        cart.addItem(item);

        cart.removeItem(item);
        List<Item> items = cart.getAllItems();

        assertEquals(0, items.size());
    }

    @Test
    public void testReduceQuantity() {
        Item item = new Item(1, 5, "Book");
        cart.addItem(item);

        cart.reduceQuantity(1, 2);
        List<Item> items = cart.getAllItems();

        assertEquals(1, items.size());
        assertEquals(3, items.get(0).getQuantity());
    }


    @Test
    public void testGetAllItems() {
        Item item1 = new Item(1, 5, "Book1");
        Item item2 = new Item(2, 3, "Book2");

        cart.addItem(item1);
        cart.addItem(item2);

        List<Item> items = cart.getAllItems();
        assertEquals(2, items.size());
        assertTrue(items.contains(item1));
        assertTrue(items.contains(item2));
    }

    @Test
    public void testRemoveAllItems() {
        Item item1 = new Item(1, 5, "Book1");
        Item item2 = new Item(2, 3, "Book2");

        cart.addItem(item1);
        cart.addItem(item2);

        cart.removeAllItems();
        List<Item> items = cart.getAllItems();

        assertEquals(0, items.size());
    }

    @Test
    public void testCount() {
        Item item1 = new Item(1, 5, "Book1");
        Item item2 = new Item(2, 3, "Book2");

        cart.addItem(item1);
        cart.addItem(item2);

        assertEquals(2, cart.count());
    }
}
