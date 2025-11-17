package ss8_clean_code_refactoring_to_java.bai_tap.service;

import ss8_clean_code_refactoring_to_java.bai_tap.entity.Vehicle;
import ss8_clean_code_refactoring_to_java.bai_tap.repository.IVehicleRepository;
import ss8_clean_code_refactoring_to_java.bai_tap.repository.VehicleRepository;

public class VehicleService implements IVehicleService{

    private IVehicleRepository vehicleRepository = new VehicleRepository();

    @Override
    public Vehicle[] findAll() {
        return vehicleRepository.findAll();
    }

    @Override
    public void add(Vehicle vehicle) {
        vehicleRepository.add(vehicle);
    }

    @Override
    public boolean delete(String license) {
        return vehicleRepository.delete(license);
    }

    @Override
    public Vehicle[] searchByLicense(String keyword) {
        return vehicleRepository.searchByLicense(keyword);
    }
}
