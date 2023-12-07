package com.app.javapj.reponsitory.impl;

import com.app.javapj.reponsitory.IReponsitory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;
import java.util.List;

public class Reponsitory<T, ID extends Serializable> implements IReponsitory<T, ID> {

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public List<T> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends T> List<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public T saveAndFlush(T t) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<T> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }
}
