package onlineBookShop;


public class Rentable implements Service {
	private String serviceName;
    private double rentalPrice1Day;

    public Rentable(String serviceName, double price) {
        this.serviceName = serviceName;
        this.rentalPrice1Day = price;
    }

    @Override
    public String getServiceName() {
        return serviceName;
    }

    public double getRentalPrice1Day() {
        return this.rentalPrice1Day;
    }

    public void setRentalPrice1Day(double rentalPrice1Day) {
        this.rentalPrice1Day = rentalPrice1Day;
    }
}