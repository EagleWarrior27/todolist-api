package com.mst.todolist.repository;

import com.mst.todolist.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {}
