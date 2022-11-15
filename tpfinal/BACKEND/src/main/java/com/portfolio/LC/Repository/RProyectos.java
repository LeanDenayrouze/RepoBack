
package com.portfolio.LC.Repository;

import com.portfolio.LC.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyectos extends JpaRepository<Proyectos, Integer>{
    public Optional<Proyectos> findbyNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
