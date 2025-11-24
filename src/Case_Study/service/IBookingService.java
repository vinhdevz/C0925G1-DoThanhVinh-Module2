package Case_Study.service;

import Case_Study.entity.Booking;

import java.util.List;
import java.util.Queue;

public interface IBookingService extends Service<Booking> {
    void createContract();

    void editContract();

    void displayContracts();

    Queue<Booking> getQueueForContract();

    List<Booking> getAll();
}