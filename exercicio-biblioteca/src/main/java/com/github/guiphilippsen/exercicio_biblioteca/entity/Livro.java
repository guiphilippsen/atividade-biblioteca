package com.github.guiphilippsen.exercicio_biblioteca.entity;

public class Livro {
    private Long id;
    private String titulo;
    private String ano_publicacao;
    private String autor;

    public Livro(long id, String titulo, String ano_publicacao, String autor) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(String ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
