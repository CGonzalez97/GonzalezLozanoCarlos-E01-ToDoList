package com.ejercicio.todolist.servicios.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public class ServicioBaseImp <T, ID, R extends JpaRepository<T, ID>> implements ServicioBase<T, ID, R> {

    @Autowired
    R repositorio;

    @Override
    public T save(T t) {
        return null;
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.empty();
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public T edit(T t) {
        return null;
    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void deleteById(ID id) {

    }
}
