package br.com.eshley.api_cadastro_usuarios.repository;

import br.com.eshley.api_cadastro_usuarios.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
