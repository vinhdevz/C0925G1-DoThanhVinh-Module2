package Case_Study.repository;

import Case_Study.entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerRepository implements Repository<Customer> {
    private final List<Customer> customers = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);


    {
        customers.add(new Customer("KH-0001", "Lê Hải Vân", "03/02/2004", "Nữ", "123423412", "0231231111", "van@gmail.com", "Gold", "QT"));
        customers.add(new Customer("KH-0002", "Đỗ Quỳnh", "03/06/2004", "Nữ", "123455412", "0231231444", "q@gmail.com", "Silver", "HN"));
    }

    @Override
    public void display() {
        System.out.println("\nDANH SÁCH KHÁCH HÀNG");
        System.out.println("============================");

        if (customers.isEmpty()) {
            System.out.println("Hiện tại chưa có khách hàng nào.");
        } else {
            for (Customer c : customers) {
                System.out.println(c);
            }
        }
        System.out.println("============================");
    }

    @Override
    public void add(Customer item) {
        customers.add(item);
        System.out.println("Thêm khách hàng thành công!");
    }

    @Override
    public void edit(String id) {
        for (Customer cus : customers) {
            if (cus.getId().equals(id)) {
                System.out.println("\nCHỈNH SỬA THÔNG TIN KHÁCH HÀNG");
                System.out.println("Mã KH: " + cus.getId());
                System.out.println(" ");

                System.out.println("Họ tên mới (" + cus.getName() + "): ");
                String input = sc.nextLine().trim();
                if (!input.isEmpty()) cus.setName(input);

                System.out.println("Ngày sinh mới (" + cus.getDateOfBirth() + "): ");
                input = sc.nextLine().trim();
                if (!input.isEmpty()) cus.setDateOfBirth(input);

                System.out.println("Giới tính mới (" + cus.getGender() + "): ");
                input = sc.nextLine().trim();
                if (!input.isEmpty()) cus.setGender(input);

                System.out.println("CCCD mới (" + cus.getIdCard() + "): ");
                input = sc.nextLine().trim();
                if (!input.isEmpty()) cus.setIdCard(input);

                System.out.println("Số điện thoại mới (" + cus.getPhoneNumber() + "): ");
                input = sc.nextLine().trim();
                if (!input.isEmpty()) cus.setPhoneNumber(input);

                System.out.println("Email mới (" + cus.getEmail() + "): ");
                input = sc.nextLine().trim();
                if (!input.isEmpty()) cus.setEmail(input);

                System.out.println("\nLoại khách hiện tại: " + cus.getCustomerType());
                System.out.println("Các lựa chọn: ");
                for (int i = 0; i < AllListFurama.typeCustomer.size(); i++) {
                    System.out.println(" " + (i + 1) + ". " + AllListFurama.typeCustomer.get(i));
                }
                System.out.println("Chọn loại khách mới (1-5) hoặc để trống: ");
                String choiceStr = sc.nextLine().trim();

                if (!choiceStr.isEmpty()) {
                    try {
                        int choice = Integer.parseInt(choiceStr);
                        if (choice >= 1 && choice <= AllListFurama.typeCustomer.size()) {
                            cus.setCustomerType(AllListFurama.typeCustomer.get(choice - 1));
                            System.out.println("Đã cập nhật loại khách hàng: " + cus.getCustomerType());
                        } else {
                            System.out.println("Lựa chọn không hợp lệ");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Phải nhập số!");
                    }
                }

                System.out.println("Địa chỉ mới (" + cus.getAddress() + "): ");
                input = sc.nextLine().trim();
                if (!input.isEmpty()) cus.setAddress(input);
            }
        }
    }

    @Override
    public List<Customer> getAll() {
        return new ArrayList<>(customers);
    }

    public Customer findByCode(String code) {
        for (Customer c : customers) {
            if (c.getCustomerCode().equals(code)) {
                return c;
            }
        }
        return null;
    }
}
