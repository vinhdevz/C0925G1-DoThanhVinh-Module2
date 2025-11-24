package ss8_clean_code_refactoring_to_java.bai_tap.service;

import ss8_clean_code_refactoring_to_java.bai_tap.entity.Vehicle;

import java.util.List;

public interface IVehicleService {
    List<Vehicle> findAll();

    void add(Vehicle vehicle);

    boolean delete(String license);

    Vehicle[] searchByLicense(String keyword);
}
