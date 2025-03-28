package com.example.provawagner.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Professor extends Pessoa{
    private String disciplina;
    private Integer idade;

    public Professor(String nome, Integer idade, String endereco, String telefone, String cpf, String email, String disciplina) {
         super(nome, idade, endereco, telefone, cpf, email);
         this.disciplina = disciplina;
    }

    @NotBlank
    public String getDisciplina() {
        return disciplina;
    }

    @NotNull
    @Min(20)
    @Max(70)
    public Integer getIdade() {
        return idade;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
