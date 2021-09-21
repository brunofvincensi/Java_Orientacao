package com.entra21.controller;


import com.entra21.controller.dto.*;
import com.entra21.model.Categoria;
import com.entra21.model.Topico;
import com.entra21.model.Usuario;
import com.entra21.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaRepository categoriaRepository;

 /*   @GetMapping
    @ResponseBody
    public List<Categoria> listar(){
        return categoriaRepository.findAll();
    }
*/


    @GetMapping
    public List<CategoriaDTO> litarTudo() {
        List<Categoria> categoriaList = categoriaRepository.findAll();
        return CategoriaDTO.converter(categoriaList);

    }


    @PostMapping
    public ResponseEntity<CategoriaDTO> gravar(@RequestBody @Valid Categoria categoria, UriComponentsBuilder uriComponentsBuilder) {

        categoriaRepository.save(categoria);

        // mostrar a devida resposta, ex 201

        URI uri = uriComponentsBuilder.path("/categoria/{id}").buildAndExpand(categoria.getId()).toUri();

        return ResponseEntity.created(uri).body(new CategoriaDTO(categoria));


    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<CategoriaDTO> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizarCatDTO form) {

        Optional<Categoria> categoriaPesquisado = categoriaRepository.findById(id);


        if (categoriaPesquisado.isPresent()) {

            Categoria categoria = form.atualizar(id, categoriaRepository);
            return ResponseEntity.ok(new CategoriaDTO(categoria));


        }

        return ResponseEntity.notFound().build();


    }


    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> remover(@PathVariable Long id){

        Optional<Categoria> categoria = categoriaRepository.findById(id);
        if(categoria.isPresent()){

            categoriaRepository.deleteById(id);
            return ResponseEntity.ok().build();


        }

        return ResponseEntity.notFound().build();


    }



}
