package JDL.Biblioteca.Models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Biblioteca extends DbModel {

    private String nome;
    private String telefone;
    private String email;
    private String cnpj;
    private String endereco;

    public Biblioteca(int id, String nome, String telefone, String email, String cnpj, String endereco) {
        
        super(id);
        
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }
}