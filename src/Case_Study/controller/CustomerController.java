package Case_Study.controller;

import Case_Study.entity.Customer;
import Case_Study.service.ICustomerService;
import Case_Study.view.CustomerView;

public class CustomerController {

    private final ICustomerService customerService;
    private final CustomerView view;

    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
        this.view = new CustomerView();
    }

    public void menuCustomer() {
        while (true) {
            int choice = view.showMenu();
            if (choice == -1) {
                view.showError("Vui lòng nhập một số!");
                continue;
            }

            switch (choice) {
                case 1 -> view.displayCustomerList(customerService.getAll());
                case 2 -> addNewCustomer();
                case 3 -> editCustomer();
                case 4 -> {
                    view.showInfo("Trở về menu chính.");
                    return;
                }
                default -> view.showError("Lựa chọn không hợp lệ!");
            }
        }
    }

    private void addNewCustomer() {
        view.showInfo("--- THÊM KHÁCH HÀNG MỚI ---");
        Customer customer = view.inputCustomer(null);
        try {
            customerService.add(customer);
            view.showSuccess("Khách hàng được thêm thành công!");
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }

    private void editCustomer() {
        String id = view.inputCustomerId();
        boolean exists = customerService.getAll().stream()
                .anyMatch(c -> c.getId().equalsIgnoreCase(id));
        if (!exists) {
            view.showError("Không tìm thấy khách hàng có ID: " + id);
            return;
        }
        view.showInfo("Chỉnh sửa ID khách hàng: " + id);
        Customer updated = view.inputCustomer(id);
        try {
            customerService.edit(updated);
            view.showSuccess("Khách hàng đã cập nhật thành công!");
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }
}