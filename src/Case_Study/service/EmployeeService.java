package Case_Study.service;
import entity.Employee;
import service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {

    private static List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void update(String id, Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)) {
                employees.set(i, employee);
                break;
            }
        }
    }

    @Override
    public Employee getById(String id) {
        for (Employee e : employees) {
            if (e.getId().equals(id)) return e;
        }
        return null;
    }

    @Override
    public void delete(String id) {
        employees.removeIf(e -> e.getId().equals(id));
    }
}
