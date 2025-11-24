package Case_Study.view;

import Case_Study.entity.Booking;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BookingView {
    private final Scanner sc = new Scanner(System.in);
    private static final SimpleDateFormat vn_format = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat STORAGE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

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
        String startInput = sc.nextLine().trim();
        String startDate = convertToStorage(startInput);

        System.out.print("Ngày kết thúc (dd/MM/yyyy): ");
        String endInput = sc.nextLine().trim();
        String endDate = convertToStorage(endInput);

        String bookingCode = "BK-" + String.format("%04d", getNextId());

        System.out.print("BookingDate: (dd/MM/yyyy): ");
        String startBKInput = sc.nextLine().trim();
        String BookingDate= convertToStorage(startBKInput);


        return new Booking(bookingCode, BookingDate , startDate, endDate, customerCode, serviceCode);
    }

    private String convertToStorage(String inputDate) {
        try {
            Date date = vn_format.parse(inputDate);
            return STORAGE_FORMAT.format(date);
        } catch (Exception e) {
            System.out.println("Lỗi định dạng ngày, lưu nguyên bản: " + inputDate);
            return inputDate;
        }
    }

    public static String formatForDisplay(String storedDate) {
        try {
            Date date = STORAGE_FORMAT.parse(storedDate);
            return vn_format.format(date);
        } catch (Exception e) {
            return storedDate;
        }
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