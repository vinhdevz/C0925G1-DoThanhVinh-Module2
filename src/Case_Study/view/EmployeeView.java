package Case_Study.view;

import Case_Study.entity.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {

    private final Scanner sc = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\n------ EMPLOYEE MANAGEMENT ------");
        System.out.println("1. Display list employee");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Return main menu");
        System.out.print("Choose: ");
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            return -1;
        }
    }

    public void displayEmployeeList(List<Employee> employees) {
        System.out.println("\n--- Danh sách nhân viên ---");
        if (employees.isEmpty()) {
            System.out.println("Không tìm thấy nhân viên nào!");
        } else {
            employees.forEach(System.out::println);
        }
        System.out.println("---------------------\n");
    }

    public String inputEmployeeId() {
        System.out.print("Nhập ID nhân viên để chỉnh sửa: ");
        return sc.nextLine().trim();
    }

    public Employee inputEmployee(String fixedId) {
        String id = fixedId;

        if (id == null) {
            while (true) {
                System.out.print("ID nhân viên (VD E001) ");
                id = sc.nextLine().trim();
                if (id.matches("^E\\d{3}$")) break;
                else System.out.println("Không hợp lệ! Phải là E001, E002...");
            }
        } else {
            System.out.println("ID nhân viên " + id + " (không thể thay đổi)");
        }

        System.out.print("Full name: ");
        String name = sc.nextLine().trim();

        System.out.print("Date of birth: (yyyy-MM-dd) ");
        String dob = sc.nextLine().trim();

        System.out.print("Gender: (Male/Female) ");
        String gender = sc.nextLine().trim();

        System.out.print("ID Card: ");
        String idCard = sc.nextLine().trim();

        System.out.print("Phone number: ");
        String phone = sc.nextLine().trim();

        System.out.print("Email: ");
        String email = sc.nextLine().trim();

        String level = chooseFromList("=== CHỌN TRÌNH ĐỘ ===",
                new String[]{"Trung cấp", "Cao đẳng", "Đại học", "Sau đại học"},
                "Vui lòng chọn số từ: (1-4)");

        String position = chooseFromList("=== CHỌN VỊ TRÍ ===",
                new String[]{"Lễ tân", "Phục vụ", "Chuyên viên", "Giám sát", "Quản lý", "Giám đốc"},
                "Vui lòng chọn số từ: (1-6)");

        double salary = 0;
        while (true) {
            System.out.print("Lương: (VND) ");
            try {
                salary = Double.parseDouble(sc.nextLine().trim());
                if (salary > 0) break;
                System.out.println("Mức lương phải tích cực!");
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
            }
        }

        return new Employee(id, name, dob, gender, idCard, phone, email, level, position, salary);
    }

    private String chooseFromList(String title, String[] options, String prompt) {
        System.out.println("\n" + title);
        for (int i = 0; i < options.length; i++) {
            System.out.printf("%d. %s%n", i +1, options[i]);
        }
        while (true) {
            System.out.print(prompt + " ");
            try {
                int choice = Integer.parseInt(sc.nextLine().trim());
                if (choice >= 1 && choice <= options.length) {
                    return options[choice - 1];
                }
                System.out.println("Không hợp lệ! Vui lòng chọn từ 1-" + options.length);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập một số!");
            }
        }
    }

    public void showSuccess(String msg) {
        System.out.println("Success: " + msg);
    }

    public void showError(String msg) {
        System.out.println("Error: " + msg);
    }

    public void showInfo(String msg) {
        System.out.println("Info: " + msg);
    }
}