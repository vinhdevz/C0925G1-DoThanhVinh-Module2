package Case_Study.service;

import Case_Study.entity.Booking;

import java.util.List;

public interface IBookingService {
    List<Booking> getAll();
    void add(Booking booking);
}
