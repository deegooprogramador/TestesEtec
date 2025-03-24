package com.example.validar.controller;

import com.example.validar.model.Aluno;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private List<Aluno> alunos = new ArrayList<>();
    
    @PostMapping
    public Aluno adicionarAluno(@RequestBody @Valid Aluno aluno) {
        alunos.add(aluno);
        return aluno;
    }

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunos;
    }
}

