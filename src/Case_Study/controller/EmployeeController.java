package Case_Study.controller;

import Case_Study.entity.Employee;
import Case_Study.service.EmployeeService;
import Case_Study.view.EmployeeView;

import java.util.Scanner;

public class EmployeeController {
    private final EmployeeService serviceEmp = new EmployeeService();
    private final Scanner sc = new Scanner(System.in);

    public void runEm() {
        while (true) {
            EmployeeView.displayMenuEm();
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Nhập số từ 1 đến 4 thôi nha!");
                continue;
            }

            switch (choice) {
                case 1:
                    serviceEmp.display();
                    break;
                case 2:
                    Employee e = EmployeeView.inputEmployee();
                    serviceEmp.addNewEmployee(e);
                    System.out.println("Đã thêm nhân viên thành công!\n");
                    break;
                case 3:
                    System.out.print("Nhập mã nhân viên cần sửa (VD: NV-0001): ");
                    String id = sc.nextLine().trim();
                    serviceEmp.editEmployee(id);
                    break;
                case 4:
                    System.out.println("Đang quay lại menu chính...\n");
                    return;
                default:
                    System.out.println("Chỉ chọn từ 1 đến 4 thôi nha đại ca!");
                    break;
            }
        }
    }
}