package com.ejercicio.todolist.controladores;

import com.ejercicio.todolist.modelos.Tarea;
import com.ejercicio.todolist.servicios.TareaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller @RequiredArgsConstructor
public class TareaControler {

    final TareaServicio tareaServicio;

    //Visualizar
    @GetMapping("/")
    public String visualizacionGeneral(Model model){
        model.addAttribute("lista",tareaServicio.buscarOrdenadoPorFechaCad());
        return "index";
    }

    @GetMapping("/ingresarNuevo")
    public String mostrarFromulario(Model model){
        model.addAttribute("tarea",new Tarea());
        return "formularioIngreso";
    }

    @PostMapping("/insert")
    public String creado(@ModelAttribute("tarea")Tarea tarea){
        tareaServicio.save(tarea);
        return "redirect/";
    }





}
