package Case_Study.controller;

import Case_Study.entity.Booking;
import Case_Study.service.BookingService;
import Case_Study.service.IBookingService;
import Case_Study.view.BookingView;

public class BookingController {

    private final IBookingService bookingService = new BookingService();
    private final BookingView view = new BookingView();

    public void runBook() {
        while (true) {
            int choice = view.showMenu();

            switch (choice) {
                case 1 -> {
                    Booking booking = view.inputNewBooking();
                    if (booking != null) {
                        bookingService.add(booking);
                        System.out.println("→ Thêm booking thành công!");
                    }
                }
                case 2 -> bookingService.display();
                case 3 -> bookingService.createContract();
                case 4 -> bookingService.displayContracts();
                case 5 -> bookingService.editContract();
                case 6 -> {
                    System.out.println("Quay lại menu chính...\n");
                    return;
                }
                default -> view.showError("Vui lòng chọn từ 1-6!");
            }
        }
    }
}