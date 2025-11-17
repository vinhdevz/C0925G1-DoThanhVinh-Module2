package Case_Study.service;

import Case_Study.entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
    void add(Customer customer);
    void update(String id, Customer customer);
    Customer getById(String id);
    void delete(String id);
}
