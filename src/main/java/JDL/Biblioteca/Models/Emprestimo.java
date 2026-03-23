package JDL.Biblioteca.Models;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Emprestimo extends DbModel {

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private int qtDiasEmprestados;
    private double precoDiaria;
    private int qtDiasAtrasados;

    public Emprestimo(int id, LocalDate dataEmprestimo, LocalDate dataDevolucao, 
                      int qtDiasEmprestados, double precoDiaria, int qtDiasAtrasados) {
        
        super(id);
        
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.qtDiasEmprestados = qtDiasEmprestados;
        this.precoDiaria = precoDiaria;
        this.qtDiasAtrasados = qtDiasAtrasados;
    }
}