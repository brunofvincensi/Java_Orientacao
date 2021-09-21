package com.entra21.controller;

import com.entra21.controller.dto.*;
import com.entra21.model.Categoria;
import com.entra21.model.Curso;
import com.entra21.model.Topico;
import com.entra21.model.Usuario;
import com.entra21.repositories.CursoRepository;
import com.entra21.repositories.RespostaRepository;
import com.entra21.repositories.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
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
@RequestMapping("/topicos")
public class TopicoController {


    @Autowired
    TopicoRepository topicoRepository;

  /*  @GetMapping
    public List<TopicoDTO> listarTopico(){

        List<Topico> topicos = topicoRepository.findAll();

        return TopicoDTO.converter(topicos);

    }


*/

    @Autowired
    CursoRepository cursoRepository;

    @Autowired
    RespostaRepository respostaRepository;



  @GetMapping
  public List<TopicoDTO> listarTopico(String nomeCuro) {

      List<Topico> topicos;

      if (nomeCuro == null) {

          topicos = topicoRepository.findAll();

      } else {
          topicos = topicoRepository.carregarPorNomeDoCurso(nomeCuro);


      }


      return TopicoDTO.converter(topicos);
  }







    @PostMapping
    public ResponseEntity<TopicoDTO> gravar(@RequestBody @Valid TopicoForm topicoForm, UriComponentsBuilder uriComponentsBuilder){

      Topico topico = topicoForm.converter(cursoRepository);
        topicoRepository.save(topico);

        // mostrar a devida resposta, ex 201

        URI uri = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();

        return ResponseEntity.created(uri).body(new TopicoDTO(topico));




    }



    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<TopicoDTO> atualizar(@PathVariable  Long id, @RequestBody @Valid AtualizarDadoDTO form){

        Optional<Topico> topicoPesquisado = topicoRepository.findById(id);


        if(topicoPesquisado.isPresent()){

            Topico topico = form.atualizar(id, topicoRepository);
            return ResponseEntity.ok(new TopicoDTO(topico));



        }

        return ResponseEntity.notFound().build();



    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> remover(@PathVariable Long id){

      Optional<Topico> topico = topicoRepository.findById(id);
      if(topico.isPresent()){

          topicoRepository.deleteById(id);
          return ResponseEntity.ok().build();


      }

      return ResponseEntity.notFound().build();


    }

    @GetMapping ( "/{id}" )
    public ResponseEntity <DetalheTopicoDTO> redirecionamento (@PathVariable Long id) {
        Optional <Topico> topicoPesquisado = topicoRepository .findById (id) ;
        if (topicoPesquisado.isPresent ()) {
            return ResponseEntity. ok ( new DetalheTopicoDTO (topicoPesquisado.get())) ;
        }
        return ResponseEntity. notFound () .build () ;
    }





}
