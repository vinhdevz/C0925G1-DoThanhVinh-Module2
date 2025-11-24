// Case_Study/repository/BookingRepository.java
package Case_Study.repository;

import Case_Study.entity.Booking;
import Case_Study.util.BookingComparator;

import java.util.*;

public class BookingRepository implements Repository<Booking> {

    private static final Set<Booking> bookings = new TreeSet<>(new BookingComparator());

    static {
        bookings.add(new Booking("BK-0001", "2025-11-20", "2025-12-01", "2025-12-05", "KH-0001", "SVVL-0001"));
        bookings.add(new Booking("BK-0002", "2025-11-21", "2025-12-03", "2025-12-10", "KH-0002", "SVHO-0001"));
        bookings.add(new Booking("BK-0003", "2025-11-19", "2025-12-01", "2025-12-08", "KH-0003", "SVRO-0001"));
        bookings.add(new Booking("BK-0004", "2025-11-22", "2025-12-01", "2025-12-03", "KH-0004", "SVVL-0002"));
        bookings.add(new Booking("BK-0005", "2025-11-18", "2025-11-25", "2025-11-30", "KH-0005", "SVHO-0002"));
    }

    @Override
    public void display() {
        if (bookings.isEmpty()) {
            System.out.println("Không có booking nào!");
            return;
        }
        System.out.println("════════════════════════════════ DANH SÁCH BOOKING ════════════════════════════════");
        for (Booking b : bookings) {
            System.out.println(b);
        }
        System.out.println("══════════════════════════════════════════════════════════════════════════════════");
    }

    @Override
    public void add(Booking booking) {
        if (!bookings.add(booking)) {
            System.out.println("→ Booking " + booking.getBookingCode() + " đã tồn tại! Không thể thêm.");
        } else {
            System.out.println("→ Thêm booking " + booking.getBookingCode() + " thành công!");
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