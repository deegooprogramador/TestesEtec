package com.example.validacao.controller;

import com.example.validacao.dto.UsuarioDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/usuarios")

public class UsuarioController {
    
    @PostMapping
    public ResponseEntity<String> cadatrarUsuario(@RequestBody @Valid UsuarioDTO usuarioDTO) {
        return ResponseEntity.ok("Usuário cadastrado com sucesso!");
    }
    
}
