package com.entra21.controller.dto;

import com.entra21.model.Curso;
import com.entra21.model.Topico;
import com.entra21.repositories.CursoRepository;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AtualizarCursoDTO {

    @NotNull
    @NotEmpty
    @Length(min = 10)
    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso atualizar(Long id, CursoRepository cursoRepository) {

        Curso curso = cursoRepository.getById(id);
        curso.setNome(this.nome);


        return curso;
    }
}
