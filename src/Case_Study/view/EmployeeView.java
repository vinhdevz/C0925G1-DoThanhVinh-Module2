package Case_Study.view;

import Case_Study.entity.Employee;
import Case_Study.repository.AllListFurama;

import java.util.Scanner;

public class EmployeeView {
    private static final Scanner sc = new Scanner(System.in);

    public static void displayMenuEm() {
        System.out.println("\nQUẢN LÝ NHÂN VIÊN");
        System.out.println("=====================================");
        System.out.println("1. Hiển thị danh sách nhân viên");
        System.out.println("2. Thêm nhân viên mới");
        System.out.println("3. Chỉnh sửa nhân viên");
        System.out.println("4. Quay lại menu chính");
        System.out.println("=====================================");
        System.out.print("Nhập lựa chọn (1-4): ");
    }

    public static Employee inputEmployee() {
        System.out.println("\nTHÊM NHÂN VIÊN MỚI");
        System.out.println("-------------------------------------");

        System.out.print("Mã nhân viên (VD: NV-0001): ");
        String id = sc.nextLine().trim();

        System.out.print("Họ và tên: ");
        String name = sc.nextLine().trim();

        System.out.print("Ngày sinh (dd/MM/yyyy): ");
        String dob = sc.nextLine().trim();

        System.out.println("Giới tính (Female/Male): ");
        String gender = sc.nextLine().trim();

        System.out.print("Số CMND/CCCD: ");
        String idCard = sc.nextLine().trim();

        System.out.print("Số điện thoại: ");
        String phone = sc.nextLine().trim();

        System.out.print("Email: ");
        String email = sc.nextLine().trim();

        System.out.println("\nChọn trình độ:");
        for (int i = 0; i < AllListFurama.level.size(); i++) {
            System.out.println((i + 1) + ". " + AllListFurama.level.get(i));
        }
        System.out.print("Nhập số (1-4): ");
        int levelChoice = Integer.parseInt(sc.nextLine());
        String level = AllListFurama.level.get(levelChoice - 1);

        System.out.println("\nChọn vị trí công việc:");
        for (int i = 0; i < AllListFurama.position.size(); i++) {
            System.out.println((i + 1) + ". " + AllListFurama.position.get(i));
        }
        System.out.print("Nhập số (1-6): ");
        int positionChoice = Integer.parseInt(sc.nextLine());
        String position = AllListFurama.position.get(positionChoice - 1);

        System.out.print("\nNhập mức lương: ");
        double salary = Double.parseDouble(sc.nextLine());

        return new Employee(id, name, dob, gender, idCard, phone, email, level, position, salary);
    }
}