package Case_Study.service;

import Case_Study.entity.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingService implements IBookingService{
    private static List<Booking> bookings = new ArrayList<>();

    @Override
    public List<Booking> getAll() {
        return bookings;
    }

    @Override
    public void add(Booking booking) {
        bookings.add(booking);
    }
}
