package onlineBookShop;

import java.util.Date;

public class Subscribable implements Service {
    private double subscriptionFee;
    private double subscriptionPeriod;
    private Date subscriptionStartsFrom;
    private Date subscrptionEndsOn;
    private String serviceName;
    
    public Subscribable(String serviceName, double price) {
    	this.serviceName = serviceName;
        this.subscriptionFee = price;
    }

    public double getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(double subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public double getSubscriptionPeriod() {
        return subscriptionPeriod;
    }

    public void setSubscriptionPeriod(double subscriptionPeriod) {
        this.subscriptionPeriod = subscriptionPeriod;
    }

    public Date getSubscriptionStartsFrom() {
        return subscriptionStartsFrom;
    }

    public void setSubscriptionStartsFrom(Date subscriptionStartsFrom) {
        this.subscriptionStartsFrom = subscriptionStartsFrom;
    }

    public Date getSubscrptionEndsOn() {
        return subscrptionEndsOn;
    }

    public void setSubscrptionEndsOn(Date subscrptionEndsOn) {
        this.subscrptionEndsOn = subscrptionEndsOn;
    }

	@Override
	public String getServiceName() {
		return serviceName;
	}
}
