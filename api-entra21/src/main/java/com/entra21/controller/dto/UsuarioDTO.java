package com.entra21.controller.dto;


import com.entra21.model.Usuario;

import java.util.List;
import java.util.stream.Collectors;

//  DTO = Data Transfer Object
public class UsuarioDTO {

    private String nome;
    private String email;

    public UsuarioDTO(Usuario usuario){

        this.nome = usuario.getNome();
        this.email = usuario.getEmail();

    }







    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static List<UsuarioDTO> converter(List<Usuario> usuarios){

        return usuarios.stream().map(UsuarioDTO::new).collect(Collectors.toList());

    }





}
