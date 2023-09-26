package edu.pucmm.eict.springbootnative.repositorios;

import edu.pucmm.eict.springbootnative.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "estudiante")
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
