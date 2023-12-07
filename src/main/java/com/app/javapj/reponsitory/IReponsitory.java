package com.app.javapj.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface IReponsitory<T ,ID extends Serializable>  extends JpaRepository<T, ID> {
}
