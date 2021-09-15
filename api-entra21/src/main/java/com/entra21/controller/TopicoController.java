package com.entra21.controller;

import com.entra21.controller.dto.TopicoDTO;
import com.entra21.controller.dto.TopicoForm;
import com.entra21.model.Categoria;
import com.entra21.model.Curso;
import com.entra21.model.Topico;
import com.entra21.model.Usuario;
import com.entra21.repositories.CursoRepository;
import com.entra21.repositories.TopicoRepository;
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

  @GetMapping
  public List<TopicoDTO> listarTopico(String nomeCuro){

      List<Topico> topicos;

      if(nomeCuro == null){

          topicos = topicoRepository.findAll();

      }
      else{
          topicos = topicoRepository.carregarPorNomeDoCurso(nomeCuro);

      }


      return TopicoDTO.converter(topicos);

  }

    @PostMapping
    public ResponseEntity<TopicoDTO> gravar(@RequestBody @Valid TopicoForm topicoForm, UriComponentsBuilder uriComponentsBuilder){

      Topico topico = topicoForm.converter(cursoRepository);
        topicoRepository.save(topico);

        URI uri = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();

        return ResponseEntity.created(uri).body(new TopicoDTO(topico));




    }



    @PutMapping("/{id}")
    @Transactional
    public void atualizar(@PathVariable  Long id, @RequestBody String mensagem){

        Optional<Topico> mensagemBuscada = topicoRepository.findById(id);


        if(mensagemBuscada.isPresent()){

            Topico t = topicoRepository.getById(id);
            t.setMensagem(mensagem);

            topicoRepository.save(t);
        }



    }

}
