package Case_Study.view;

import Case_Study.entity.House;
import Case_Study.entity.Room;
import Case_Study.entity.Villa;
import Case_Study.repository.FacilityRepository;

import java.util.Scanner;

public class FacilityView {
    private static final Scanner sc = new Scanner(System.in);
    private static final FacilityRepository repo = FacilityRepository.getInstance();

    public static void displayMenuFacility() {
        System.out.println("\nQUẢN LÝ CƠ SỞ VẬT CHẤT");
        System.out.println("1. Hiển thị danh sách dịch vụ");
        System.out.println("2. Thêm mới dịch vụ");
        System.out.println("3. Hiển thị danh sách dịch vụ bảo trì");
        System.out.println("4. Quay lại menu chính");
        System.out.print("Chọn (1-4): ");
    }

    public static Villa inputVilla() {
        System.out.println("Nhập mã dịch vụ: ");
        String code = sc.nextLine();
        System.out.print("Tên dịch vụ: ");
        String name = sc.nextLine();
        System.out.print("Diện tích: ");
        double area = Double.parseDouble(sc.nextLine());
        System.out.print("Chi phí thuê: ");
        double cost = Double.parseDouble(sc.nextLine());
        System.out.print("Số người tối đa: ");
        int people = Integer.parseInt(sc.nextLine());
        System.out.print("Kiểu thuê: ");
        String rental = sc.nextLine();
        System.out.print("Tiêu chuẩn phòng: ");
        String standard = sc.nextLine();
        System.out.print("Diện tích hồ bơi: ");
        double pool = Double.parseDouble(sc.nextLine());
        System.out.print("Số tầng: ");
        int floors = Integer.parseInt(sc.nextLine());
        return new Villa(code, name, area, cost, people, rental, standard, pool, floors);
    }

    public static House inputHouse() {
        System.out.println("Nhập mã dịch vụ: ");
        String code = sc.nextLine();
        System.out.print("Tên dịch vụ: ");
        String name = sc.nextLine();
        System.out.print("Diện tích: ");
        double area = Double.parseDouble(sc.nextLine());
        System.out.print("Chi phí thuê: ");
        double cost = Double.parseDouble(sc.nextLine());
        System.out.print("Số người tối đa: ");
        int people = Integer.parseInt(sc.nextLine());
        System.out.print("Kiểu thuê: ");
        String rental = sc.nextLine();
        System.out.print("Tiêu chuẩn phòng: ");
        String standard = sc.nextLine();
        System.out.print("Số tầng: ");
        int floors = Integer.parseInt(sc.nextLine());
        return new House(code, name, area, cost, people, rental, standard, floors);
    }

    public static Room inputRoom() {
        System.out.println("Nhập mã dịch vụ: ");
        String code = sc.nextLine();
        System.out.print("Tên dịch vụ: ");
        String name = sc.nextLine();
        System.out.print("Diện tích: ");
        double area = Double.parseDouble(sc.nextLine());
        System.out.print("Chi phí thuê: ");
        double cost = Double.parseDouble(sc.nextLine());
        System.out.print("Số người tối đa: ");
        int people = Integer.parseInt(sc.nextLine());
        System.out.print("Kiểu thuê: ");
        String rental = sc.nextLine();
        System.out.print("Dịch vụ miễn phí: ");
        String free = sc.nextLine();
        return new Room(code, name, area, cost, people, rental, free);
    }
}