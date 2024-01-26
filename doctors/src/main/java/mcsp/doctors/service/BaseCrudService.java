package mcsp.doctors.service;

import java.util.List;

public interface BaseCrudService<T> {

    T create(T t);

    T update(T t);

    T getById(Long id);

    List<T> getAll();

    void delete(Long id);

}
