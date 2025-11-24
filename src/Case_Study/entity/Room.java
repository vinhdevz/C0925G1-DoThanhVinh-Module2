package Case_Study.entity;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, double usableArea, double rentalCost,
                int maxPeople, String rentalType, String freeService) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public static Room fromCSV(String csv) {
        String[] parts = csv.split(",", -1);
        return new Room(parts[0], parts[1], Double.parseDouble(parts[2]), Double.parseDouble(parts[3]),
                Integer.parseInt(parts[4]), parts[5], parts[6]);
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + freeService;
    }

    @Override
    public String toString() {
        return "Room " + super.toString() + " | Miễn phí: " + freeService;
    }
}