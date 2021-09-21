package com.entra21.controller.dto;

import com.entra21.model.Categoria;
import com.entra21.model.Curso;
import com.entra21.model.Usuario;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CursoDTO {

    private String nome;
    @OneToMany(mappedBy = "topico")
    private List<Curso> categorias = new ArrayList<>();

    public CursoDTO(Curso curso) {
        this.nome = curso.getNome();
      //  this.categorias = curso.getCategorias();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public static List<CursoDTO> converter(List<Curso> cursos){

        return cursos.stream().map(CursoDTO::new).collect(Collectors.toList());

    }
}
