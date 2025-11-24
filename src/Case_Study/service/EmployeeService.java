package Case_Study.service;

import Case_Study.entity.Employee;
import Case_Study.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private final EmployeeRepository emrepo = new EmployeeRepository();

    public void display() {
        emrepo.display();
    }

    public void addNewEmployee(Employee item) {
        emrepo.add(item);
    }

    public void editEmployee(String id) {
        emrepo.edit(id);
    }

    public List<Employee> getAll() {
        return emrepo.getAll();
    }
}