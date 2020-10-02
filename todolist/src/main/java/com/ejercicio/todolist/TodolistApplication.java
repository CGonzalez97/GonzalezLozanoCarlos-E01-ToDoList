package com.ejercicio.todolist;

import com.ejercicio.todolist.modelos.Tarea;
import com.ejercicio.todolist.servicios.TareaServicio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

	@Bean
	public CommandLineRunner app(TareaServicio tareaServicio) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {



				Tarea t1= new Tarea("Examen online de empresa","Examen del tema 4",
						LocalDateTime.of(2020, 9, 1, 15, 0),
						LocalDateTime.of(2020, 10, 1, 8, 0));
				/*t1.setNombre("Examen online de empresa");
				t1.setDescripcion("Examen del tema 4");
				t1.setFechaCre(LocalDateTime.of(2020, 9, 1, 15, 0));
				t1.setFechaCad(LocalDateTime.of(2020, 10, 1, 8, 0));*/
				tareaServicio.save(t1);

				Tarea t2= new Tarea();
				t2.setNombre("Examen online de empresa");
				t2.setDescripcion("Examen del tema 4");
				t2.setFechaCre(LocalDateTime.of(2020, 9, 6, 15, 0));
				t2.setFechaCad(LocalDateTime.of(2020, 10, 21, 8, 0));
				tareaServicio.save(t2);

				Tarea t3= new Tarea();
				t3.setNombre("Examen online de empresa");
				t3.setDescripcion("Examen del tema 4");
				t3.setFechaCre(LocalDateTime.of(2020, 9, 28, 15, 0));
				t3.setFechaCad(LocalDateTime.of(2020, 11, 3, 8, 0));
				tareaServicio.save(t3);

				//No inserta los datos, voy a hacer lo que pueda sin hacer comprobaciones




			}

		};
	}

}
