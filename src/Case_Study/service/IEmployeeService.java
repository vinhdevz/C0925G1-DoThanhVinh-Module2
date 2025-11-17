package Case_Study.service;

import Case_Study.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAll();

    void add(Employee employee);

    void update(String id, Employee employee);

    Employee getById(String id);

    void delete(String id);
}
