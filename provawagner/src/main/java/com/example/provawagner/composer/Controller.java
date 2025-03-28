package com.example.provawagner.composer;

import com.example.provawagner.model.Aluno;
import com.example.provawagner.model.Professor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/escola")
public class Controller {
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();

    @PostMapping("/aluno")
    public ResponseEntity<Aluno> createAluno(@RequestBody Aluno aluno) {
        alunos.add(aluno);
        return ResponseEntity.ok(aluno);
    }

    @PostMapping("/professor")
    public ResponseEntity<Professor> createProfessor(@RequestBody Professor professor) {
        professores.add(professor);
        return ResponseEntity.ok(professor);
    }

    @GetMapping("/aluno")
    public ResponseEntity<List<Aluno>> getAlunos() {
        return ResponseEntity.ok(alunos);
    }

    @GetMapping("/professor")
    public ResponseEntity<List<Professor>> getProfessores() {
        return ResponseEntity.ok(professores);
    }
}
