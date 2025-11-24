package Case_Study.view;

import Case_Study.entity.Booking;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BookingView {
    private final Scanner sc = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\n===== BOOKING MANAGEMENT =====");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contract");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contract");
        System.out.println("6. Return main menu");
        System.out.print("Chọn (1-6): ");
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            return 0;
        }
    }

    public Booking inputNewBooking() {
        System.out.println("\n--- NHẬP THÔNG TIN BOOKING MỚI ---");
        System.out.print("Mã khách hàng: ");
        String customerCode = sc.nextLine().trim();

        System.out.print("Mã dịch vụ (SVVL-xxxx/SVHO-xxxx/SVRO-xxxx): ");
        String serviceCode = sc.nextLine().trim().toUpperCase();

        System.out.print("Ngày bắt đầu (dd/MM/yyyy): ");
        String startDate = sc.nextLine().trim();

        System.out.print("Ngày kết thúc (dd/MM/yyyy): ");
        String endDate = sc.nextLine().trim();

        String bookingCode = String.format("BK%04d", getNextId());
        String bookingDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());

        return new Booking(bookingCode, bookingDate, startDate, endDate, customerCode, serviceCode);
    }

    private static int idCounter = 1;
    private static int getNextId() {
        return idCounter++;
    }

    public void showSuccess(String msg) {
        System.out.println("THÀNH CÔNG → " + msg);
    }

    public void showError(String msg) {
        System.out.println("LỖI → " + msg);
    }
}