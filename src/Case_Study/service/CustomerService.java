package Case_Study.service;

import Case_Study.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService{
    private static List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void update(String id, Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(id)) {
                customers.set(i, customer);
                break;
            }
        }
    }

    @Override
    public Customer getById(String id) {
        for (Customer c : customers) {
            if (c.getId().equals(id)) return c;
        }
        return null;
    }

    @Override
    public void delete(String id) {
        customers.removeIf(c -> c.getId().equals(id));
    }
}
