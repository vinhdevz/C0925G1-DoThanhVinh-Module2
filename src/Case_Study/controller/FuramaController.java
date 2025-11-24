package Case_Study.controller;

import java.util.Scanner;

public class FuramaController {

    private static final Scanner sc = new Scanner(System.in);
    private static final EmployeeController employeeController = new EmployeeController();
    private static final CustomerController customerController = new CustomerController();
    private static final FacilityController facilityController = new FacilityController();
    private static final BookingController bookingController = new BookingController();


    public static void main(String[] args) {
        while (true) {
            System.out.println("\n========================================");
            System.out.println("FURAMA RESORT MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Quản lý nhân viên");
            System.out.println("2. Quản lý khách hàng");
            System.out.println("3. Quản lý cơ sở vật chất");
            System.out.println("4. Quản lý đặt chỗ");
            System.out.println("5. Quản lý khuyến mãi");
            System.out.println("6. Thoát chương trình");
            System.out.println("----------------------------------------");
            System.out.print("Nhập lựa chọn (1-6): ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Nhập số đi bạn ơi!");
                continue;
            }

            switch (choice) {
                case 1:
                    employeeController.runEm();
                    break;
                case 2:
                    customerController.runCus();
                    break;
                case 3:
                    facilityController.runFac();
                    break;
                case 4:
                    bookingController.runBook();
                    break;
                case 5:
                    System.out.println("Chức năng Khuyến mãi ");
                    break;
                case 6:
                    System.out.println("\nCảm ơn bạn đã sử dụng hệ thống Furama!");
                    System.out.println("Hẹn gặp lại đại ca!");
                    return;
                default:
                    System.out.println("Chỉ được chọn từ 1 đến 6 thôi nha!");
                    break;
            }
        }
    }
}