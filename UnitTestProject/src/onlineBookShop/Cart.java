package onlineBookShop;

import java.util.Iterator;
import java.util.List;

public class Cart {

    private User user;

    public Cart(User user) {
        this.user = user;
    }

    public void addItem(Item item) {
    	
    	List<Item> items = this.user.getAllItems();
       // if(!items.contains(item)){
            items.add(item);
       // }
    }

    public void removeItem(Item item) {
        List<Item> items = this.user.getAllItems();

        if (items.contains(item)) {
            items.remove(item);
        }
    }

    public void reduceQuantity(int itemId, int quantity) {
        List<Item> items = this.user.getAllItems();
        Iterator<Item> iterator = items.iterator();

        while (iterator.hasNext()) {
            Item item = iterator.next();

            if (item.getId() == itemId) {
                if (quantity <= 0) {
                    iterator.remove();
                } else {
                    int newQuantity = item.getQuantity() - quantity;
                    item.setQuantity(Math.max(0, newQuantity));
                }
                return;
            }
        }
    }

    public List<Item> getAllItems() {
        return this.user.getAllItems();
    }

    public void removeAllItems() {
        List items = this.user.getAllItems();
        items.clear();
    }

    public int count(){
        List<Item> items = this.user.getAllItems();

        if (items != null) {
            return items.size();
        } else {
            return 0;
        }
    }

}
