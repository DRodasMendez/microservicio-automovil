
package com.test.micro.prueba.personas.service;

import com.test.micro.prueba.personas.entity.Navio;
import com.test.micro.prueba.personas.repository.NavioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavioService {

    @Autowired
    private NavioRepository navioRepository;

    public List<Navio> consultaNavios() {
        return navioRepository.findAll();
    }
}