package Case_Study.service;

import Case_Study.entity.Booking;
import Case_Study.repository.BookingRepository;
import Case_Study.repository.CustomerRepository;
import Case_Study.repository.FacilityRepository;
import java.util.Queue;
import java.util.Scanner;

public class BookingService implements IBookingService {

    private final BookingRepository bookingRepo = new BookingRepository();
    private final CustomerRepository customerRepo = new CustomerRepository();
    private final FacilityRepository facilityRepo = new FacilityRepository();
    private final Scanner sc = new Scanner(System.in);
    private final IContractService contractService = new ContractService();
    private final Queue<Booking> contractQueue = getQueueForContract();

    @Override
    public void display() {
        bookingRepo.display();
    }

    @Override
    public void add(Booking booking) {
        bookingRepo.add(booking);
    }

    public void addNewBooking() {
        System.out.println("\n=== THÊM MỚI BOOKING ===");

        System.out.println("--- DANH SÁCH KHÁCH HÀNG ---");
        customerRepo.display();
        String customerCode;
        do {
            System.out.print("Nhập mã khách hàng: ");
            customerCode = sc.nextLine().trim().toUpperCase();
            if (customerRepo.findByCode(customerCode) == null) {
                System.out.println("Mã khách hàng không tồn tại!");
            }
        } while (customerRepo.findByCode(customerCode) == null);

        System.out.println("\n--- DANH SÁCH DỊCH VỤ ---");
        facilityRepo.display();
        String serviceCode;
        do {
            System.out.print("Nhập mã dịch vụ: ");
            serviceCode = sc.nextLine().trim().toUpperCase();
            if (facilityRepo.findByCode(serviceCode) == null) {
                System.out.println("Mã dịch vụ không tồn tại!");
            }
        } while (facilityRepo.findByCode(serviceCode) == null);

        String bookingCode;
        do {
            System.out.print("Nhập mã booking (VD: BK-0001): ");
            bookingCode = sc.nextLine().trim().toUpperCase();
            if (bookingRepo.findByCode(bookingCode) != null) {
                System.out.println("Mã booking đã tồn tại!");
            }
        } while (bookingRepo.findByCode(bookingCode) != null);

        String bookingDate = nhapNgay("Ngày đặt booking (dd/MM/yyyy): ");
        String startDate   = nhapNgay("Ngày bắt đầu thuê (dd/MM/yyyy): ");
        String endDate     = nhapNgay("Ngày kết thúc thuê (dd/MM/yyyy): ");

        if (endDate.compareTo(startDate) <= 0) {
            System.out.println("LỖI: Ngày kết thúc phải sau ngày bắt đầu!");
            return;
        }

        for (Booking b : bookingRepo.getAll()) {
            if (b.getCustomerCode().equals(customerCode) &&
                    b.getServiceCode().equals(serviceCode) &&
                    !(endDate.compareTo(b.getStartDate()) < 0 || startDate.compareTo(b.getEndDate()) > 0)) {
                System.out.println("LỖI: Khách hàng đã đặt dịch vụ này trong thời gian đó rồi!");
                return;
            }
        }

        Booking newBooking = new Booking(bookingCode, bookingDate, startDate, endDate, customerCode, serviceCode);
        bookingRepo.add(newBooking);
        System.out.println("→ Thêm booking thành công! Ngày đặt: " + formatDisplayDate(bookingDate));
    }

    private String nhapNgay(String msg) {
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine().trim();
            if (input.matches("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/20\\d{2}")) {
                String[] p = input.split("/");
                return p[0] + "-" + p[1] + "-" + p[2];
            }
            System.out.println("SAI! Nhập lại đúng định dạng dd/MM/yyyy (VD: 25/12/2025)");
        }
    }

    @Override
    public void edit(String id) {}

    @Override
    public java.util.List<Booking> getAll() {
        return bookingRepo.getAll();
    }

    @Override
    public void createContract() {
        if (contractQueue.isEmpty()) {
            System.out.println("Không còn booking nào để tạo hợp đồng!");
            return;
        }
        Booking booking = contractQueue.peek();
        System.out.println("\nTạo hợp đồng cho booking:");
        System.out.println(booking);
        System.out.print("Xác nhận? (y/n): ");
        if (sc.nextLine().trim().equalsIgnoreCase("y")) {
            contractService.createContract(booking.getBookingCode());
            contractQueue.poll();
            System.out.println("→ TẠO HỢP ĐỒNG THÀNH CÔNG!");
        } else {
            System.out.println("Đã hủy.");
        }
    }

    @Override
    public void editContract() {
        contractService.editContract();
    }

    @Override
    public void displayContracts() {
        contractService.displayContracts();
    }

    public Queue<Booking> getQueueForContract() {
        return bookingRepo.getBookingQueue();
    }

    private String formatDisplayDate(String yyyy_MM_dd) {
        String[] p = yyyy_MM_dd.split("-");
        return p[2] + "/" + p[1] + "/" + p[0];
    }
}