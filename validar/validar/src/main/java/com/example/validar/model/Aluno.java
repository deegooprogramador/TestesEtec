package com.example.validar.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class Aluno {

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, message = "Nome com pelo menos 3 caracteres")
    private String nome;

    @NotNull(message = "A idade é obrigatória")
    @Min(value = 18, message = "A idade mínima é 18 anos")
    private Integer idade;

    @NotBlank(message = "O Email é obrigatório")
    @Email(message = "O Email deve ser válido")
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 6, max = 12)
    private String senha;

    public Aluno(String nome, Integer idade, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
    }
    //separar
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //separar
    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    //separar
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //separar
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
