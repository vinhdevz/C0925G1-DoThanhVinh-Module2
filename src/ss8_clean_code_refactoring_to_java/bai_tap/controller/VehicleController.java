package ss8_clean_code_refactoring_to_java.bai_tap.controller;

import ss8_clean_code_refactoring_to_java.bai_tap.entity.Vehicle;
import ss8_clean_code_refactoring_to_java.bai_tap.service.IVehicleService;
import ss8_clean_code_refactoring_to_java.bai_tap.service.VehicleService;
import ss8_clean_code_refactoring_to_java.bai_tap.view.VehicleView;

import java.util.List;
import java.util.Scanner;

public class VehicleController {

    public static void displayMenu() {
        IVehicleService vehicleService = new VehicleService();

        final int ADD = 1;
        final int DISPLAY = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        final int EXIT = 5;

        Scanner scanner = new Scanner(System.in);
        boolean isNotExit = true;

        while (isNotExit) {
            System.out.println("=========== QUẢN LÝ PHƯƠNG TIỆN ===========");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiện thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm kiếm theo biển kiểm soát");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {

                case ADD:
                    Vehicle newVehicle = VehicleView.inputVehicleData();
                    vehicleService.add(newVehicle);
                    break;

                case DISPLAY:
                    List<Vehicle> list = vehicleService.findAll();
                    VehicleView.displayVehicleList(list);
                    break;

                case DELETE:
                    String licenseDelete = VehicleView.inputLicenseToDelete();
                    boolean deleted = vehicleService.delete(licenseDelete);
                    if (deleted) {
                        System.out.println("Đã xóa thành công!");
                    } else {
                        System.out.println("Không tìm thấy phương tiện!");
                    }
                    break;

                case SEARCH:
                    String keyword = VehicleView.inputLicenseForSearch();
                    Vehicle[] result = vehicleService.searchByLicense(keyword);
                    VehicleView.displayVehicleList(result);
                    break;

                case EXIT:
                    isNotExit = false;
                    break;

                default:
                    System.out.println("Chọn sai! Vui lòng nhập lại.");
            }
        }
    }
}
