package com.ejercicio.todolist.repositorios;


import com.ejercicio.todolist.modelos.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepositorio extends JpaRepository<Tarea, Long> {
}
