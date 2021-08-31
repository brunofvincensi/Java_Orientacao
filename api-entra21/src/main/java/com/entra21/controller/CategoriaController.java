package com.entra21.controller;

import com.entra21.model.Categoria;
import com.entra21.model.Curso;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;


@Controller
public class CategoriaController {



    @RequestMapping("/categorias")
    @ResponseBody
    public List<Categoria> listarTudo(){


        return Arrays.asList(new Categoria(1L, "Produto higiene"),
                new Categoria(2L, "Produtor limpeza"));
    }
}
