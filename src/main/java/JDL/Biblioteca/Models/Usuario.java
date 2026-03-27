package JDL.Biblioteca.Models;

import JDL.Biblioteca.Enums.NivelPerm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tusu_usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Usuario_PK")
    private Integer idUsuarioPk;

    @Column(name = "TUSU_nrMatricula", nullable = false)
    private Integer matricula;

    @Column(name = "TUSU_nmNome", nullable = false)
    private String nome;

    @Column(name = "TUSU_nrTelefone", nullable = false)
    private String telefone;

    @Column(name = "TUSU_nrSerie", nullable = false)
    private String serie;

    @Column(name = "TUSU_dsEmail", nullable = false)
    private String email;

    @Column(name = "TUSU_dsNivelPerm", nullable = false)
    private String nivelPerm;

    @Column(name = "TUSU_dsSenha", nullable = false)
    private String senha;

    @ManyToOne
    @JoinColumn(name = "TTEP_Emprestimo_id_Emprestimo_PK", nullable = false)
    private Emprestimo emprestimo;

    @ManyToOne
    @JoinColumn(name = "TTSU_TipoUsuario_id_TipoUsuario_PK", nullable = false)
    private TipoUsuario tipoUsuario;
}