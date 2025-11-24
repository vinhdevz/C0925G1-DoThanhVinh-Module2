package ss8_clean_code_refactoring_to_java.bai_tap.repository;

import ss8_clean_code_refactoring_to_java.bai_tap.entity.Vehicle;

import java.util.List;

public interface IVehicleRepository {
    List<Vehicle> getAll();

    void addVehicle(Vehicle vehicle);

    void deleteVehicle(String licensePlate);

    void displayAll();

    void displayTruck();

    void displayCar();

    void displayMotorbike();

    Vehicle findByLicensePlate(String licensePlate);
}
