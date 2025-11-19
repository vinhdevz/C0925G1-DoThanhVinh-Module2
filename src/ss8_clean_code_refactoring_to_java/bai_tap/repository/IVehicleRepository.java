package ss8_clean_code_refactoring_to_java.bai_tap.repository;

import ss8_clean_code_refactoring_to_java.bai_tap.entity.Vehicle;

public interface IVehicleRepository {
    Vehicle[] findAll();

    void add(Vehicle vehicle);

    boolean delete(String license);

    Vehicle[] searchByLicense(String keyword);
}
