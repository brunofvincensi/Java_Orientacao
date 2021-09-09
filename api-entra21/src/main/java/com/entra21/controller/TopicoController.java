package com.entra21.controller;

import com.entra21.model.Curso;
import com.entra21.model.Topico;
import com.entra21.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicoController {

    @RequestMapping("/topicos")
    @ResponseBody

    public List<Topico> listarTudo(){
        Curso c = new Curso();
        c.setId(19L);
        c.setNome("Spring da galera");

        Usuario u = new Usuario(2L, "Bruno", "Bruno@", "12345");

        Topico t = new Topico("duvida de como chamar o controller", "oi sou iniciante", u, c);

        return Arrays.asList(t,t,t,t);



    }




}
