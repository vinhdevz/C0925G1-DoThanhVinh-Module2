// Case_Study/repository/BookingRepository.java
package Case_Study.repository;

import Case_Study.entity.Booking;
import Case_Study.util.BookingComparator;

import java.util.*;

public class BookingRepository implements Repository<Booking> {

    private static final Set<Booking> bookings = new TreeSet<>(
            Comparator
                    .comparing(Booking::getBookingDate)
                    .thenComparing(Booking::getCustomerCode)
    );

    static {
        bookings.add(new Booking("BK-0001", "20-12-2025", "01-12-2025", "05-12-2025", "KH-0001", "SVVL-0001"));
        bookings.add(new Booking("BK-0002", "21-12-2025", "02-12-2025", "10-12-2025", "KH-0002", "SVHO-0001"));
        bookings.add(new Booking("BK-0003", "22-12-2025", "03-12-2025", "15-12-2025", "KH-0002", "SVHO-0001"));

    }

    @Override
    public void display() {
        if (bookings.isEmpty()) {
            System.out.println("Chưa có booking nào!");
            return;
        }
        System.out.println("\n=== DANH SÁCH BOOKING ===");
        for (Booking b : bookings) {
            System.out.println(b);
        }
        System.out.println();
    }

    @Override
    public void add(Booking booking) {
        if (!bookings.add(booking)) {
            System.out.println("→ Booking " + booking.getBookingCode() + " đã tồn tại! Không thể thêm.");
        } else {
            System.out.println("→ Thêm booking " + booking.getBookingDate() + " thành công!");
        }
    }

    @Override
    public void edit(String id) {
        System.out.println("Chức năng chỉnh sửa booking không yêu cầu ở Task 6.");
    }

    @Override
    public List<Booking> getAll() {
        return new ArrayList<>(bookings);
    }

    public Queue<Booking> getBookingQueue() {
        return new LinkedList<>(bookings);
    }

    public Booking findByCode(String code) {
        return bookings.stream()
                .filter(b -> b.getBookingCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}