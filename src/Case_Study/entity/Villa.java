package Case_Study.entity;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, double usableArea, double rentalCost,
                 int maxPeople, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
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

    public static Villa fromCSV(String csv) {
        String[] parts = csv.split(",", 9);
        return new Villa(
                parts[0], parts[1],
                Double.parseDouble(parts[2]),
                Double.parseDouble(parts[3]),
                Integer.parseInt(parts[4]),
                parts[5], parts[6],
                Double.parseDouble(parts[7]),
                Integer.parseInt(parts[8])
        );
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + roomStandard + "," + poolArea + "," + numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa " + super.toString() + " | VIP | Hồ bơi " + poolArea + "m² | " + numberOfFloors + " tầng";
    }
}