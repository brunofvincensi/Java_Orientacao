package com.entra21.controller.dto;

import com.entra21.model.Categoria;
import com.entra21.model.Topico;
import com.entra21.repositories.CategoriaRepository;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AtualizarCatDTO {


    @NotNull
    @NotEmpty
    @Length(min = 10)
    private String descricao;




    public Categoria atualizar(Long id, CategoriaRepository categoriaRepository) {

        Categoria categoria = categoriaRepository.getById(id);
        categoria.setDescricao(this.descricao);


        return categoria;
    }
}
