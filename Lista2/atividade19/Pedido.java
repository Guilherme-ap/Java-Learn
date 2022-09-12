package Lista2.atividade19;

public class Pedido extends Produtos {
    
    private Double dinheiro;
    private String cartao;
    private String cheque;
    private Integer    quantidade;
    public Double getDinheiro() {
        return dinheiro;
    }
    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }
    public String getCartao() {
        return cartao;
    }
    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    public String getCheque() {
        return cheque;
    }
    public void setCheque(String cheque) {
        this.cheque = cheque;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
}
