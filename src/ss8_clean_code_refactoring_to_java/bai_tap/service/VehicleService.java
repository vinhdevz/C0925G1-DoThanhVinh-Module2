package ss8_clean_code_refactoring_to_java.bai_tap.service;

import ss8_clean_code_refactoring_to_java.bai_tap.entity.Vehicle;
import ss8_clean_code_refactoring_to_java.bai_tap.repository.IVehicleRepository;
import ss8_clean_code_refactoring_to_java.bai_tap.repository.VehicleRepository;

import java.util.ArrayList;
import java.util.List;

public class VehicleService implements IVehicleService {

    private IVehicleRepository vehicleRepository = new VehicleRepository();

    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.getAll();
    }

    @Override
    public void add(Vehicle vehicle) {
        vehicleRepository.addVehicle(vehicle);
    }

    @Override
    public boolean delete(String license) {
        vehicleRepository.deleteVehicle(license);
        return true;
    }

    @Override
    public Vehicle[] searchByLicense(String keyword) {
        List<Vehicle> all = vehicleRepository.getAll();
        List<Vehicle> result = new ArrayList<>();

        for (Vehicle v : all) {
            if (v.getLicensePlate().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(v);
            }
        }
        return result.toArray(new Vehicle[0]);
    }
}
