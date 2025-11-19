package Case_Study.repository;

import Case_Study.entity.Contact;

import java.util.List;

public interface Repository<T> {
    void display();

    void add(T item);

    void edit(T item);

    List<T> getAll();
}
