package com.anderson.ToDo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anderson.ToDo.domain.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Integer>{

}
