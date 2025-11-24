package ss8_clean_code_refactoring_to_java.bai_tap.entity;

public class Truck extends Vehicle {
    private int payLoad;

    public Truck(String licensePlate, String manufacturer, int year, String owner, int payLoad) {
        super(licensePlate, manufacturer, year, owner);
        this.payLoad = payLoad;
    }

    public int getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(int payLoad) {
        this.payLoad = payLoad;
    }

    @Override
    public String toCSV() {
        return String.format("Truck,%s,%s,%d,%s,%d",
                getLicensePlate(),
                getManufacturer(),
                getYear(),
                getOwner(),
                payLoad);
    }

    @Override
    public String toString() {
        return "Xe tải: " + super.toString() +
                ", Trọng tải: " + payLoad + "tấn";
    }
}
