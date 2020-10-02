package com.ejercicio.todolist.utiles;

import com.ejercicio.todolist.modelos.Tarea;

import java.util.Comparator;

public class CompararPorFechaCad implements Comparator<Tarea> {


    @Override
    public int compare(Tarea o1, Tarea o2) {
        return o1.getFechaCad().compareTo(o2.getFechaCad());
    }
}
