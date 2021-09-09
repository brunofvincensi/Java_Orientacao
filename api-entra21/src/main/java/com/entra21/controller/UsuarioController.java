package com.entra21.controller;


import com.entra21.model.Categoria;
import com.entra21.model.Usuario;

import com.entra21.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;



    @RequestMapping
    @ResponseBody
    public List<Usuario> litarTudo()
    {
        return usuarioRepository.findAll();

    }

    @PostMapping
    public void cadastrar(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }



}
