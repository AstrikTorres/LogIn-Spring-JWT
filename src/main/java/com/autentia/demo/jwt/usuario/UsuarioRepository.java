package com.autentia.demo.jwt.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuariosModel, Long> {

	UsuariosModel findByUsername(String username);

}
