package com.example.springboot.controller;

import com.example.springboot.model.Fisiculturista;

import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/ListarFis")
public class FisiculturistaController {
    
    private List<Fisiculturista> fisiculturistas = new ArrayList<>();

    @PostMapping
    public Fisiculturista fisiculturistanomesocial(@RequestBody @Valid Fisiculturista fisiculturista) {
        fisiculturistas.add(fisiculturista);
        return fisiculturista;
    }

    @GetMapping
    public List<Fisiculturista> listarFisiculturistas(){
        return fisiculturistas;
    }

    
}
