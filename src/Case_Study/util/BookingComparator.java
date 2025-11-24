package Case_Study.util;

import Case_Study.entity.Booking;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking b1, Booking b2) {
        int startCmp = b1.getStartDate().compareTo(b2.getStartDate());
        if (startCmp != 0) return startCmp;
        return b1.getEndDate().compareTo(b2.getEndDate());
    }
}