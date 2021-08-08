package com.anderson.ToDo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anderson.ToDo.domain.ToDo;
import com.anderson.ToDo.repositories.ToDoRepository;

@Service
public class DBService {

	@Autowired
	private ToDoRepository toDoRepository;

	public void instanciaBaseDeDados() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		ToDo t1 = new ToDo(null, "Estudar", "Estudar spring boot 2 e angular 11",
				LocalDateTime.parse("07/08/2021 16:53", formatter), false);

		toDoRepository.saveAll(Arrays.asList(t1));
	}

}
