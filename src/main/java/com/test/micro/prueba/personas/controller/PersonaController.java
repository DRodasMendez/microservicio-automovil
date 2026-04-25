
package com.test.micro.prueba.personas.controller;

import com.test.micro.prueba.personas.entity.Persona;
import com.test.micro.prueba.personas.service.PersonaService;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/personas")
public class PersonaController implements Serializable{
    
    @Autowired
    PersonaService personaservice;
    
    //@CrossOrigin(origins = "https://personasfront.onrender.com")
    @CrossOrigin(origins = "http://localhost:5174")
    @GetMapping()
    public List<Persona> devolverGente(){
        return personaservice.devolverLista();
    }
}
