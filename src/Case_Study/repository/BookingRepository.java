package Case_Study.repository;

import Case_Study.entity.Booking;
import Case_Study.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository implements IBookingRepository {

    private static final List<Booking> bookings = new ArrayList<>();

    static {
        bookings.add(new Booking("B001", "2025-01-02", "2025-01-05", "2025-01-07", "C001", "SV001"));
        bookings.add(new Booking("B002", "2025-02-10", "2025-02-12", "2025-02-14", "C002", "SV002"));
    }


    @Override
    public void create() {
        Booking newBooking = new Booking("B003", "2025-03-01", "2025-03-03", "2025-03-05", "C003", "SV003");
        bookings.add(newBooking);
        System.out.println("Booking created: " + newBooking);
    }

    @Override
    public void displayContact() {
//        System.out.println("---- Contact related to Bookings ----");
//        for (Contact contact : ) {
//            System.out.println(contact);
//        }
    }

    @Override
    public void display() {
        for (Booking b : bookings) {
            System.out.println(b);
        }
    }

    @Override
    public void add(Booking item) {
        if (item != null) {
            bookings.add(item);
        }
    }

    @Override
    public void edit(Booking item) {
        if (item == null) return;
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).getBookingCode().equals(item.getBookingCode())) {
                bookings.set(i, item);
                break;
            }
        }
    }

    @Override
    public List<Booking> getAll() {
        return new ArrayList<>(bookings);
    }


}
