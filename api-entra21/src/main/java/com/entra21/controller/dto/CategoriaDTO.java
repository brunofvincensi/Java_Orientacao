package com.entra21.controller.dto;

import com.entra21.model.Categoria;
import com.entra21.model.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class CategoriaDTO {

    private String descricao;


    public CategoriaDTO(Categoria categoria) {
        this.descricao = categoria.getDescricao();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public static List<CategoriaDTO> converter(List<Categoria> categorias){

        return categorias.stream().map(CategoriaDTO::new).collect(Collectors.toList());

    }









}
