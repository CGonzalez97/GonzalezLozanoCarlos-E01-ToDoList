package com.ejercicio.todolist.servicios;

import com.ejercicio.todolist.modelos.Tarea;
import com.ejercicio.todolist.repositorios.TareaRepositorio;
import com.ejercicio.todolist.servicios.base.ServicioBaseImp;
import com.ejercicio.todolist.utiles.CompararPorFechaCad;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service @RequiredArgsConstructor
public class TareaServicio extends ServicioBaseImp<Tarea, Long, TareaRepositorio> {

    final TareaRepositorio tareaRepositorio;
    private Comparator<Tarea> CompararPorFechaCad;

    public List<Tarea> buscarOrdenadoPorFechaCad(){
        List<Tarea> lista=this.findAll().stream().sorted(CompararPorFechaCad).collect(Collectors.toList());
        return lista;
    }



}
