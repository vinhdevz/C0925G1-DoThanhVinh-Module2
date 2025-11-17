package Case_Study.entity;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String toString() {
        return "House{" +
                "serviceCode = " + getServiceCode() +
                ", serviceName = " + getServiceName() +
                ", usableArea = " + getUsableArea() +
                ", rentalCost = " + getRentalCost() +
                ", maxPeople = " + getMaxPeople() +
                ", rentalType = " + getRentalType() +
                ", roomStandard = " + roomStandard +
                ", floors = " + numberOfFloors +
                "}";
    }
}
