package Case_Study.repository;

import Case_Study.entity.Booking;

import java.util.Queue;
import java.util.Set;

public interface IBookingRepository extends Repository<Booking>{
    Set<Booking> getBookingSet();
    Queue<Booking> getContractQueue();
}
