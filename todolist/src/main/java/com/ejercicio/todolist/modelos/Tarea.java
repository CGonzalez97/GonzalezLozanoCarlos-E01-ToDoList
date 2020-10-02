package com.ejercicio.todolist.modelos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Tarea {

    @Id @GeneratedValue
    private long id;

    private String nombre;
    private String descripcion;
    private LocalDateTime fechaCre;
    private LocalDateTime fechaCad;

    public Tarea(String nombre, String descripcion, LocalDateTime fechaCre, LocalDateTime fechaCad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCre = fechaCre;
        this.fechaCad = fechaCad;
    }
}
