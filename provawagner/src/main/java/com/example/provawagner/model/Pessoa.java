package com.example.provawagner.model;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String email;

    public Pessoa(String nome, Integer idade, String endereco, String telefone, String cpf, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
    }

    @NotBlank
    public String getNome() {
        return nome;
    }

    @NotBlank
    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    @NotBlank
    @CPF
    public String getCpf() {
        return cpf;
    }

    @Email
    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

