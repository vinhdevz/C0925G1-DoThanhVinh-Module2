package Case_Study.service;

import Case_Study.entity.Customer;
import Case_Study.repository.CustomerRepository;
import Case_Study.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {

    private final ICustomerRepository customerRepository;

    public CustomerService() {
        this.customerRepository = new CustomerRepository();
    }

    @Override
    public void display() {
        customerRepository.display();
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public void edit(Customer customer) {
        customerRepository.edit(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }
}