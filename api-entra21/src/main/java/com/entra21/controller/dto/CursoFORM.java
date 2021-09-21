package com.entra21.controller.dto;

import com.entra21.model.Categoria;
import com.entra21.model.Curso;
import com.entra21.model.Topico;
import com.entra21.repositories.CategoriaRepository;
import com.entra21.repositories.CursoRepository;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CursoFORM {


    @NotNull
    @NotEmpty
    @Length(min = 5)
    private String nome;

    @NotNull
    @NotEmpty
    private String nomeCategoria;




    public Curso converter(CategoriaRepository categoriaRepository) {

        Categoria categoria = categoriaRepository.findByNome(nomeCategoria);

        return new Curso(nome, categoria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
    }


