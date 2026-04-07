package JDL.Biblioteca.Repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JDL.Biblioteca.Models.Usuario;

@Repository
public interface UsuarioInterface extends JpaRepository<Usuario, Integer> { 
    
    List<Usuario> findByNome(String nome);
    Optional<Usuario> findByEmail(String email);
}