package ss8_clean_code_refactoring_to_java.bai_tap.repository;

import ss8_clean_code_refactoring_to_java.bai_tap.entity.Vehicle;

public class VehicleRepository implements IVehicleRepository {

    private static Vehicle[] vehicles = new Vehicle[0];

    @Override
    public Vehicle[] findAll() {
        return vehicles;
    }

    @Override
    public void add(Vehicle vehicle) {
        Vehicle[] newArr = new Vehicle[vehicles.length + 1];
        for (int i = 0; i < vehicles.length; i++) {
            newArr[i] = vehicles[i];
        }
        newArr[newArr.length - 1] = vehicle;
        vehicles = newArr;
    }

    @Override
    public boolean delete(String license) {
        int index = findIndexByLicense(license);
        if (index == -1) {
            return false;
        }

        Vehicle[] newArr = new Vehicle[vehicles.length - 1];
        int newIndex = 0;
        for (int i = 0; i < vehicles.length; i++) {
            if (i != index) {
                newArr[newIndex++] = vehicles[i];
            }
        }
        vehicles = newArr;

        return true;
    }

    @Override
    public Vehicle[] searchByLicense(String keyword) {
        int count = 0;
        for (Vehicle v : vehicles) {
            if (v.getLicensePlate().toLowerCase().contains(keyword.toLowerCase())) {
                count++;
            }
        }

        if (count == 0) return new Vehicle[0];

        Vehicle[] result = new Vehicle[count];
        int index = 0;
        for (Vehicle v : vehicles) {
            if (v.getLicensePlate().toLowerCase().contains(keyword.toLowerCase())) {
                result[index++] = v;
            }
        }
        return result;
    }

    private int findIndexByLicense(String license) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getLicensePlate().equalsIgnoreCase(license)) {
                return i;
            }
        }
        return -1;
    }
}
