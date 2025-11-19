package Case_Study.repository;

import Case_Study.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    private static final List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(
                "C001", "Nguyễn Văn A", "1995-02-15", "Male",
                "111222333", "0901122334", "a@gmail.com",
                "Diamond", "Hà Nội"
        ));
        customers.add(new Customer(
                "C002", "Trần Thị B", "1998-07-10", "Female",
                "444555666", "0902233445", "b@gmail.com",
                "Gold", "Đà Nẵng"
        ));
        customers.add(new Customer(
                "C003", "Lê Văn C", "1985-11-30", "Male",
                "777888999", "0903344556", "c@gmail.com",
                "Silver", "HCM"
        ));
    }

    @Override
    public List<Customer> getAll() {
        return new ArrayList<>(customers);
    }

    @Override
    public void display() {
        System.out.println("\n--- Danh sách khách hàng ---");
        if (customers.isEmpty()) {
            System.out.println("Không tìm thấy khách hàng nào!");
        } else {
            customers.forEach(System.out::println);
        }
        System.out.println("-----------------------------\n");
    }

    @Override
    public void add(Customer item) {
        if (item == null) {
            throw new IllegalArgumentException("Khách hàng không được để trống!");
        }
        if (customers.stream().anyMatch(c -> c.getId().equals(item.getId()))) {
            throw new IllegalArgumentException("Mã khách hàng đã tồn tại: " + item.getId());
        }
        customers.add(item);
    }

    @Override
    public void edit(Customer item) {
        if (item == null) {
            throw new IllegalArgumentException("Khách hàng không được để trống!");
        }
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(item.getId())) {
                customers.set(i, item);
                return;
            }
        }
        throw new IllegalArgumentException("Không tìm thấy khách hàng với mã: " + item.getId());
    }
}