package com.anderson.ToDo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anderson.ToDo.domain.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Integer>{

	@Query("SELECT obj FROM ToDo obj WHERE obj.finalizado = false ORDER BY obj.dataParaFinalizar")
	List<ToDo> findAllOpen();

}
