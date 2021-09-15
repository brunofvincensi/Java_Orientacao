package com.entra21.controller.dto;

import com.entra21.model.Categoria;
import com.entra21.model.Curso;
import com.entra21.model.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class CursoDTO {

    private String nome;
    private String categoria;

    public CursoDTO(Curso curso) {
        this.nome = curso.getNome();

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

    public static List<CursoDTO> converter(List<Curso> cursos){

        return cursos.stream().map(CursoDTO::new).collect(Collectors.toList());

    }
}
