package com.mst.todolist.controllers;

import com.mst.todolist.entity.Tarea;
import com.mst.todolist.services.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tareas")
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @GetMapping
    public ResponseEntity<List<Tarea>> readAll() {
        return ResponseEntity.ok(tareaService.findAll());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Tarea tarea) {
        return ResponseEntity.status(HttpStatus.CREATED).body(tareaService.save(tarea));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> read(@PathVariable(value = "id") Long id) {
        Optional<Tarea> tarea = tareaService.findById(id);

        if(!tarea.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(tarea);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Tarea tareaInfo, @PathVariable(value = "id") Long id) {
        Optional<Tarea> tarea = tareaService.findById(id);

        if(!tarea.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        tarea.get().setDescripcion(tareaInfo.getDescripcion());
        tarea.get().setEstado(tareaInfo.getEstado());

        return ResponseEntity.status(HttpStatus.CREATED).body(tareaService.save(tarea.get()));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        if(!tareaService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        tareaService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
