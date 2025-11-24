package Case_Study.service;

import Case_Study.entity.Customer;
import Case_Study.repository.CustomerRepository;

import java.util.List;

public class CustomerService {
    private final CustomerRepository cusrepo = new CustomerRepository();


    public void display() {
        cusrepo.display();
    }

    public void addNewCustomer(Customer item) {
        cusrepo.add(item);
    }

    public void editCustomer(String id) {
        cusrepo.edit(id);
    }

    public List<Customer> getAll() {
        return cusrepo.getAll();
    }
}