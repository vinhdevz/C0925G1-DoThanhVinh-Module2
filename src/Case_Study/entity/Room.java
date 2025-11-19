package Case_Study.entity;

public class Room extends Facility {
    private String freeService;

    public Room() {
        super("SV001", "Villa Sunshine", "VIP", 300, 3, "Daily", 5);
    }

    public Room(String freeService) {
        super("SV001", "Villa Sunshine", "VIP", 300, 3, "Daily", 5);
        this.freeService = freeService;
    }

    public Room(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxPeople, String rentalType, String freeService) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public String toString() {
        return "Room{" +
                "serviceCode = " + getServiceCode() +
                ", serviceName = " + getServiceName() +
                ", usableArea = " + getUsableArea() +
                ", rentalCost = " + getRentalCost() +
                ", maxPeople = " + getMaxPeople() +
                ", rentalType = " + getRentalType() +
                ", freeService = " + getFreeService() +
                "}";
    }
}

