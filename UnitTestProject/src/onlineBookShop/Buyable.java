package onlineBookShop;

public class Buyable implements Service {
    private double buyPrice;
    private String serviceName;
    
    public Buyable(String serviceName, double price) {
    	this.serviceName = serviceName;
        this.buyPrice = price;
    }
    
    @Override
    public String getServiceName() {
        return serviceName;
    }
    
    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }
}