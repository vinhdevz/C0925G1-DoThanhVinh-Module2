package Case_Study.entity;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String serviceCode, String serviceName, double usableArea, double rentalCost,
                 int maxPeople, String rentalType, String roomStandard, int numberOfFloors) {
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

    public static House fromCSV(String csv) {
        String[] parts = csv.split(",", -1);
        return new House(parts[0], parts[1], Double.parseDouble(parts[2]), Double.parseDouble(parts[3]),
                Integer.parseInt(parts[4]), parts[5], parts[6], Integer.parseInt(parts[7]));
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + roomStandard + "," + numberOfFloors;
    }

    @Override
    public String toString() {
        return "House " + super.toString() + " | Standard | " + numberOfFloors + " tầng";
    }
}