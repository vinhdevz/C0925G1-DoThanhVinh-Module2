package Case_Study.service;

import java.util.List;

public interface Service<T> {
    void display();

    void add(T item);

    void edit(T item);

    List<T> getAll();
}
