package JDL.Biblioteca.Models;

import JDL.Biblioteca.Enums.NivelPerm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TTSU_USUARIO")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String matricula;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100)
    private String numero;

    @Column(nullable = false, length = 100)
    private String serie;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 100)
    private NivelPerm nivelPerm;

    @Column(nullable = false, length = 100)
    private String senha;


    public Usuario(int id, String matricula, String nome, String numero, 
                   String serie, String email, NivelPerm nivelPerm, String senha) {

        //super(id);
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.numero = numero;
        this.serie = serie; 
        this.email = email; 
        this.nivelPerm = nivelPerm; 
        this.senha = senha;
    }
}