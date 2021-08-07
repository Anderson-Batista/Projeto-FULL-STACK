package com.anderson.ToDo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anderson.ToDo.domain.ToDo;
import com.anderson.ToDo.repositories.ToDoRepository;

@SpringBootApplication
public class ToDoApplication implements CommandLineRunner{
	
	@Autowired
	private ToDoRepository toDoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ToDoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		ToDo t1 = new ToDo(null, "Estudar", "Estudar spring boot 2 e angular 11", LocalDateTime.parse("07/08/2021 16:53", formatter), false);
		
		toDoRepository.saveAll(Arrays.asList(t1));
	}

}
