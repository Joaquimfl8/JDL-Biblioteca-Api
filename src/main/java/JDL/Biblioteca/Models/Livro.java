package JDL.Biblioteca.Models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Livro extends DbModel {

    private String titulo;
    private String autor;
    private String sinopse;
    private String capa;
    private String editora;
    private String edicao;
    private int ano;
    private int disponiveis;
    private int exemplares;
    private String genero;
    private String status;

    public Livro(int id, String titulo, String autor, String sinopse, String capa, 
                 String editora, String edicao, int ano, int disponiveis, 
                 int exemplares, String genero, String status) {
        
        super(id);
        
        this.titulo = titulo;
        this.autor = autor;
        this.sinopse = sinopse;
        this.capa = capa;
        this.editora = editora;
        this.edicao = edicao;
        this.ano = ano;
        this.disponiveis = disponiveis;
        this.exemplares = exemplares;
        this.genero = genero;
        this.status = status;
    }
}