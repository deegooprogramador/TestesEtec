package com.example.provawagner.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Aluno extends Pessoa{
    private String matricula;
    private Integer idade;

    public Aluno(String nome, Integer idade, String endereco, String telefone, String cpf, String email, String matricula) {
        super(nome, idade, endereco, telefone, cpf, email);
        this.matricula = matricula;
    }

    @NotBlank
    public String getMatricula() {
        return matricula;
    }

    @NotNull
    @Min(12)
    @Max(18)
    public Integer getIdade() {
        return idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}