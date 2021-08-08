package com.anderson.ToDo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anderson.ToDo.domain.ToDo;
import com.anderson.ToDo.services.ToDoService;

@RestController
@RequestMapping(value = "/ToDos")
public class ToDoResource {

	@Autowired
	private ToDoService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ToDo> findById(@PathVariable Integer id){
		ToDo obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
