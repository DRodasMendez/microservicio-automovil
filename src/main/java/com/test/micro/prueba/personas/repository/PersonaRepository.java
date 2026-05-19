package com.test.micro.prueba.personas.repository;


import com.test.micro.prueba.personas.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Laptop
 */
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
    
    
}
