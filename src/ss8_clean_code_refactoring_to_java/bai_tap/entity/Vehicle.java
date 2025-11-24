package ss8_clean_code_refactoring_to_java.bai_tap.entity;

public abstract class Vehicle {
    private String licensePlate;
    private String manufacturer;
    private int year;
    private String owner;

    public Vehicle(String licensePlate, String manufacturer, int year, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.year = year;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public abstract String toCSV();

    @Override
    public String toString() {
        return "Biển kiểm soát: " + licensePlate +
                ", Tên hãng sản xuất: " + manufacturer +
                ", Năm sản xuất: " + year +
                ", Chủ sở hữu: " + owner;
    }
}
