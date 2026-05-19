
package com.test.micro.prueba.personas.repository;



import com.test.micro.prueba.personas.entity.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutomovilRepository extends JpaRepository<Automovil, Long> {
}