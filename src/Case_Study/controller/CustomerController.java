package Case_Study.controller;

import Case_Study.entity.Customer;
import Case_Study.service.CustomerService;
import Case_Study.view.CustomerView;

import java.util.Scanner;

public class CustomerController {
    private final CustomerService serviceCus = new CustomerService();
    private final Scanner sc = new Scanner(System.in);

    public void runCus() {
        while (true) {
            CustomerView.displayMenuCus();
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Nhập số từ 1 đến 4 thôi nha!");
                continue;
            }

            switch (choice) {
                case 1:
                    serviceCus.display();
                    break;
                case 2:
                    Customer c = CustomerView.inputCustomer();
                    serviceCus.addNewCustomer(c);
                    System.out.println("Đã thêm khách hàng thành công!\n");
                    break;
                case 3:
                    System.out.print("Nhập mã khách hàng cần sửa (VD: KH-0001): ");
                    String id = sc.nextLine().trim();
                    serviceCus.editCustomer(id);
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