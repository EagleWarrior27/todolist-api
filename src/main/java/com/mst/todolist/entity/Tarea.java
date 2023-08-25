package com.mst.todolist.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tareas")
public class Tarea {
    @Id
    @Column(name = "tarea_id")
    @GenericGenerator(name = "TAREAS_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = @org.hibernate.annotations.Parameter(name = "sequence_name", value = "SEQ_TAREAS"))
    @GeneratedValue(generator = "TAREAS_generator")
    private Long tareaId;

    private String descripcion;

    private String estado;

    @Column(name = "fecha_vencimiento")
    private Date fechaVencimiento;

    public Long getTareaId() { return tareaId; }

    public void setTareaId(Long tareaId) { this.tareaId = tareaId; }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaVencimiento() { return fechaVencimiento; }

    public void setFechaVencimiento(Date fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }
}
