package Case_Study.entity;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
        super("SV001", "Villa Sunshine", "VIP", 300, 3, "Daily", 5);
    }

    public Villa(String roomStandard, double poolArea, int numberOfFloors) {
        super("SV001", "Villa Sunshine", "VIP", 300, 3, "Daily", 5);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxPeople, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String toString() {
        return "Villa{" +
                "serviceCode='" + getServiceCode() +
                ", serviceName='" + getServiceName() +
                ", usableArea=" + getUsableArea() +
                ", rentalCost=" + getRentalCost() +
                ", maxPeople=" + getMaxPeople() +
                ", rentalType='" + getRentalType() +
                ", roomStandard='" + roomStandard +
                ", poolArea=" + poolArea +
                ", floors=" + numberOfFloors +
                '}';
    }
}
