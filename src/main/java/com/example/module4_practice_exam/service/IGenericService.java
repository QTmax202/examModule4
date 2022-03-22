package com.example.module4_practice_exam.service;

import java.util.Optional;

public interface IGenericService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void save(T t);

    void remove(Long id);
}
