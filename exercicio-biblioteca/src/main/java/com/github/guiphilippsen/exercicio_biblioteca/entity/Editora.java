package com.github.guiphilippsen.exercicio_biblioteca.entity;

public class Editora {

    private Long id;
    private String nome;
    private String endereco;

    public Editora(long id, String nome, String endereco) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
