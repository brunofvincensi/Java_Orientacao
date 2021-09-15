package com.entra21.controller;

import com.entra21.controller.dto.CategoriaDTO;
import com.entra21.controller.dto.CursoDTO;
import com.entra21.model.Categoria;
import com.entra21.model.Curso;
import com.entra21.repositories.CategoriaRepository;
import com.entra21.repositories.CursoRepository;
import org.hibernate.hql.spi.id.local.LocalTemporaryTableBulkIdStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {



    @Autowired
    CursoRepository cursoRepository;

 /*   @GetMapping
    @ResponseBody
    public List<Categoria> listar(){
        return categoriaRepository.findAll();
    }
*/


    @GetMapping
    public List<CursoDTO> litarTudo()
    {
        List<Curso> cursoList = cursoRepository.findAll();
        return CursoDTO.converter(cursoList);

    }



    @PostMapping
    public void cadastrar(@RequestBody Curso curso){
        cursoRepository.save(curso);
    }


}
