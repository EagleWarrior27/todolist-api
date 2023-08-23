package com.mst.todolist.services;

import com.mst.todolist.entity.Tarea;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface TareaService {
    public Iterable<Tarea> findAll();

    public Page<Tarea> findAll(Pageable pageable);

    public Optional<Tarea> findById(Long id);

    public Tarea save(Tarea tarea);

    public void deleteById(Long id);
}
