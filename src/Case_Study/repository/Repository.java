package Case_Study.repository;

import java.util.List;

public interface Repository<T> {
    void display();

    void add(T item);

    void edit(String id);

    List<T> getAll();
}
