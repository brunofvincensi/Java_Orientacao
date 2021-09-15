package com.entra21.controller.dto;

import com.entra21.model.Curso;
import com.entra21.model.Topico;
import com.entra21.repositories.CursoRepository;
import com.entra21.repositories.TopicoRepository;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

// validacao com BEANVALIDATION

public class TopicoForm {

    @NotNull
    @NotEmpty
    @Length(min = 5) // cadastrar no minimo 5 caracteres
    private String titulo;

    @NotNull
    @NotEmpty
    @Length(min = 5)
    private String mensagem;

    @NotNull
    @NotEmpty
    private String nomeCurso;

    public  Topico converter(CursoRepository cursoRepository) {


        Curso curso = cursoRepository.findByNome(nomeCurso);

        return new Topico(titulo, mensagem, curso);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }


}
