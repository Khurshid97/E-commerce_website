package onlineBookShop;

public class Exchangeable implements Service {

    private boolean isAvailableForExchange;
    private String serviceName;
    
    public Exchangeable(String serviceName) {
    	this.serviceName = serviceName;
    }

    @Override
    public String getServiceName() {
        return serviceName;
    }
    
    public boolean isAvailableForExchange() {
        return isAvailableForExchange;
    }

    public void setAvailableForExchange(boolean availableForExchange) {
        isAvailableForExchange = availableForExchange;
    }
}
