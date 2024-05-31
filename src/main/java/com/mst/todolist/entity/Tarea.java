package com.mst.todolist.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
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
    private String fechaVencimiento;
}
