package com.entra21.controller;


import com.entra21.controller.dto.CategoriaDTO;
import com.entra21.controller.dto.UsuarioDTO;
import com.entra21.model.Categoria;
import com.entra21.model.Usuario;
import com.entra21.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
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
    public List<CategoriaDTO> litarTudo()
    {
        List<Categoria> categoriaList = categoriaRepository.findAll();
        return CategoriaDTO.converter(categoriaList);

    }



    @PostMapping
    public void cadastrar(@RequestBody Categoria categoria){
        categoriaRepository.save(categoria);
    }

@PutMapping("/{id}")
@Transactional
    public void atualizar(@PathVariable  Long id, @RequestBody String descricao){

        Optional<Categoria> categoriaBuscada = categoriaRepository.findById(id);


        if(categoriaBuscada.isPresent()){

            Categoria c = categoriaRepository.getById(id);
            c.setDescricao(descricao);

            categoriaRepository.save(c);
        }



}

@DeleteMapping("/{id}")
    @Transactional
    public void  excluir(@PathVariable Long id){

        categoriaRepository.deleteById(id);

}



}
