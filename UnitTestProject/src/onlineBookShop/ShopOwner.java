package onlineBookShop;

public class ShopOwner extends Moderator {
	
	private boolean isShopOwner;

	public ShopOwner(int id, String userName, boolean isModerator, boolean isShopOwner) {
		super(id, userName, isModerator);
		this.isShopOwner = isShopOwner;
	}

	public boolean isShopOwner() {
		return isShopOwner;
	}

	public void setShopOwner(boolean isShopOwner) {
		this.isShopOwner = isShopOwner;
	}
	
	public Moderator CRUDModerators(Moderator moderator, String order) {
		if(order == "delete") {
			moderator = null;
			return moderator;
		}else if(order == "see") {
			return moderator;
		}else if(order == "create") {
			moderator = new Moderator(1, "New Mod", false);
			return moderator;
		}
		return null;
	}
}
