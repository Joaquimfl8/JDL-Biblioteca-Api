package JDL.Biblioteca.Models;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "ttep_emprestimo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Emprestimo_PK")
    private Integer idEmprestimoPk;

    @Column(name = "TTEP_dtEmprestimo", nullable = false)
    private LocalDate dtEmprestimo;

    @Column(name = "TTEP_dtDevolucao", nullable = false)
    private LocalDate dtDevolucao;

    @Column(name = "TTEP_QtdiasEmprestados", nullable = false)
    private Integer qtdDiasEmprestados;

    @Column(name = "TTEP_PrecoDiaria", nullable = false)
    private Float precoDiaria;

    @Column(name = "TTEP_QtdiasAtrasados", nullable = false)
    private Integer qtdDiasAtrasados;

    @ManyToOne
    @JoinColumn(name = "TBTS_Status_id_Status_PK", nullable = false)
    private Status status;
}