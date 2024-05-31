package com.mst.todolist.services;

import com.mst.todolist.entity.Tarea;
import com.mst.todolist.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TareaServiceImpl implements TareaService {
    @Autowired
    private TareaRepository tareaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Tarea> findAll() {
        return tareaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Tarea> findById(Long id) {
        return tareaRepository.findById(id);
    }

    @Override
    @Transactional
    public Tarea save(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        tareaRepository.deleteById(id);
    }
}
