
package com.test.micro.prueba.personas.service;


import com.test.micro.prueba.personas.entity.Automovil;
import com.test.micro.prueba.personas.repository.AutomovilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomovilService {

    @Autowired
    private AutomovilRepository automovilRepository;

    public List<Automovil> devolverAutos(){
        return automovilRepository.findAll();
    }
    public Automovil guardarAutomovil(Automovil automovil){
    return automovilRepository.save(automovil);
}
}