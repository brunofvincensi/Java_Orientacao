package com.entra21.model;

import java.util.Objects;

public class Curso {

    private Long id;
    private String nome;
    private Categoria categoria;

    public Curso() {
    }

    public Curso(Long id, String nome, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Categoria getTexto() {
        return categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return id.equals(curso.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {

        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';

    }
}
