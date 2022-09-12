package Lista2.atividade21;

public class Livro {
    
    private Integer ano;
    private String autor;
    private String nomeLivro;
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getNomeLivro() {
        return nomeLivro;
    }
    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }
    public Livro(Integer ano, String autor, String nomeLivro) {
        this.ano = ano;
        this.autor = autor;
        this.nomeLivro = nomeLivro;
    }
    
    
}
