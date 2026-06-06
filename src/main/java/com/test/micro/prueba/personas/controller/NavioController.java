
package com.test.micro.prueba.personas.controller;


import com.test.micro.prueba.personas.entity.Navio;
import com.test.micro.prueba.personas.service.NavioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/consultas")
public class NavioController {

    @Autowired
    private NavioService navioService;

    @PostMapping("/marina")
    public Navio guardar(@RequestBody Navio navio){
        return navioService.guardarNavio(navio);
    }

    @GetMapping("/marina")
    public List<Navio> consultaNavios() {
        return navioService.consultaNavios();
    }
}
