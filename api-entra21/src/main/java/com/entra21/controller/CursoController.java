package com.entra21.controller;

import com.entra21.controller.dto.*;
import com.entra21.model.Categoria;
import com.entra21.model.Curso;
import com.entra21.model.Topico;
import com.entra21.repositories.CategoriaRepository;
import com.entra21.repositories.CursoRepository;
import org.hibernate.hql.spi.id.local.LocalTemporaryTableBulkIdStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

    @Autowired
    CategoriaRepository categoriaRepository;

    @GetMapping
    public List<CursoDTO> litarTudo()
    {
        List<Curso> cursoList = cursoRepository.findAll();
        return CursoDTO.converter(cursoList);

    }


  @PostMapping
    public ResponseEntity<CursoDTO> gravar(@RequestBody @Valid CursoFORM cursoFORM, UriComponentsBuilder uriComponentsBuilder){


        Curso curso = cursoFORM.converter(categoriaRepository);
        cursoRepository.save(curso);


        // mostrar a devida resposta, ex 201

        URI uri = uriComponentsBuilder.path("/cursos/{id}").buildAndExpand(curso.getId()).toUri();

        return ResponseEntity.created(uri).body(new CursoDTO(curso));



    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<CursoDTO> atualizar(@PathVariable  Long id, @RequestBody @Valid AtualizarCursoDTO form){

        Optional<Curso> cursoPesquisado = cursoRepository.findById(id);


        if(cursoPesquisado.isPresent()){

            Curso curso = form.atualizar(id, cursoRepository);
            return ResponseEntity.ok(new CursoDTO(curso));



        }

        return ResponseEntity.notFound().build();



    }



    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> remover(@PathVariable Long id){

        Optional<Curso> curso = cursoRepository.findById(id);
        if(curso.isPresent()){

            cursoRepository.deleteById(id);
            return ResponseEntity.ok().build();


        }

        return ResponseEntity.notFound().build();


    }


}
