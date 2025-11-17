package ss8_clean_code_refactoring_to_java.bai_tap.entity;

public class MotorBike extends Vehicle {
    private int wattage;

    public MotorBike(String licensePlate, String manufacturer, int year, String owner, int wattage) {
        super(licensePlate, manufacturer, year, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Xe máy: " + super.toString() +
                ", Công suất: " + wattage + " cc";
    }
}
