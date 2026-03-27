package JDL.Biblioteca.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "taut_autor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTAUT_Autor")
    private Integer idAutor;

    @Column(name = "TAUT_dsNomeAutor", nullable = false)
    private String nomeAutor;

    @Column(name = "TAUT_dsSobrenome", nullable = false)
    private String sobrenome;
}
