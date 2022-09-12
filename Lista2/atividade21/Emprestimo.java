package Lista2.atividade21;

public class Emprestimo {
    private String tempo;
    private String multa;
    
    public String getTempo() {
        return tempo;
    }
    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
    public String getMulta() {
        return multa;
    }
    public void setMulta(String multa) {
        this.multa = multa;
    }
    public Emprestimo(String tempo, String multa) {
        this.tempo = tempo;
        this.multa = multa;
    }
    
    
}
