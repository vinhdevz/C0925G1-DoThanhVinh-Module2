package Case_Study.view;

import Case_Study.entity.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {

    private final Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("------ CUSTOMER MANAGEMENT ------");
        System.out.println("1. Display customer list");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return main menu");
        System.out.print("Choose: ");
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void displayCustomerList(List<Customer> customers) {
        System.out.println("\n--- Danh sách khách hàng ---");
        if (customers.isEmpty()) {
            System.out.println("Không tìm thấy khách hàng nào!");
        } else {
            customers.forEach(System.out::println);
        }
        System.out.println("---------------------\n");
    }

    public String inputCustomerId() {
        System.out.print("Nhập ID khách hàng để chỉnh sửa: ");
        return scanner.nextLine().trim();
    }

    public Customer inputCustomer(String fixedId) {
        String id = fixedId;
        if (id == null) {
            while (true) {
                System.out.print("Mã khách hàng (C001, C002...): ");
                id = scanner.nextLine().trim();
                if (id.matches("^C\\d{3}$")) break;
                System.out.println("Định dạng không hợp lệ! Phải là C001, C002...");
            }
        } else {
            System.out.println("Mã khách hàng: " + id + " (không thể thay đổi)");
        }

        System.out.print("Full name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Date of birth (yyyy-MM-dd): ");
        String dob = scanner.nextLine().trim();

        System.out.print("Gender: ");
        String gender = scanner.nextLine().trim();

        System.out.print("ID Card: ");
        String idCard = scanner.nextLine().trim();

        System.out.print("Phone number: ");
        String phone = scanner.nextLine().trim();

        System.out.print("Email: ");
        String email = scanner.nextLine().trim();

        String customerType = selectCustomerType();

        System.out.print("Address: ");
        String address = scanner.nextLine().trim();

        return new Customer(id, name, dob, gender, idCard, phone, email, customerType, address);
    }

    private String selectCustomerType() {
        String[] types = {"Diamond", "Platinum", "Gold", "Silver", "Member"};
        System.out.println("CHỌN LOẠI CUSTOMER");
        for (int i = 0; i < types.length; i++) {
            System.out.printf(" %d. %s%n", i + 1, types[i]);
        }
        while (true) {
            System.out.printf("Chọn loại customer (1-5):");
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= 5) {
                    return types[choice - 1];
                }
                System.out.println("Không hợp lệ! Vui lòng nhập số từ 1 đến 5");
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
        }
    }

    public void showSuccess(String msg) {
        System.out.println("Success: " + msg);
    }

    public void showError(String msg) {
        System.out.println("Error: " + msg);
    }

    public void showInfo(String msg) {
        System.out.println("Info: " + msg);
    }
}