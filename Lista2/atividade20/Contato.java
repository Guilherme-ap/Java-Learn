package Lista2.atividade20;

public class Contato{

    private String endereco;
    private String dataNas;
    private String nome;
    private String email;
    private String telefone;

    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getDataNas() {
        return dataNas;
    }
    public void setDataNas(String dataNas) {
        this.dataNas = dataNas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Contato(String endereco, String dataNas, String nome, String email, String telefone) {
        this.endereco = endereco;
        this.dataNas = dataNas;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    
}
