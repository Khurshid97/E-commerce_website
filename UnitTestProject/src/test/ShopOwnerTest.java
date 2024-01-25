package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import onlineBookShop.Moderator;
import onlineBookShop.ShopOwner;

public class ShopOwnerTest {

    private ShopOwner shopOwner;
    private Moderator moderator;

    @Before
    public void setUp() {
        shopOwner = new ShopOwner(1, "ShopOwner1", true, true);
        moderator = new Moderator(2, "Moderator1", true);
    }

    @Test
    public void testDeleteModerator() {
    	moderator = shopOwner.CRUDModerators(moderator, "delete");
        assertNull(moderator);
    }

    @Test
    public void testSeeModerator() {
    	moderator = new Moderator(3, "Moderator1", true);
    	Moderator shopOwnerT = shopOwner.CRUDModerators(moderator, "see");

        assertEquals(moderator, shopOwnerT);
    }

    @Test
    public void testCreateModerator() {
    	Moderator rModerator = shopOwner.CRUDModerators(moderator, "create");
        assertTrue(rModerator instanceof Moderator);
        assertEquals("New Mod", rModerator.getUserName());
        assertFalse(((Moderator) rModerator).isModerator());
    }
}
