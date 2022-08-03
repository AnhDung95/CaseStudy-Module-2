package model;

import java.util.List;

public interface Storage<T> {
    void store(T t);
    List<T> findAll();
}
