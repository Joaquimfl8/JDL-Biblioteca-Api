package JDL.Biblioteca.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbts_status")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Status_PK")
    private Integer idStatusPk;

    @Column(name = "TBTS_dsStatus", nullable = false)
    private String dsStatus;

    @Column(name = "TBTS_dtAtualizacao", nullable = false)
    private String dtAtualizacao;
}

