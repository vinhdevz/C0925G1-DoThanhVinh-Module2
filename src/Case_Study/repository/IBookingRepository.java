package Case_Study.repository;

import Case_Study.entity.Booking;

public interface IBookingRepository extends Repository<Booking>{
    void create();
    void displayContact();
}
