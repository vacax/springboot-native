package edu.pucmm.eict.springbootnative.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Estudiante {

    @Id
    int id;
    String nombre;
    String carrera;
}
