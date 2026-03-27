package JDL.Biblioteca.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ttsu_tipousuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_TipoUsuario_PK")
    private Integer idTipoUsuarioPk;

    @Column(name = "TTSU_dsTipoPermissao", nullable = false)
    private String tipoPermissao;

    @Column(name = "TTSU_cdPermissao", nullable = false)
    private String cdPermissao;
}
