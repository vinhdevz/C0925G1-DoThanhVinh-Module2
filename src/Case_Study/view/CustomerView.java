package Case_Study.view;

import Case_Study.entity.Customer;
import Case_Study.repository.AllListFurama;

import java.util.Scanner;

public class CustomerView {
    private static final Scanner sc = new Scanner(System.in);

    public static void displayMenuCus() {
        System.out.println("\nQUẢN LÝ KHÁCH HÀNG");
        System.out.println("=====================================");
        System.out.println("1. Hiển thị danh sách khách hàng");
        System.out.println("2. Thêm khách hàng mới");
        System.out.println("3. Chỉnh sửa khách hàng");
        System.out.println("4. Quay lại menu chính");
        System.out.println("=====================================");
        System.out.print("Nhập lựa chọn của bạn (1-4): ");
    }

    public static Customer inputCustomer() {
        System.out.println("\nTHÊM KHÁCH HÀNG MỚI");
        System.out.println("-------------------------------");

        System.out.println("Mã khách hàng (VD: KH-0001): ");
        String id = sc.nextLine().trim();

        System.out.println("Họ và tên: ");
        String name = sc.nextLine().trim();

        System.out.println("Ngày sinh (dd/MM/yyyy): ");
        String dob = sc.nextLine().trim();

        System.out.println("Giới tính (Female/Male): ");
        String gender = sc.nextLine().trim();

        System.out.print("Số CMND/CCCD: ");
        String idCard = sc.nextLine().trim();

        System.out.print("Số điện thoại: ");
        String phone = sc.nextLine().trim();

        System.out.print("Email: ");
        String email = sc.nextLine().trim();

        System.out.println("\nLoại khách:");
        for (int i = 0; i < AllListFurama.typeCustomer.size(); i++) {
            System.out.println((i + 1) + ". " + AllListFurama.typeCustomer.get(i));
        }

        System.out.print("Nhập số (1-5): ");
        int typeChoice = Integer.parseInt(sc.nextLine());
        String typeCustomer = AllListFurama.typeCustomer.get(typeChoice - 1);

        System.out.println("Địa chỉ: ");
        String address = sc.nextLine().trim();

        return new Customer(id, name, dob, gender, idCard, phone, email, typeCustomer, address);
    }


}