package Lista2.atividade20;

public class Agenda {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Agenda(String nome) {
        this.nome = nome;
    }
    
    public void imprimir(){
        System.out.print("A area do triangulo mede "+this.getNome()+" \n");
    }
    
    }
