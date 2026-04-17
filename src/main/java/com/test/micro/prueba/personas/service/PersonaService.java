
package com.test.micro.prueba.personas.service;

import com.test.micro.prueba.personas.entity.Persona;
import com.test.micro.prueba.personas.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepository personaRepository;
    
    
    public List<Persona> devolverLista(){
        return personaRepository.findAll();
    }
}
