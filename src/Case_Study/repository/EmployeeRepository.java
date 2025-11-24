package Case_Study.repository;

import Case_Study.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository implements Repository<Employee> {

    private final List<Employee> employees = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    {
        employees.add(new Employee("NV-0001", "Nguyễn Văn A", "01/01/1990", "Nam",
                "123456789", "0905111222", "nva@gmail.com", "Đại học", "Lễ tân", 15000000));
        employees.add(new Employee("NV-0002", "Trần Thị B", "05/05/1995", "Nữ",
                "987654321", "0915222333", "ttb@gmail.com", "Cao đẳng", "Phục vụ", 8000000));
    }

    @Override
    public void display() {
        System.out.println("\nDANH SÁCH NHÂN VIÊN");
        System.out.println("=====================================================");

        if (employees.isEmpty()) {
            System.out.println("Hiện tại chưa có nhân viên nào.");
        } else {
            for (Employee e : employees) {
                System.out.println(e);
            }
        }

        System.out.println("=====================================================\n");
    }

    @Override
    public void add(Employee item) {
        employees.add(item);
        System.out.println("Thêm nhân viên thành công!");
    }

    @Override
    public void edit(String id) {
        for (Employee emp : employees) {
            if (emp.getId().equals(id)) {
                System.out.println("\nCHỈNH SỬA THÔNG TIN NHÂN VIÊN");
                System.out.println("Mã NV: " + emp.getId());
                System.out.println("(Để trống = giữ nguyên thông tin cũ)\n");

                System.out.print("Họ tên mới (" + emp.getName() + "): ");
                String input = sc.nextLine().trim();
                if (!input.isEmpty()) emp.setName(input);

                System.out.print("Ngày sinh mới (" + emp.getDateOfBirth() + "): ");
                input = sc.nextLine().trim();
                if (!input.isEmpty()) emp.setDateOfBirth(input);

                System.out.print("Giới tính mới (" + emp.getGender() + "): ");
                input = sc.nextLine().trim();
                if (!input.isEmpty()) emp.setGender(input);

                System.out.print("CCCD mới (" + emp.getIdCard() + "): ");
                input = sc.nextLine().trim();
                if (!input.isEmpty()) emp.setIdCard(input);

                System.out.print("Điện thoại mới (" + emp.getPhoneNumber() + "): ");
                input = sc.nextLine().trim();
                if (!input.isEmpty()) emp.setPhoneNumber(input);

                System.out.print("Email mới (" + emp.getEmail() + "): ");
                input = sc.nextLine().trim();
                if (!input.isEmpty()) emp.setEmail(input);

                System.out.println("\nTrình độ hiện tại: " + emp.getLevel());
                System.out.println("Các lựa chọn:");
                for (int i = 0; i < AllListFurama.level.size(); i++) {
                    System.out.println("  " + (i + 1) + ". " + AllListFurama.level.get(i));
                }
                System.out.print("Chọn trình độ mới (1-4) hoặc để trống: ");
                String choiceStr = sc.nextLine().trim();

                if (!choiceStr.isEmpty()) {
                    try {
                        int choice = Integer.parseInt(choiceStr);
                        if (choice >= 1 && choice <= AllListFurama.level.size()) {
                            emp.setLevel(AllListFurama.level.get(choice - 1));
                            System.out.println("Đã cập nhật trình độ: " + emp.getLevel());
                        } else {
                            System.out.println("Lựa chọn không hợp lệ → giữ nguyên.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Phải nhập số → giữ nguyên trình độ.");
                    }
                }

                System.out.println("\nVị trí hiện tại: " + emp.getPosition());
                System.out.println("Các lựa chọn:");
                for (int i = 0; i < AllListFurama.position.size(); i++) {
                    System.out.println("  " + (i + 1) + ". " + AllListFurama.position.get(i));
                }
                System.out.print("Chọn vị trí mới (1-6) hoặc để trống: ");
                choiceStr = sc.nextLine().trim();

                if (!choiceStr.isEmpty()) {
                    try {
                        int choice = Integer.parseInt(choiceStr);
                        if (choice >= 1 && choice <= AllListFurama.position.size()) {
                            emp.setPosition(AllListFurama.position.get(choice - 1));
                            System.out.println("Đã cập nhật vị trí: " + emp.getPosition());
                        } else {
                            System.out.println("Lựa chọn không hợp lệ → giữ nguyên.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Phải nhập số → giữ nguyên vị trí.");
                    }
                }

                System.out.print("Lương mới (" + emp.getSalary() + "): ");
                input = sc.nextLine().trim();
                if (!input.isEmpty()) {
                    try {
                        double salary = Double.parseDouble(input);
                        if (salary > 0) {
                            emp.setSalary(salary);
                        } else {
                            System.out.println("Lương phải lớn hơn 0 → không thay đổi.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Dữ liệu lương không hợp lệ → giữ nguyên.");
                    }
                }

                System.out.println("\nCẬP NHẬT THÔNG TIN NHÂN VIÊN THÀNH CÔNG!");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên có mã: " + id);
    }

    @Override
    public List<Employee> getAll() {
        return new ArrayList<>(employees);
    }
}