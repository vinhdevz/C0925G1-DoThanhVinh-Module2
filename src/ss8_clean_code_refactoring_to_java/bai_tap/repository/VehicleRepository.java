package ss8_clean_code_refactoring_to_java.bai_tap.repository;

import ss8_clean_code_refactoring_to_java.bai_tap.entity.Car;
import ss8_clean_code_refactoring_to_java.bai_tap.entity.MotorBike;
import ss8_clean_code_refactoring_to_java.bai_tap.util.ReadAndWriteFile;
import ss8_clean_code_refactoring_to_java.bai_tap.entity.Truck;
import ss8_clean_code_refactoring_to_java.bai_tap.entity.Vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VehicleRepository implements IVehicleRepository {

    private static final String VEHICLE_FILE = "src/ss8_clean_code_refactoring_to_java/bai_tap/data/vehicles.csv";

    private void writeAllToFile(List<Vehicle> vehicleList) {
        List<String> lines = new ArrayList<>();
        for (Vehicle v : vehicleList) {
            lines.add(v.toCSV());
        }
        ReadAndWriteFile.write(VEHICLE_FILE, lines);
    }

    @Override
    public List<Vehicle> getAll() {
        List<String> lines = ReadAndWriteFile.readFileCSVToStringList(VEHICLE_FILE);
        List<Vehicle> vehicleList = new ArrayList<>();

        for (String line : lines) {
            String[] arr = line.split(",", -1);

            switch (arr[0]) {
                case "Truck" ->
                        vehicleList.add(new Truck(
                                arr[1],
                                arr[2],
                                Integer.parseInt(arr[3]),
                                arr[4],
                                Integer.parseInt(arr[5])
                        ));

                case "Car" ->
                        vehicleList.add(new Car(
                                arr[1],
                                arr[2],
                                Integer.parseInt(arr[3]),
                                arr[4],
                                Integer.parseInt(arr[5]),
                                arr[6]
                        ));

                case "Motorbike" ->
                        vehicleList.add(new MotorBike(
                                arr[1],
                                arr[2],
                                Integer.parseInt(arr[3]),
                                arr[4],
                                Integer.parseInt(arr[5])
                        ));
            }
        }
        return vehicleList;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        List<String> oneLine = List.of(vehicle.toCSV());
        ReadAndWriteFile.write(VEHICLE_FILE, oneLine);
    }

    @Override
    public void deleteVehicle(String licensePlate) {
        List<Vehicle> list = getAll();
        boolean removed = list.removeIf(v -> Objects.equals(v.getLicensePlate(), licensePlate));

        if (removed) {
            writeAllToFile(list);
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Không tìm thấy biển số: " + licensePlate);
        }
    }

    @Override
    public void displayAll() {
        List<Vehicle> list = getAll();
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Vehicle v : list) {
            System.out.println(v);
        }
    }

    @Override
    public void displayTruck() {
        System.out.println("=== DANH SÁCH XE TẢI ===");
        getAll().stream()
                .filter(v -> v instanceof Truck)
                .forEach(System.out::println);
    }

    @Override
    public void displayCar() {
        System.out.println("=== DANH SÁCH Ô TÔ ===");
        getAll().stream()
                .filter(v -> v instanceof Car)
                .forEach(System.out::println);
    }

    @Override
    public void displayMotorbike() {
        System.out.println("=== DANH SÁCH XE MÁY ===");
        getAll().stream()
                .filter(v -> v instanceof MotorBike)
                .forEach(System.out::println);
    }

    @Override
    public Vehicle findByLicensePlate(String licensePlate) {
        return getAll().stream()
                .filter(v -> Objects.equals(v.getLicensePlate(), licensePlate))
                .findFirst()
                .orElse(null);
    }

}