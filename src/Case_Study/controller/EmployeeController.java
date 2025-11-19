package Case_Study.controller;

import Case_Study.entity.Employee;
import Case_Study.service.IEmployeeService;
import Case_Study.view.EmployeeView;

public class EmployeeController {

    private final IEmployeeService employeeService;
    private final EmployeeView view;

    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
        this.view = new EmployeeView();
    }

    public void menuEmployee() {
        while (true) {
            int choice = view.showMenu();

            if (choice == -1) {
                view.showError("Vui lòng nhập một số!");
                continue;
            }

            switch (choice) {
                case 1 -> showAllEmployees();
                case 2 -> addNewEmployee();
                case 3 -> editEmployee();
                case 4 -> {
                    view.showInfo("Trở về menu chính.");
                    return;
                }
                default -> view.showError("Lựa chọn không hợp lệ! Vui lòng thử lại.");
            }
        }
    }

    private void showAllEmployees() {
        view.displayEmployeeList(employeeService.getAll());
    }

    private void addNewEmployee() {
        view.showInfo("--- THÊM NHÂN VIÊN MỚI ---");
        Employee employee = view.inputEmployee(null);

        try {
            employeeService.add(employee);
            view.showSuccess("Đã thêm nhân viên thành công!");
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }

    private void editEmployee() {
        String id = view.inputEmployeeId();

        boolean exists = employeeService.getAll().stream()
                .anyMatch(e -> e.getId().equalsIgnoreCase(id));

        if (!exists) {
            view.showError("Không tìm thấy nhân viên có ID: " + id);
            return;
        }

        view.showInfo("Chỉnh sửa ID nhân viên: " + id);
        Employee updated = view.inputEmployee(id);

        try {
            employeeService.edit(updated);
            view.showSuccess("Nhân viên được cập nhật thành công!");
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }
}