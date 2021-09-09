package com.entra21.repositories;

import com.entra21.model.Categoria;
import com.entra21.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}
