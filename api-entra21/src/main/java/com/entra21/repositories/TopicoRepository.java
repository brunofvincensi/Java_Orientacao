package com.entra21.repositories;

import com.entra21.model.Curso;
import com.entra21.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

     List <Topico> findByCursoNome (String nomeCurso) ;
     /* documentacao spring sobre querys https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods
*  */
     @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso  ")
     List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso")String nomeCuro);





   // List<Topico>
}
