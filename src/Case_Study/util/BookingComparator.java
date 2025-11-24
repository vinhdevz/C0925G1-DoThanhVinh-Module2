package Case_Study.util;

import Case_Study.entity.Booking;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking b1, Booking b2) {
        return b1.getBookingDate().compareTo(b2.getBookingDate());
    }
}