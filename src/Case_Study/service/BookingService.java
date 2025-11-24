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
            customerCode = sc.nextLine().trim();
            if (customerRepo.findByCode(customerCode) == null) {
                System.out.println("Mã khách hàng không tồn tại!");
            }
        } while (customerRepo.findByCode(customerCode) == null);

        System.out.println("\n--- DANH SÁCH DỊCH VỤ ---");
        facilityRepo.display();
        String serviceCode;
        do {
            System.out.print("Nhập mã dịch vụ: ");
            serviceCode = sc.nextLine().trim();
            if (facilityRepo.findByCode(serviceCode) == null) {
                System.out.println("Mã dịch vụ không tồn tại!");
            }
        } while (facilityRepo.findByCode(serviceCode) == null);

        String bookingCode;
        do {
            System.out.print("Nhập mã booking (BK-xxxx): ");
            bookingCode = sc.nextLine().trim();
            if (bookingRepo.findByCode(bookingCode) != null) {
                System.out.println("Mã booking đã tồn tại!");
            }
        } while (bookingRepo.findByCode(bookingCode) != null);

        System.out.print("Ngày đặt booking (yyyy-MM-dd): ");
        String bookingDate = sc.nextLine();
        System.out.print("Ngày bắt đầu thuê (yyyy-MM-dd): ");
        String startDate = sc.nextLine();
        System.out.print("Ngày kết thúc thuê (yyyy-MM-dd): ");
        String endDate = sc.nextLine();

        Booking newBooking = new Booking(bookingCode, bookingDate, startDate, endDate, customerCode, serviceCode);
        bookingRepo.add(newBooking);
    }

    @Override
    public void edit(String id) {
    }

    @Override
    public java.util.List<Booking> getAll() {
        return bookingRepo.getAll();
    }

    @Override
    public void createContract() {

    }

    @Override
    public void editContract() {

    }

    @Override
    public void displayContracts() {

    }

    public Queue<Booking> getQueueForContract() {
        return bookingRepo.getBookingQueue();
    }
}