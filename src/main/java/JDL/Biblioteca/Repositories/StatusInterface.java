package JDL.Biblioteca.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JDL.Biblioteca.Models.Status;

@Repository
public interface StatusInterface extends JpaRepository<Status, Integer> { 

}