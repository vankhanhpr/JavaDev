package com.app.javapj.reponsitory.impl;

import com.app.javapj.reponsitory.IReponsitory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public class Reponsitory<T> implements IReponsitory<T> {


    @Override
    public void add(T entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(T entity) {

    }

    @Override
    public T get(String id) {
        return null;
    }

    @Override
    public boolean exists(String id) {
        return false;
    }
}
