package com.anderson.ToDo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anderson.ToDo.domain.ToDo;
import com.anderson.ToDo.repositories.ToDoRepository;

@Service
public class ToDoService {

	@Autowired
	private ToDoRepository repository;
	
	public ToDo findById(Integer id) {
		Optional<ToDo> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<ToDo> findAllOpen() {
		List<ToDo> list = repository.findAllOpen();
		return list;
	}

	public List<ToDo> findAllClose() {
		List<ToDo> list = repository.findAllClose();
		return list;
	}
	
}
