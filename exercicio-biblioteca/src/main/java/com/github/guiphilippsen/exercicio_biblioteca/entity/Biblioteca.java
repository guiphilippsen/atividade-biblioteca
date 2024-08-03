package com.github.guiphilippsen.exercicio_biblioteca.entity;

public class Biblioteca {
    private Long id;
    private String endereco;
    private String telefone;

    public Biblioteca(long id, String endereco, String telefone) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
