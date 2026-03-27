package JDL.Biblioteca.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tedt_editora")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Editora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Editora_PK")
    private Integer idEditoraPk;

    @Column(name = "TEDT_dsNomeEditora", nullable = false)
    private String nomeEditora;

    @Column(name = "TEDT_inTipo", nullable = false)
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "TDER_LIVRO_id_LivroPK", nullable = false)
    private Livro livro;
}
