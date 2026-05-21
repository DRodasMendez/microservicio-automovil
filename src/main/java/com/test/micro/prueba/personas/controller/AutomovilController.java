
package com.test.micro.prueba.personas.controller;

import com.test.micro.prueba.personas.entity.Automovil;
import com.test.micro.prueba.personas.service.AutomovilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/automoviles")
public class AutomovilController {

    @Autowired
    private AutomovilService automovilService;

    @GetMapping
    public List<Automovil> devolverAutos(){
        return automovilService.devolverAutos();
    }
@PostMapping()
public Automovil guardar(@RequestBody Automovil automovil){
    return automovilService.guardarAutomovil(automovil);
}
}