package Case_Study.service;

import Case_Study.entity.Employee;
import Case_Study.repository.EmployeeRepository;
import Case_Study.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {

    public static final IEmployeeRepository employeeRepository = new EmployeeRepository();


    @Override
    public void display() {
        employeeRepository.display();
    }

    @Override
    public void add(Employee item) {
        employeeRepository.add(item);
    }

    @Override
    public void edit(Employee item) {
        employeeRepository.edit(item);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.getAll();
    }
}
