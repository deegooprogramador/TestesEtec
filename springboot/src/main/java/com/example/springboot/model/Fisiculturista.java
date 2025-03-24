package com.example.springboot.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;


public class Fisiculturista {
    @NotBlank
    private String nome;

    @NotBlank
    @Pattern(regexp = "Open|open|Classic|classic|Mens|mens", message = "As categorias disponíveis são: Open, Classic e Mens")
    private String categoria;

    @NotNull
    @Min(value = 70, message = "O peso mínimo é de 70kg")
    @Max(value = 90, message = "O peso máximo é de 90kg")
    private Integer peso;

    @NotNull
    @Min(value = 18, message = "A idade mínima é de 18 anos")
    @Max(value = 21, message = "A idade máxima é de 21 anos")
    private Integer idade;

    public Fisiculturista (String nome, String categoria, Integer peso, Integer idade){
        this.nome = nome;
        this.categoria = categoria;
        this.peso = peso;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}


