package Case_Study.repository;

import Case_Study.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    private static final List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("E001", "Đỗ Thành Vinh", "1990-01-01", "Male",
                "123456789", "0901234567", "vinh@gmail.com", "Đại học", "Trưởng phòng", 20_000_000));
        employees.add(new Employee("E002", "Lê Thành Long", "1992-05-15", "Male",
                "198765432", "0902345678", "long@gmail.com", "Cao đẳng", "Phó phòng", 15_000_000));
        employees.add(new Employee("E003", "Nguyễn Thị Lan", "1995-08-20", "Female",
                "112233445", "0903456789", "lan@gmail.com", "Trung cấp", "Nhân viên", 8_000_000));
    }

    @Override
    public void display() {
        System.out.println("\n=== DANH SÁCH NHÂN VIÊN ===");
        if (employees.isEmpty()) {
            System.out.println("Chưa có nhân viên nào!");
            return;
        }
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Override
    public void add(Employee employee) {
        if (employees.stream().anyMatch(e -> e.getId().equals(employee.getId()))) {
            throw new IllegalArgumentException("Mã nhân viên đã tồn tại: " + employee.getId());
        }
        employees.add(employee);
        System.out.println("Thêm nhân viên thành công!");
    }

    @Override
    public void edit(Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(employee.getId())) {
                employees.set(i, employee);
                System.out.println("Sửa nhân viên thành công!");
                return;
            }
        }
        throw new IllegalArgumentException("Không tìm thấy nhân viên có mã: " + employee.getId());
    }

    @Override
    public List<Employee> getAll() {
        return new ArrayList<>(employees);
    }
}