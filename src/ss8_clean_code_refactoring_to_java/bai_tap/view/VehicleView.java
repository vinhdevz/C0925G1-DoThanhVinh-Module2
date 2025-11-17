package ss8_clean_code_refactoring_to_java.bai_tap.view;

import ss8_clean_code_refactoring_to_java.bai_tap.entity.Car;
import ss8_clean_code_refactoring_to_java.bai_tap.entity.MotorBike;
import ss8_clean_code_refactoring_to_java.bai_tap.entity.Truck;
import ss8_clean_code_refactoring_to_java.bai_tap.entity.Vehicle;

import java.util.Scanner;

public class VehicleView {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayVehicleList(Vehicle[] vehicles) {
        if (vehicles == null || vehicles.length == 0) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public static Vehicle inputVehicleData() {
        System.out.println("Chọn loại phương tiện:");
        System.out.println("1. Xe tải");
        System.out.println("2. Ô tô");
        System.out.println("3. Xe máy");
        System.out.print("Chọn: ");

        int type = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập biển kiểm soát: ");
        String license = scanner.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên chủ sở hữu: ");
        String owner = scanner.nextLine();

        switch (type) {
            case 1: // Xe tải
                System.out.print("Nhập trọng tải: ");
                int load = Integer.parseInt(scanner.nextLine());
                return new Truck(license, manufacturer, year, owner, load);

            case 2: // Ô tô
                System.out.print("Nhập số chỗ ngồi: ");
                int seats = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập kiểu xe (du lịch / xe khách): ");
                String carType = scanner.nextLine();
                return new Car(license, manufacturer, year, owner, seats, carType);

            case 3: // Xe máy
                System.out.print("Nhập công suất: ");
                int power = Integer.parseInt(scanner.nextLine());
                return new MotorBike(license, manufacturer, year, owner, power);

            default:
                System.out.println("Lựa chọn không hợp lệ.");
                return null;
        }
    }


    public static String inputLicenseToDelete() {
        System.out.println("Nhập biển kiểm soát cần xóa:");
        return scanner.nextLine();
    }

    public static String inputLicenseForSearch() {
        System.out.println("Nhập biển kiểm soát cần tìm:");
        return scanner.nextLine();
    }
}
