package com.app.javapj.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface IReponsitory<T> {
    void add(T entity);
    void delete(String id);
    void update(T entity);
    T get(String id);
    boolean exists(String id);
}
