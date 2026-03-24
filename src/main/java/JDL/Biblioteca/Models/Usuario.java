package JDL.Biblioteca.Models;

import JDL.Biblioteca.Enums.NivelPerm;
import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TTSU_USUARIO")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, lenght = 100)
    private String matricula;
    private String nome;
    private String numero;
    private String serie;
    private String email;
    private NivelPerm nivelPerm;
    private String senha;


    public Usuario(int id, String matricula, String nome, String numero, 
                   String serie, String email, NivelPerm nivelPerm, String senha) {

        //super(id);
        this.id = id
        this.matricula = matricula;
        this.nome = nome;
        this.numero = numero;
        this.serie = serie; 
        this.email = email; 
        this.nivelPerm = nivelPerm; 
        this.senha = senha;
    }
}