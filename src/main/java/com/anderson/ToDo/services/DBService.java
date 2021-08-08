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
		ToDo t2 = new ToDo(null, "Ler", "Ler livro sobre investimentos financeiros",
				LocalDateTime.parse("08/08/2021 08:47", formatter), true);
		ToDo t3 = new ToDo(null, "Estudar", "Praticar exercicios de java",
				LocalDateTime.parse("07/08/2021 08:50", formatter), false);
		ToDo t4 = new ToDo(null, "Meditar", "Meditar durante 15 minutos",
				LocalDateTime.parse("07/08/2021 20:17", formatter), true);

		toDoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}

}
