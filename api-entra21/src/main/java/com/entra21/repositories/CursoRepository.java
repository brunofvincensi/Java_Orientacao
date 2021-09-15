package com.entra21.repositories;

import com.entra21.model.Curso;
import com.entra21.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository  extends JpaRepository<Curso, Long> {

    Curso findByNome(String nome);
}
